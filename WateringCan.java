public class WateringCan {
    private Exp XP;
    
    public WateringCan(Exp XP) {
        XP = XP;
    }

    public void WaterPlant(Tile[][] farmLotTile, int row, int col){
        if(farmLotTile[row][col].getSeedState() == 1){ //check if tile has a seed planted
            farmLotTile[row][col].setWaterState(farmLotTile[row][col].getWaterState()+1);
            System.out.println("Tile on Row "+ row + " Col " + col + " has been watered.");
            System.out.println("Water State "+ farmLotTile[row][col].getWaterState());
            XP.setExp(XP.getExp() + 0.5);
        }else{
           System.out.println("Error! Please plant a seed before watering the tile.");
        }
    }
}
