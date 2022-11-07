import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    private ArrayList<Tile> Land;
    private Player player;
    private Tile tile;
    private int day;
    private PlowTool plowTool;
    private WateringCan wateringCan;
    private Fertilizer fertilizer;
    private ShovelTool shovelTool;
    private Seeds seedInfo; // Seed Database
    private Play play;


    public Farm(Player player, Tile tile, PlowTool plowTool, WateringCan wateringCan,
    Fertilizer fertilizer, ShovelTool shovelTool, Seeds seedInfo, Play play) {
        Land = new ArrayList<Tile>();
        this.player = player;
        this.tile = tile;
        this.plowTool = plowTool;
        this.wateringCan = wateringCan;
        this.fertilizer = fertilizer;
        this.shovelTool = shovelTool;
        this.seedInfo = seedInfo;
        this.play = play;
        day = 1;
    }

    /**
     * MAIN MENU FOR THE WHOLE PROGRAM
     */
    public void Menu() {
        Scanner input = new Scanner(System.in);
        int choice, c1, c2, i, finalchoice;
        boolean EndOfGame = false;
        boolean activeCropCheck = true;
        boolean witherCheck = false;

        player.InitializeInventory(); // Initialize Inventory

        Land.add(0, tile); // set tile 1 with corresponding tile state
        do {

                player.getExpData().LevelUp(); // Validator

                System.out.println("0coins: " + player.getOcoins());
                System.out.println("Today is day " + day);

                // Seed Information on Tile 0; Only shows up when there is a plant present
                if (Land.get(0).getSeedState() >= 1 && Land.get(0).getSeedState() <= 8) {
                    System.out.println("Incubation Period: " + Land.get(0).getSeedInfo().getHarvestTime());
                    System.out.println("Days left before Harvestable: " + Land.get(0).getSeedInfo().getDaysLeft());
                    System.out.println("Max Water Count: " + Land.get(0).getSeedInfo().getWater() + " ("
                            + Land.get(0).getSeedInfo().getBonusWater() + ")");
                    System.out.println("Current Water Count: " + Land.get(0).getWaterCount());
                    System.out.println("Max Fertilize Count: " + Land.get(0).getSeedInfo().getFertilizer() + " ("
                            + Land.get(0).getSeedInfo().getBonusFertilizer() + ")");
                    System.out.println("Current Fertilize Count: " + Land.get(0).getFertiCount());
                    System.out.println("--------------------------------------------------------------");
                }

                System.out.println("Options:");
                System.out.println("[1] Plow Tile"); // in Tile class (To be moved to Hoe Class)
                System.out.println("[2] Buy Seeds"); // in Player class
                System.out.println("[3] Plant Seed"); // in Tile class
                System.out.println("[4] Water Tile"); // in Tile class (To be moved to WateringCan Class)
                System.out.println("[5] Fertilize Tile"); // in Tile class (To be moved to Fertilize Class)
                System.out.println("[6] Harvest Tile"); // in Tile class
                System.out.println("[7] Remove Withers"); // in Tile class (To be moved to Shovel Class)
                System.out.println("[8] Check Player"); // in Player and Exp class
                System.out.println("[9] Rank up"); // in Player and Seeds class
                System.out.println("[0] Advance Day"); // here in Farm class

                System.out.print("\nChoice: ");
                choice = input.nextInt();

                if (choice == 1) { // PLOW

                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();
                    
                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        if (Land.get(c1).getPlowState() == 0 || Land.get(c1).getPlowState() == 1
                        || Land.get(c1).getPlowState() == 2) {
                        plowTool.Plow(Land, c1);
                    }
                    }

                } else if (choice == 2) { // BUY
                    player.BuySeeds();
                    System.out.println("end b: "+ EndOfGame);
                    //check if player has no more money, run out of seeds, or no more active crops then end of game
                    for ( int y = 0; y < Land.size(); y++){
                        if (Land.get(y).getSeedInfo().getCost() > player.getOcoins() &&  Land.get(0).getSeedInfo().getCost() == 0){
                            EndOfGame = true;
                            System.out.println("end in: "+ EndOfGame);
                        }
                    }

                } else if (choice == 3) { // PLANT
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        if (Land.get(c1).getSeedState() == 0) {
                            do {
                                System.out.println("--Root Crops--");
                                System.out.println("[1] Turnip");
                                System.out.println("[2] Carrot");
                                System.out.println("[3] Potato");
                                System.out.println("[4] Rose");
                                System.out.println("--Flowers--");
                                System.out.println("[5] Turnip");
                                System.out.println("[6] Sunflower");
                                System.out.println("--Fruit Trees--");
                                System.out.println("[7] Mango");
                                System.out.println("[8] Apple");

                                System.out.print("\nWhat seed would you like to plant: ");
                                c2 = input.nextInt();

                                if (c2 >= 1 && c2 <= 9) {
                                    Land.get(c1).getSeedInfo().Generate(c2);

                                    if (player.getSeedInv().get(Land.get(c1).getSeedInfo().getType() - 1) == 0) {
                                        System.out.println("Sorry. You do not have enough seeds of that kind ("
                                                + Land.get(c1).getSeedInfo().getName() + ")");
                                    } else {
                                        player.getSeedInv().set(Land.get(c1).getSeedInfo().getType() - 1,
                                                player.getSeedInv().get(Land.get(c1).getSeedInfo().getType() - 1) - 1);
                                        tile.Plant(Land, c1, c2);
                                    }
                                }
                            } while (c2 < 1 && c2 > 9);

                        }
                        //check if player has no more money, run out of seeds, or no more active crops then end of game
                    if (player.runOutOfSeeds() == true){
                        EndOfGame = true;
                    }
                    System.out.println("Seeds plant " + player.runOutOfSeeds());
                    }
                    

                } else if (choice == 4) { // WATER
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        wateringCan.Water(Land,c1);
                    }

                } else if (choice == 5) { // FERTILIZE
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        fertilizer.Fertilize(Land, c1, player);
                    }

                } else if (choice == 6) { // HARVEST
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        tile.Harvest(Land, c1, player);
                    }

                    //check if there is no active growing crops
                    for ( int y = 0; y < Land.size(); y++){
                        if (Land.get(y).getSeedState() != 0){
                            activeCropCheck = true;
                        } else{
                            activeCropCheck = false;
                        }
                    }
                    //check if player has no more money, run out of seeds, or no more active crops then end of game
                    if (activeCropCheck == false){
                        EndOfGame = true;
                    }

                } else if (choice == 7) { // REMOVE WITHER
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (c1 < 0 || c1 >= Land.size()){
                        System.out.println("Invalid answer. Tile does not exist.");
                    }else if (c1 >= 0 && c1 < Land.size()){
                        shovelTool.RemoveWither(Land, c1, player);
                    }

                } else if (choice == 8) { // CHECK PLAYER
                    System.out.println("---------------------------------");

                    player.CheckSeedInventory();
                    System.out.println("Objectcoins Available: " + player.getOcoins());
                    System.out.println("---------------------------------");
                    player.getExpData().CheckStatus();
                } else if (choice == 9) { // RANK UP
                    player.getExpData().Registration(player);

                    player.getSeedData().ExpChange(player.getExpData().getEarningBonus(),
                            player.getExpData().getCostReduction(), player.getExpData().getWaterBonus(),
                            player.getExpData().getFertiBonus());

                } else if (choice == 0){ // DAY CYCLE
                    day++;

                    for (i = 0; i < Land.size(); i++) { // RESET DAILY STATS (WATERTODAY AND FERTILIZEDTODAY) AND SUBTRACT 1 DAY
                                                // FROM HARVEST PERIOD
                    tile.WitherCheck(Land, i);
                    Land.get(i).setWateredToday(0);
                    Land.get(i).setFertilizedToday(0);
                    if (Land.get(i).getSeedInfo().getDaysLeft() > 0)
                        Land.get(i).getSeedInfo().setDaysLeft(Land.get(i).getSeedInfo().getDaysLeft() - 1);
                    }

                    if (witherCheck == true){
                        EndOfGame = true;
                    }
                } 
        }while (EndOfGame != true); // Temporary Limiter for Game
        if (EndOfGame == true){
            System.out.println("Game over :(");
            System.out.println("Would you like to play again or exit the program?");
            System.out.println("[1] Play Again");
            System.out.println("[0] Exit");
            System.out.print("\nChoice: ");
            finalchoice = input.nextInt();

            if (finalchoice == 1){
                play.playGame();
            }else if ( finalchoice == 0){
                System.exit(0);
            }
        }
    }

    // GETTERS AND SETTERS

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
