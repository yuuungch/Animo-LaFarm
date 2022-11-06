public class Play {
    public void playGame() {
        Play play = new Play();
        Player player = new Player();
        Seeds seedInfo = new Seeds();
        Tile tile = new Tile(seedInfo, player.getExpData());
        PlowTool plowTool = new PlowTool(player.getExpData());
        WateringCan wateringCan = new WateringCan(seedInfo, player.getExpData());
        Fertilizer fertilizer = new Fertilizer(seedInfo, player.getExpData());
        ShovelTool shovelTool = new ShovelTool();
        Farm farm = new Farm(player, tile, plowTool, wateringCan, fertilizer, shovelTool, seedInfo, play) ;

        farm.Menu();
    }
}
