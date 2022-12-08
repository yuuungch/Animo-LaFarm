import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    private ArrayList<Tile> Land;
    private Player player;
    private int day;
    private Play play;
    private String playerInfo;
    private boolean EndOfGame;
    private boolean witherCheck;
    private String output;
    // private ControllerFarm farmControl;

    public Farm(ArrayList<Tile> Land, Player player, Play play) {
        this.Land = Land;
        this.player = player;
        day = 1;
        this.play = play;
        EndOfGame = false;
        witherCheck = false;
    }

    public void buySeeds() {
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

    public void plant(int tileNum, int seedNum) {
        Seeds seed = new Seeds(0);
        seed.Generate(seedNum);
        if (player.getSeedInv().get(seedNum - 1) == 0) {
            output = "Sorry. You do not have enough seeds of that kind ("
                    + seed.getName() + ")";
            WindowOutputGui outputGui = new WindowOutputGui(output);
        } else {
            Land.get(tileNum).getSeedInfo().Generate(seedNum);
            player.getSeedInv().set(seedNum - 1,
                    player.getSeedInv().get(seedNum - 1) - 1);
            Land.get(tileNum).Plant(Land, tileNum, seedNum);

        }
    }

    public void harvest(ArrayList<Tile> Land, int tileNum, Player player) {
        Land.get(tileNum).Harvest(Land, tileNum, player);
    }

    public void rankUp() {
        player.getExpData().Registration(player);
        player.getSeedData().ExpChange(player.getExpData().getEarningBonus(),
                player.getExpData().getCostReduction(), player.getExpData().getWaterBonus(),
                player.getExpData().getFertiBonus());
    }

    public void nextDay() {
        day++;

        output = "Today is Day " + day;
        for (int i = 0; i < Land.size(); i++) { // RESET DAILY STATS (WATERTODAY AND FERTILIZEDTODAY) AND SUBTRACT 1
            // DAY
            // FROM HARVEST PERIOD
            Land.get(i).WitherCheck(Land, i);
            Land.get(i).setWateredToday(0);
            Land.get(i).setFertilizedToday(0);
            if (Land.get(i).getSeedInfo().getDaysLeft() > 0)
                Land.get(i).getSeedInfo().setDaysLeft(Land.get(i).getSeedInfo().getDaysLeft() - 1);
        }
        if (witherCheck == true) {
            EndOfGame = true;
        }
        WindowResultGui nextDay = new WindowResultGui(output);
    }

    public void checkTile(int tileNum) {
        if (tileNum >= 0 && tileNum <= 49) {

            output = "Tile " + (tileNum + 1) +
                    "\nIncubation Period: " + Land.get(tileNum).getSeedInfo().getHarvestTime() +
                    "\nDays left before Harvestable: " + Land.get(tileNum).getSeedInfo().getDaysLeft() +
                    "\nMax Water Count: " + Land.get(tileNum).getSeedInfo().getWater() + " ("
                    + Land.get(tileNum).getSeedInfo().getBonusWater() + ")" +
                    "\nCurrent Water Count: " + Land.get(tileNum).getWaterCount() +
                    "\nMax Fertilize Count: " + Land.get(tileNum).getSeedInfo().getFertilizer() + " ("
                    + Land.get(tileNum).getSeedInfo().getBonusFertilizer() + ")" +
                    "\nCurrent Fertilize Count: " + Land.get(tileNum).getFertiCount();
            WindowTileGui tileGui = new WindowTileGui(output);
        } else {
            output = "Invalid input. Please try again.";
            WindowOutputGui outputGui = new WindowOutputGui(output);
        }
    }

    public String getCurrentPlayerInfo() {
        // generate info
        playerInfo = "---------------------------------" + "\nObjectcoins Available: "
                + player.getOcoins() + player.getExpData().CheckStatus()
                + "\n" + "---------------------------------" + "\n";
        return playerInfo;
    }
}
