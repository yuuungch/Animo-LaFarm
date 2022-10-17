import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        //attributes
        ArrayList<Integer> seedInv = new ArrayList<Integer>();
        Seeds seedData = new Seeds();
        Exp expData = new Exp();
        Player player = new Player(seedInv, seedData, expData);
        Tile tile = new Tile();
        Farm farm = new Farm(player, tile);

        //methods
        farm.Menu();
    }
}
