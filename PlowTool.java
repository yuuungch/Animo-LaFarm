import java.util.ArrayList;

public class PlowTool {
    private Exp playerExp;

    
    public PlowTool(Exp playerExp) {
        this.playerExp = playerExp;
    }


    /**
     * Method for plowing a tile (To be moved to Hoe class)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile number
     */
    public void Plow(ArrayList<Tile> array, int x) {
        if (array.get(x).getPlowState() == 0 && array.get(x).getRockState() != 0) {
            array.get(x).setPlowState(1);
            System.out.println("Tile has been successfully plowed!");
            playerExp.GainExp(0.5, array.get(x).getPlayerExp());
        } else if (array.get(x).getPlowState() == 1) {
            System.out.println("Tile is already plowed!");
        } else if (array.get(x).getPlowState() == 0 && array.get(x).getRockState() == 0) {
            System.out.println("Tile cannot be plowed as there are rocks on it.");
        }
    }
    
}
