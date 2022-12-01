import java.util.ArrayList;

public class WateringCan {

    /**
     * Method to water a tile with a plant (to be moved to WateringCan class)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     */
    public void Water(ArrayList<Tile> array, int x) {
        if (array.get(x).getPlowState() == 0) { // NOT YET PLOWED
            System.out.println("Please plow this tile first before watering!");
        } else if (array.get(x).getSeedState() == 0) { // NO SEED PRESENT
            System.out.println("Please plant a seed onto this tile first before watering!");
        } else if (array.get(x).getWaterCount() <= array.get(x).getSeedInfo().getWater()
                || array.get(x).getWaterCount() < array.get(x).getSeedInfo().getBonusWater()
                        + array.get(x).getPlayerExp().getWaterBonus()
                        && array.get(x).getWateredToday() == 0) { // TLDR: if water count does not yet exceed the
                                                                  // maximum
            // number of
            // watering and has not yet been watered today
            array.get(x).setWaterCount(array.get(x).getWaterCount() + 1);
            array.get(x).setWateredToday(1);
            System.out.println("Tile watered successfully.");
            array.get(x).getPlayerExp().GainExp(0.5, array.get(x).getPlayerExp());
            ;
        } else if (array.get(x).getWaterCount() <= array.get(x).getSeedInfo().getWater()
                || array.get(x).getWaterCount() <= array.get(x).getSeedInfo().getBonusWater()
                        && array.get(x).getWateredToday() == 1) { // ALREADY WATERED
            System.out
                    .println("Tile has already been watered today. Please come again tomorrow to continute watering.");
        } else if (array.get(x).getWaterCount() > array.get(x).getSeedInfo().getWater()
                && array.get(x).getWaterCount() >= array.get(x).getSeedInfo().getBonusWater()) { // MAX AMOUNT REACHED
            System.out.println("You have reached the maximum amount that you can water this tile.");
        } else if (array.get(x).getSeedState() == 9) { // WITHERED PLANT PRESENT
            System.out.println(
                    "Sorry. There is still a withered plant present here in this tile. Please remove it first.");
        }
    }
}
