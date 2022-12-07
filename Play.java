import java.util.ArrayList;

public class Play {
    public void playGame() {
        Play play = new Play();
        Seeds seedInfo = new Seeds(0);
        Store store = new Store(8, seedInfo);
        Player player = new Player(store);
        Tile tile = new Tile(seedInfo, player.getExpData());
        ArrayList<Tile> Land = new ArrayList<Tile>();
        player.InitializeInventory(); // Initialize Inventory
        for (int i = 0; i < 50; i++) {
            Land.add(i, tile);
        }
        Farm farm = new Farm(Land, player, tile, play);
        PlowTool plowTool = new PlowTool();
        WateringCan wateringCan = new WateringCan();
        Fertilizer fertilizer = new Fertilizer();
        ShovelTool shovelTool = new ShovelTool();
        Pickaxe pickaxe = new Pickaxe();
        WindowFarmGui farmGui = new WindowFarmGui(farm, seedInfo, Land, store, player, plowTool,
                                                  wateringCan, fertilizer, shovelTool, pickaxe);

        // farm.Menu();
    }
}
