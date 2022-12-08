import java.util.ArrayList;

public class Fertilizer {
    private String output;

    /**
     * Method to Fertilize a Tile (to be moved to Fertilize class)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @param p     Player class; used to directly interact with the Ocoins variable
     *              of the player
     */
    public void Fertilize(ArrayList<Tile> array, int x, Player p) {
        if (array.get(x).getRockState() == 1) {
            output = "Please remove rock first before fertilizing!";
        } else if (array.get(x).getPlowState() == 0) { // NOT YET PLOWED
            output = "Please plow this tile first before fertilizing!";
        } else if (array.get(x).getSeedState() == 0) { // NO SEED PRESENT
            output = "Please plant a seed onto this tile first before fertilizing!";

        } else if (p.getOcoins() < 10) {
            output = "Sorry. You do not have enough Objectcoins to fertilize this tile.";
        } else if (array.get(x).getFertiCount() <= array.get(x).getSeedInfo().getFertilizer()
                || array.get(x).getFertiCount() < array.get(x).getSeedInfo().getBonusFertilizer()
                        + array.get(x).getPlayerExp().getFertiBonus()
                        && array.get(x).getFertilizedToday() == 0 && p.getOcoins() >= 10) { // TLDR: if fertilize count
                                                                                            // does not yet exceed the
            // maximum number of fertilizing and has not yet been
            // fertilized today
            array.get(x).setFertiCount(array.get(x).getFertiCount() + 1);
            array.get(x).setFertilizedToday(1);
            output = "Tile fertilized successfully.";
            p.setOcoins(p.getOcoins() - 10);
            output = "Deducted 10 Objectcoins from your Inventory. " + p.getOcoins() + " remaining.";
            array.get(x).getPlayerExp().GainExp(4, array.get(x).getPlayerExp());
        } else if (array.get(x).getFertiCount() <= array.get(x).getSeedInfo().getFertilizer()
                || array.get(x).getFertiCount() <= array.get(x).getSeedInfo().getBonusFertilizer()
                        && array.get(x).getSeedInfo().getFertilizer()
                                + array.get(x).getSeedInfo().getBonusFertilizer() != 0
                        && array.get(x).getFertilizedToday() == 1) { // ALREADY FERTILIZED
            output = "Tile has already been fertilized today. Please come again tomorrow to continue fertilizing.";
        } else if (array.get(x).getFertiCount() > array.get(x).getSeedInfo().getFertilizer()
                && array.get(x).getFertiCount() >= array.get(x).getSeedInfo().getBonusFertilizer()) { // MAX AMOUNT
                                                                                                      // REACHED
            output = "You have reached the maximum amount that you can fertilize this tile.";
        } else if (array.get(x).getSeedState() == 9) {
            output = "Sorry. There is still a withered plant present here in this tile. Please remove it first.";
        }
        WindowOutputGui outputGui = new WindowOutputGui(output);
    }

}
