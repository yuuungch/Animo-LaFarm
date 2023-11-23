import java.util.ArrayList;

public class PlowTool {
    private String output;
    /**
     * Method for plowing a tile (To be moved to Hoe class)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile number
     */
    public void Plow(ArrayList<Tile> array, int x) {
        if (array.get(x).getPlowState() == 0 && array.get(x).getRockState() != 0) {
            array.get(x).setPlowState(1);
            output = "Tile has been successfully plowed!";
            array.get(x).getPlayerExp().GainExp(0.5, array.get(x).getPlayerExp());
        } else if (array.get(x).getPlowState() == 1) {
            output = "Tile is already plowed!";
        } else if (array.get(x).getPlowState() == 0 && array.get(x).getRockState() == 0) {
            output = "Tile cannot be plowed as there are rocks on it.";
        }
        WindowOutputGui outputGui = new WindowOutputGui(output);
    }

}
