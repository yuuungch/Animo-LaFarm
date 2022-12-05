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
    private Pickaxe pick;
    private Play play;

    public Farm(Player player, Tile tile, Play play) {
        Land = new ArrayList<Tile>();
        this.player = player;
        this.tile = tile;
        day = 1;
        plowTool = new PlowTool();
        wateringCan = new WateringCan();
        fertilizer = new Fertilizer();
        shovelTool = new ShovelTool();
        pick = new Pickaxe();
        this.play = play;
    }

    /**
     * MAIN MENU FOR THE WHOLE PROGRAM
     */
    public void Menu() {
        Scanner input = new Scanner(System.in);
        int choice, c1, c2, i, finalchoice;
        boolean EndOfGame = false;
        boolean witherCheck = false;

        player.InitializeInventory(); // Initialize Inventory

        for (i = 0; i < 50; i++) {
            Land.add(i, tile);
        }

        tile.SetRocks(Land); // place rocks

        do {

            player.getExpData().LevelUp(); // Validator

            System.out.println("0coins: " + player.getOcoins());
            System.out.println("Today is day " + day);

            System.out.println("--------------------------------------------------------------");

            System.out.println("Options:");
            System.out.println("[1] Remove Rocks"); // in Pickaxe Class
            System.out.println("[2] Plow Tile"); // in Tile class
            System.out.println("[3] Buy Seeds"); // in Player class
            System.out.println("[4] Plant Seed"); // in Tile class
            System.out.println("[5] Water Tile"); // in Tile class
            System.out.println("[6] Fertilize Tile"); // in Tile class
            System.out.println("[7] Harvest Tile"); // in Tile class
            System.out.println("[8] Remove Withers"); // in Tile class
            System.out.println("[9] Check Player"); // in Player and Exp class
            System.out.println("[10] Rank up"); // in Player and Seeds class
            System.out.println("[11] Check Tiles"); // locally available
            System.out.println("[0] Advance Day"); // Locally available

            System.out.print("\nChoice: ");
            choice = input.nextInt();

            if (choice == 1) { // REMOVE ROCKS
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                pick.RemoveRock(Land, c1, player);

            } else if (choice == 2) { // PLOW

                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
                    if (Land.get(c1).getPlowState() == 0 || Land.get(c1).getPlowState() == 1
                            || Land.get(c1).getPlowState() == 2) {
                        plowTool.Plow(Land, c1);
                    }
                }

            } else if (choice == 3) { // BUY
                player.BuySeeds();
                // check if player has no more money, run out of seeds, or no more active crops
                // then end of game
                for (int y = 0; y < Land.size(); y++) {
                    if (Land.get(y).getSeedInfo().getCost() > player.getOcoins()
                            && Land.get(0).getSeedInfo().getCost() == 0) {
                        EndOfGame = true;
                    }
                }

            } else if (choice == 4) { // PLANT
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
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
                }

            } else if (choice == 5) { // WATER
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
                    wateringCan.Water(Land, c1);
                }

            } else if (choice == 6) { // FERTILIZE
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
                    fertilizer.Fertilize(Land, c1, player);
                }

            } else if (choice == 7) { // HARVEST
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
                    tile.Harvest(Land, c1, player);
                }

            } else if (choice == 8) { // REMOVE WITHER
                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (c1 < 0 || c1 >= Land.size()) {
                    System.out.println("Invalid answer. Tile does not exist.");
                } else if (c1 >= 0 && c1 < Land.size()) {
                    shovelTool.RemoveWither(Land, c1, player);
                }

            } else if (choice == 9) { // CHECK PLAYER
                System.out.println("---------------------------------");

                player.CheckSeedInventory();
                System.out.println("Objectcoins Available: " + player.getOcoins());
                System.out.println("---------------------------------");
                player.getExpData().CheckStatus();
            } else if (choice == 10) { // RANK UP
                player.getExpData().Registration(player);

                player.getSeedData().ExpChange(player.getExpData().getEarningBonus(),
                        player.getExpData().getCostReduction(), player.getExpData().getWaterBonus(),
                        player.getExpData().getFertiBonus());

            } else if (choice == 11) {
                System.out.print("Which tile do you wish to check? ");
                c1 = input.nextInt();

                if (choice >= 0 && choice <= 49) {
                    System.out.println("Incubation Period: " + Land.get(c1).getSeedInfo().getHarvestTime());
                    System.out.println("Days left before Harvestable: " + Land.get(c1).getSeedInfo().getDaysLeft());
                    System.out.println("Max Water Count: " + Land.get(c1).getSeedInfo().getWater() + " ("
                            + Land.get(c1).getSeedInfo().getBonusWater() + ")");
                    System.out.println("Current Water Count: " + Land.get(c1).getWaterCount());
                    System.out.println("Max Fertilize Count: " + Land.get(c1).getSeedInfo().getFertilizer() + " ("
                            + Land.get(c1).getSeedInfo().getBonusFertilizer() + ")");
                    System.out.println("Current Fertilize Count: " + Land.get(c1).getFertiCount());
                } else {
                    System.out.println("Invalid input. Please try again.");
                }

            } else if (choice == 0) { // DAY CYCLE
                day++;

                for (i = 0; i < Land.size(); i++) { // RESET DAILY STATS (WATERTODAY AND FERTILIZEDTODAY) AND SUBTRACT 1
                                                    // DAY
                    // FROM HARVEST PERIOD
                    tile.WitherCheck(Land, i);
                    Land.get(i).setWateredToday(0);
                    Land.get(i).setFertilizedToday(0);
                    if (Land.get(i).getSeedInfo().getDaysLeft() > 0)
                        Land.get(i).getSeedInfo().setDaysLeft(Land.get(i).getSeedInfo().getDaysLeft() - 1);
                }

                if (witherCheck == true) {
                    EndOfGame = true;
                }
            }
        } while (EndOfGame != true); // Temporary Limiter for Game
        if (EndOfGame == true) {
            System.out.println("Game over :(");
            System.out.println("Would you like to play again or exit the program?");
            System.out.println("[1] Play Again");
            System.out.println("[0] Exit");
            System.out.print("\nChoice: ");
            finalchoice = input.nextInt();

            if (finalchoice == 1) {
                play.playGame();
            } else if (finalchoice == 0) {
                System.exit(0);
            }
        }
    }
}
