import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tile {
    private int rockState; // 0 no rock, 1 with rock
    private int plowState; // 0 for unplowed, 1 for plowed
    private int seedState; // 0 unplanted, 1 to 8 for types of seed, 9 if withered
    private boolean witherState; // false unwithered, true withered
    private int waterCount; // counts number of times tile has been watered
    private int wateredToday; // 0 if not yet, 1 if done already.
    private int fertiCount; // 0 if not fertilized, 1 if fertilized
    private int fertilizedToday; // 0 if not yet, 1 if done already.
    private Seeds seedInfo; // contains information regarding which seed
    private Exp playerExp;
    private String output;
    private String outString;
    private String finalOutput;

    public Tile(Exp playerExp) {
        rockState = 0;
        plowState = 0;
        seedState = 0;
        witherState = false;
        waterCount = 0;
        wateredToday = 0;
        fertiCount = 0;
        fertilizedToday = 0;
        seedInfo = new Seeds(0);
        this.playerExp = playerExp;
    }

    /**
     * Method to establish tile slots that contains rocks
     * 
     * @param array ArrayList of Tiles
     */
    public void SetRocks(ArrayList<Tile> array, int x) {
        File filename = new File("Rocks.txt");
        try (Scanner file = new Scanner(filename)) {
            int index;
            while (file.hasNextInt()) {
                index = file.nextInt();
                if (x == index)
                    array.get(index).setRockState(1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error. Filename " + filename + " not found!");
            e.printStackTrace();
        }

    }

    /**
     * Method for planting a seed
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @param y     Seed Type
     */
    public void Plant(ArrayList<Tile> array, int x, int y, Player p) {

        boolean treePos = true;

        if (y == 7 || y == 8) {
            treePos = false;
            treePos = TreeCheck(array, x);
        }
        if (array.get(x).getRockState() == 1) {
            output = "Cannot plant seed on chosen tile. Please remove rocks first.";
        } else if (array.get(x).getPlowState() == 0) { // UNPLOWED
            output = "Cannot plant seed on chosen tile. Please plow the tile first.";
        } else if (!treePos) {
            output = "Cannot plant tree seed on chosen tile.";
        } else if (array.get(x).getSeedState() == 0 && array.get(x).getPlowState() == 1 && treePos) { // SUCCESS
            array.get(x).setSeedState(y);
            array.get(x).getSeedInfo().Generate(y);
            p.getSeedInv().set(y - 1, p.getSeedInv().get(y - 1) - 1);
            output = array.get(x).getSeedInfo().getName() + " seed planted Successfully! ";
        } else if (array.get(x).getSeedState() != 0 && array.get(x).getPlowState() == 1) { // ALREADY HAS A SEED
            output = "Sorry. This tile already has a seed planted. ";
        } else if (array.get(x).getSeedState() == 9) { // WITHERED PLANT PRESENT
            output = "Sorry. There is still a withered plant present here in this tile. Please remove it first.";
        }
        WindowOutputGui outputGui = new WindowOutputGui(output);
    }

    /**
     * Checks for surrounding tiles (for tree seeds only)
     * 
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @return true if tree is plantable
     * @return false if tree is not plantable
     */
    public boolean TreeCheck(ArrayList<Tile> array, int x) {
        boolean value = false;
        if (x > 9 && x < 40) { // Top and bottom check
            if (x % 10 != 0 && x + 1 % 10 != 0) { // left and right check
                if (array.get(x - 11).seedState == 0 && array.get(x - 10).seedState == 0
                        && array.get(x - 9).seedState == 0) { // top row check
                    if (array.get(x - 1).seedState == 0 && array.get(x + 1).seedState == 0) { // mid row check
                        if (array.get(x + 9).seedState == 0 && array.get(x + 10).seedState == 0
                                && array.get(x + 11).seedState == 0) { // bottom row check
                            value = true;
                        }
                    }
                }
            }
        }
        return value;
    }

    /**
     * Method that regularly checks for a withered plant (This method stays here in
     * Tile, DO NOT MOVE TO SHOVEL)
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     */
    public void WitherCheck(ArrayList<Tile> array, int x) {
        String output;
        if ((array.get(x).seedInfo.getDaysLeft() < 0 || array.get(x).getWateredToday() == 0
                && array.get(x).getSeedState() != 0)) {
            output = "Oh no! The " + array.get(x).seedInfo.getName() + " in Tile " + x + " has withered!";
            array.get(x).setWitherState(true);
            array.get(x).setSeedState(9);
            array.get(x).setWaterCount(0);
            array.get(x).setFertiCount(0);
            array.get(x).seedInfo.Generate(0);

            WindowOutputGui withered = new WindowOutputGui(output);
        }
    }

    /**
     * Method to harvest a plant and earn money
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @param p     Player class; used to directly interact with the Ocoins variable
     *              of the player
     */
    public void Harvest(ArrayList<Tile> array, int x, Player p) {
        Random rand = new Random(); // For plant produce

        int produceNum; // Actual variable for produce
        double HarvestTotal, WaterBonusValue, FertilizerBonusValue, FinalHarvestPrice;
        if (array.get(x).seedInfo.getType() > 0 && array.get(x).seedInfo.getType() < 9) { // ed ranges from
                                                                                          // available ones
            // context rand.nextInt(origin, bound); origin is base, bound is peak minus 1
            // EX.
            // if origin = 7 and bound = 10
            // then rand will only produce pseudorandom numbers from 7 to 9
            produceNum = rand.nextInt(array.get(x).seedInfo.getProduceMin(), array.get(x).seedInfo.getProduceMax() + 1);

            HarvestTotal = produceNum
                    * (array.get(x).seedInfo.getBaseSell() + array.get(x).playerExp.getEarningBonus());

            WaterBonusValue = HarvestTotal * 0.2 * (array.get(x).getWaterCount() - 1);

            if (WaterBonusValue < 0)
                WaterBonusValue = 0;

            FertilizerBonusValue = HarvestTotal * 0.5 * (array.get(x).getFertiCount());

            if (FertilizerBonusValue < 0)
                FertilizerBonusValue = 0;

            FinalHarvestPrice = HarvestTotal + WaterBonusValue + FertilizerBonusValue;

            output = "Yay! you have harvested " + produceNum + " pieces of " + seedInfo.getName() + ".";
            WindowOutputGui outputGui = new WindowOutputGui(output);

            // PROFIT BREAKDOWN

            // FLOWER MULTIPLIER BONUS
            if (array.get(x).seedInfo.getType() >= 4 && array.get(x).seedInfo.getType() <= 6) {
                outString = "Profit Breakdown:\n" + "-----------------------\n" +
                        "Total Number of Harvest: " + produceNum +
                        "\nPrice for each " + seedInfo.getName() + ": " + seedInfo.getBaseSell() +
                        "\nTimes Plant was Watered: " + array.get(x).getWaterCount() +
                        "\nWater Bonus: " + WaterBonusValue +
                        "\nTimes Plant was Fertilized: " + array.get(x).getFertiCount() +
                        "\nFertilizer Bonus: " + FertilizerBonusValue +
                        "Flower Multiplier Bonus: 1.1";
                FinalHarvestPrice *= 1.1;
            } else {
                outString = "Profit Breakdown:\n" + "-----------------------\n" +
                        "Total Number of Harvest: " + produceNum +
                        "\nPrice for each " + seedInfo.getName() + ": " + seedInfo.getBaseSell() +
                        "\nTimes Plant was Watered: " + array.get(x).getWaterCount() +
                        "\nWater Bonus: " + WaterBonusValue +
                        "\nTimes Plant was Fertilized: " + array.get(x).getFertiCount() +
                        "\nFertilizer Bonus: " + FertilizerBonusValue;
            }
            p.setOcoins(p.getOcoins() + FinalHarvestPrice);
            finalOutput = outString + "\nTotal Profit: " + FinalHarvestPrice + // FINAL PROFIT
                    "\n-------------------------" +
                    "\nAdded " + FinalHarvestPrice + " to your inventory. Total of " +
                    p.getOcoins() + " Objectcoins in inventory.";
            WindowResultGui resultGui = new WindowResultGui(finalOutput);
            playerExp.GainExp(array.get(x).seedInfo.getExpYield() * produceNum, array.get(x).playerExp);

            // RESET TO DEFAULT
            array.get(x).plowState = 0;
            array.get(x).seedState = 0;
            array.get(x).waterCount = 0;
            array.get(x).fertiCount = 0;
            array.get(x).seedInfo.Generate(0);
        }
    }

    // GETTERS AND SETTERS

    public int getRockState() {
        return rockState;
    }

    public void setRockState(int rockState) {
        this.rockState = rockState;
    }

    public int getPlowState() {
        return plowState;
    }

    public void setPlowState(int plowState) {
        this.plowState = plowState;
    }

    public int getSeedState() {
        return seedState;
    }

    public void setSeedState(int seedState) {
        this.seedState = seedState;
    }

    public boolean getWitherState() {
        return witherState;
    }

    public void setWitherState(boolean witherState) {
        this.witherState = witherState;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
    }

    public int getWateredToday() {
        return wateredToday;
    }

    public void setWateredToday(int wateredToday) {
        this.wateredToday = wateredToday;
    }

    public int getFertiCount() {
        return fertiCount;
    }

    public void setFertiCount(int fertiCount) {
        this.fertiCount = fertiCount;
    }

    public int getFertilizedToday() {
        return fertilizedToday;
    }

    public void setFertilizedToday(int fertilizedToday) {
        this.fertilizedToday = fertilizedToday;
    }

    public Seeds getSeedInfo() {
        return seedInfo;
    }

    public void setSeedInfo(Seeds seedInfo) {
        this.seedInfo = seedInfo;
    }

    public Exp getPlayerExp() {
        return playerExp;
    }

    public void setPlayerExp(Exp playerExp) {
        this.playerExp = playerExp;
    }

}
