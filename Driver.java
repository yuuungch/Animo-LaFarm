public class Driver {
    public static void main(String[] args) {
        Player player = new Player();
        Tile tile = new Tile();
        Farm farm = new Farm(player, tile);

        farm.Menu();
    }
}