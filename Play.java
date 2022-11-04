import java.util.ArrayList;

public class Play {
    public void playGame(){
         //attributes
        ArrayList<Integer> seedInv = new ArrayList<Integer>();
        Seeds seedData = new Seeds();
        Exp XP = new Exp(0, "Farmer", 0, 0, 0, 0, 0);
        Player player = new Player(seedInv, seedData, XP);
        Tile tile = new Tile(0, 0, 0, 0, 0, 0, 0);
        Play play = new Play();
        PlowTool plowingTool = new PlowTool(XP);
        WateringCan wateringCan = new WateringCan(XP);
        Fertilizer fertilizerObj = new Fertilizer(player, XP);
        ShovelTool shovelTool = new ShovelTool(player, XP);
        Farm farm = new Farm(player, tile, seedData, play, plowingTool, wateringCan, fertilizerObj, XP, shovelTool);
        farm.Menu();
    }
   
}
