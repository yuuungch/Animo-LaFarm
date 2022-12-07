import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    private ArrayList<Tile> Land;
    private Player player;
    private Tile tile;
    private int day;
    private Play play;
    private String playerInfo;
    private boolean EndOfGame;
    private boolean witherCheck;
    private String output;
    //private ControllerFarm farmControl;

    public Farm(ArrayList<Tile> Land,Player player, Tile tile, Play play) {
        this.Land = Land;
        this.player = player;
        this.tile = tile;
        day = 1;
        this.play = play;
        EndOfGame = false;
        witherCheck = false;
    }

    /**
     * MAIN MENU FOR THE WHOLE PROGRAM
     */
    public void Menu() {
        Scanner input = new Scanner(System.in);
        int choice, c1, c2, i, finalchoice;

        tile.SetRocks(Land); // place rocks

        do {

            player.getExpData().LevelUp(); // Validator

            System.out.println("--------------------------------------------------------------");

            System.out.println("Options:");
            System.out.println("[11] Check Tiles"); // locally available

            System.out.print("\nChoice: ");
            choice = input.nextInt();            
            if (choice == 11) {
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

    public void buySeeds(){
        player.BuySeeds();
        // check if player has no more money, run out of seeds, or no more active crops
        // then end of game
        for (int y = 0; y < Land.size(); y++) {
            if (Land.get(y).getSeedInfo().getCost() > player.getOcoins()
                    && Land.get(0).getSeedInfo().getCost() == 0) {
                EndOfGame = true;
            }
        }
    }

    public void plant(int tileNum, int seedNum){
        Land.get(tileNum).getSeedInfo().Generate(seedNum);
        if (player.getSeedInv().get(Land.get(tileNum).getSeedInfo().getType() - 1) == 0) {
            output = "Sorry. You do not have enough seeds of that kind ("
                    + Land.get(tileNum).getSeedInfo().getName() + ")";
            WindowOutputGui outputGui = new WindowOutputGui(output);
        } else {
            player.getSeedInv().set(Land.get(tileNum).getSeedInfo().getType() - 1,
                    player.getSeedInv().get(Land.get(tileNum).getSeedInfo().getType() - 1) - 1);
            tile.Plant(Land, tileNum, seedNum);
        }
    }

    public void harvest(ArrayList<Tile> Land, int tileNum, Player player){
        tile.Harvest(Land, tileNum, player);
    }

    public void rankUp(){
        player.getExpData().Registration(player);
        player.getSeedData().ExpChange(player.getExpData().getEarningBonus(),
        player.getExpData().getCostReduction(), player.getExpData().getWaterBonus(),
        player.getExpData().getFertiBonus());
    }

    public void nextDay(){
        day++;
        for (int i = 0; i < Land.size(); i++) { // RESET DAILY STATS (WATERTODAY AND FERTILIZEDTODAY) AND SUBTRACT 1
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

    public String getCurrentPlayerInfo(){
        //generate info
        playerInfo = "---------------------------------"+ "\nObjectcoins Available: "
        + player.getOcoins() + player.getExpData().CheckStatus()
        + "\n" + "---------------------------------"+ "\n";
        return playerInfo;
    }
}
