public class Play {
    public void playGame() {
        Play play = new Play();
        Player player = new Player();
        Seeds seedInfo = new Seeds();
        Tile tile = new Tile(seedInfo, player.getExpData());
        Farm farm = new Farm(player, tile, play);

        farm.Menu();
    }
}
