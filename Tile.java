import java.util.ArrayList;
import java.util.Random;

public class Tile {
    private int rockState; // 0 with rock, 1 no rock
    private int plowState; // 0 for unplowed, 1 for plowed
    private int seedState; // 0 unplanted, 1 to 8 for types of seed, 9 if withered
    private boolean witherState; // false unwithered, true withered
    private int waterCount; // counts number of times tile has been watered
    private int wateredToday; // 0 if not yet, 1 if done already.
    private int fertiCount; // 0 if not fertilized, 1 if fertilized
    private int fertilizedToday; // 0 if not yet, 1 if done already.
    private Seeds seedInfo; // contains information regarding which seed
    private Exp playerExp;

    public Tile(Seeds seedInfo, Exp playerExp) {
        rockState = 1;
        plowState = 0;
        seedState = 0;
        witherState = false;
        waterCount = 0;
        wateredToday = 0;
        fertiCount = 0;
        fertilizedToday = 0;
        this.seedInfo = seedInfo;
        this.playerExp = playerExp;
    }

    /**
     * Method for planting a seed
     * 
     * @param array ArrayList of Tiles
     * @param x     Tile Number
     * @param y     Seed Type
     */
    public void Plant(ArrayList<Tile> array, int x, int y) {

        boolean treePos = true;

        if (x == 7 || x == 8) {
            treePos = false;
            treePos = TreeCheck(array, x);
        }

        if (array.get(x).plowState == 0) { // UNPLOWED
            System.out.println("Cannot plant seed on chosen tile. Please plow the tile first.");
        } else if (!treePos) {
            System.out.println("Cannot plant tree seed on chosen tile.");
        } else if (array.get(x).seedState == 0 && array.get(x).plowState == 1 && treePos) { // SUCCESS
            array.get(x).setSeedState(y);
            System.out.println(array.get(x).seedInfo.getName() + " seed planted Successfully! ");
        } else if (array.get(x).seedState != 0 && array.get(x).plowState == 1) { // ALREADY HAS A SEED
            System.out.println("Sorry. This tile already has a seed planted. ");
        } else if (array.get(x).seedState == 9) { // WITHERED PLANT PRESENT
            System.out.println(
                    "Sorry. There is still a withered plant present here in this tile. Please remove it first.");
        }
    }

    /**
     * Checks for surrounding tiles (for tree seeds only)
     * 
     * 
     * @param array
     * @param x
     * @return
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
        if ((array.get(x).seedInfo.getDaysLeft() <= 0 && array.get(x).getWateredToday() == 0 && array.get(x).getSeedState() != 0 )&&
        (array.get(x).getWateredToday() == 0 && array.get(x).getSeedState() != 0)) {
            System.out.println("Oh no! The " + array.get(x).seedInfo.getName() + " in Tile " + x + " has withered!");
            array.get(x).setWitherState(true);
            array.get(x).setSeedState(9);
            array.get(x).setWaterCount(0);
            array.get(x).setFertiCount(0);
            array.get(x).seedInfo.Generate(0);
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
        if (array.get(x).seedInfo.getType() > 0 && array.get(x).seedInfo.getType() < 9) { // Seed planted ranges from
                                                                                          // available ones
            // context rand.nextInt(origin, bound); origin is base, bound is peak minus 1
            // EX.
            // if origin = 7 and bound = 10
            // then rand will only produce pseudorandom numbers from 7 to 9
            produceNum = rand.nextInt(array.get(x).seedInfo.getProduceMin(), array.get(x).seedInfo.getProduceMax() + 1);

            HarvestTotal = produceNum
                    * (array.get(x).seedInfo.getBaseSell() + array.get(x).playerExp.getEarningBonus());

            WaterBonusValue = HarvestTotal * 0.2 * (array.get(x).getWaterCount() - 1);

            FertilizerBonusValue = HarvestTotal * 0.5 * (array.get(x).getFertiCount());

            FinalHarvestPrice = HarvestTotal + WaterBonusValue + FertilizerBonusValue;

            System.out.println(
                    "Yay! you have harvested " + produceNum + " pieces of " + seedInfo.getName() + ".");

            // PROFIT BREAKDOWN

            System.out.println("Profit Breakdown:");
            System.out.println("-----------------------");
            System.out.println("Total Number of Harvest: " + produceNum);
            System.out.println("Price for each " + seedInfo.getName() + ": " + seedInfo.getBaseSell());
            System.out.println("Times Plant was Watered: " + array.get(x).getWaterCount());
            System.out.println("Water Bonus: " + WaterBonusValue);
            System.out.println("Times Plant was Fertilized: " + array.get(x).getFertiCount());
            System.out.println("Fertilizer Bonus: " + FertilizerBonusValue);

            // FLOWER MULTIPLIER BONUS
            if (array.get(x).seedInfo.getType() >= 4 && array.get(x).seedInfo.getType() <= 6) {
                System.out.println("Flower Multiplier Bonus: 1.1");
                FinalHarvestPrice *= 1.1;
            }

            System.out.println("Total Profit: " + FinalHarvestPrice); // FINAL PROFIT

            System.out.println("-------------------------");

            p.setOcoins(p.getOcoins() + FinalHarvestPrice);

            System.out.println("Added " + FinalHarvestPrice + " to your inventory. Total of " + p.getOcoins()
                    + " Objectcoins in inventory.");

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
