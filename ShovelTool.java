public class ShovelTool {
    private Player player;
    private Exp XP;

    
    public ShovelTool(Player player, Exp XP) {
        this.player = player;
        XP = XP;
    }

    public void Shovel (Tile[][] farmLotTile, int row, int col){
        if(farmLotTile[row][col].getSeedState() == 1){ //check if tile has a seed planted
            //set states back to zero
            farmLotTile[row][col].setFertilizedState(0);
            farmLotTile[row][col].setPlantDate(0);
            farmLotTile[row][col].setPlowState(0);
            farmLotTile[row][col].setSeedPlanted(0);
            farmLotTile[row][col].setSeedState(0);
            farmLotTile[row][col].setWaterState(0);
            farmLotTile[row][col].setProduce(0);
            System.out.println("Tile on Row "+ row + " Col " + col + " has been shoveled.");
            System.out.println("Water State "+ farmLotTile[row][col].getWaterState());
            XP.setExp(XP.getExp() + 2);
            player.setOcoins(player.getOcoins()-7);
        }else{
           System.out.println("Error! Please plant a seed before watering the tile.");
        }
    }

    public ShovelTool() {
    }
}
