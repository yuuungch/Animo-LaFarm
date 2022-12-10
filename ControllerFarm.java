import java.util.ArrayList;

public class ControllerFarm {
    private Farm farm;
    private WindowErrorGui errorGui;
    private ArrayList<Tile> Land;
    private PlowTool plowTool;

    // contstructor
    public ControllerFarm(Farm farm, ArrayList<Tile> Land, PlowTool plowTool) {
        this.farm = farm;
        this.Land = Land;
        this.plowTool = plowTool;
    }

    /**
     * Redirected method for Plow function
     * 
     * @param tileNum
     */
    public void Plow(int tileNum) {
        if (Land.get(tileNum).getPlowState() == 0 || Land.get(tileNum).getPlowState() == 1) {
            plowTool.Plow(Land, tileNum);
        }

    }

    // error
    public void error() {
        errorGui = new WindowErrorGui(Land, plowTool, farm);
    }

}
