import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        //attributes
        ArrayList<Integer> seedInv = new ArrayList<Integer>();
        Seeds seedData = new Seeds();
        Exp expData = new Exp();
        Player player = new Player(seedInv, seedData, expData);
        Tile tile = new Tile(0, 0, 0, 0, 0, 0);
        Farm farm = new Farm(player, tile, seedData);

        //methods
        farm.Menu();
    }
}
