public class PlowTool {
    private static Exp XP;
    
    public PlowTool(Exp XP) {
        XP = XP;
    }

    public static void plowTile(Tile[][] farmLotTile, int row, int col){
        farmLotTile[row][col].setPlowState(1);
        System.out.println("Tile on Row "+ row + " Col " + col + " has been plowed.");
        System.out.println("Plow State "+ farmLotTile[row][col].getPlowState());
        XP.setExp(XP.getExp() + 0.5);
    }
}
