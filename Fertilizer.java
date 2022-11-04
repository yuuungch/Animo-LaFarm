public class Fertilizer {
    private Player player;
    private Exp XP;

    
    public Fertilizer(Player player, Exp XP) {
        this.player = player;
        XP = XP;
    }

    public void Fertiize(Tile[][] farmLotTile, int row, int col){
        if(farmLotTile[row][col].getSeedState() == 1){ //check if tile has a seed planted
            farmLotTile[row][col].setFertilizedState(farmLotTile[row][col].getFertilizedState()+1);
            System.out.println("Tile on Row "+ row + " Col " + col + " has been fertilized.");
            System.out.println("Water State "+ farmLotTile[row][col].getFertilizedState());
            XP.setExp(XP.getExp() + 4);
            player.setOcoins(player.getOcoins()-10);
       }else{
           System.out.println("Error! Please plant a seed before watering the tile.");
       }
    }
}
