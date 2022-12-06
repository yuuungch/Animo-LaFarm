import java.util.ArrayList;

public class ShovelTool {

    /**
     * Method to remove withered plants from tiles (to be moved to Shovel class)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @param p     Player class; used to directly interact with the Ocoins variable
     *              of the player
     */
    public void RemoveWither(ArrayList<Tile> array, int x, Player p) {
        if (!array.get(x).getWitherState()) { // NO WITHERED PLANT
            System.out.println("Sorry. The current tile does not contain a withered plant.");
        } else if (array.get(x).getWitherState() && p.getOcoins() >= 7) { // SUCCESS
            p.setOcoins(p.getOcoins() - 7);
            System.out.println("Withered plant successfully removed. Deducting 7 Objectcoins from inventory. "
                    + p.getOcoins() + " Objectcoins remaining.");

            array.get(x).getPlayerExp().GainExp(2, array.get(x).getPlayerExp());

            array.get(x).setPlowState(0);
            array.get(x).setWitherState(false);
            array.get(x).setSeedState(1);
        } else {
            System.out.println( // NOT ENOUGH MONEY
                    "Sorry. You do not have enough Objectcoins to remove the withered plant in Tile " + x + ".");
        }
    }
}
