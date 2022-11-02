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

    public Tile(Exp playerExp) {
        rockState = 1;
        plowState = 0;
        seedState = 0;
        witherState = false;
        waterCount = 0;
        wateredToday = 0;
        fertiCount = 0;
        fertilizedToday = 0;
        seedInfo = new Seeds();
        this.playerExp = playerExp;
    }

    public void Plow(ArrayList<Tile> array, int x) {
        if (array.get(x).plowState == 0 && array.get(x).rockState != 0) {
            array.get(x).setPlowState(1);
            System.out.println("Tile has been successfully plowed!");
            playerExp.GainExp(0.5, array.get(x).playerExp);
        } else if (array.get(x).plowState == 1) {
            System.out.println("Tile is already plowed!");
        } else if (array.get(x).plowState == 0 && array.get(x).rockState == 0) {
            System.out.println("Tile cannot be plowed as there are rocks on it.");
        }
    }

    public void Plant(ArrayList<Tile> array, int x, int y) {
        if (array.get(x).plowState == 0) {
            System.out.println("Cannot plant seed on chosen tile. Please plow the tile first.");
        } else if (array.get(x).seedState == 0 && array.get(x).plowState == 1) {
            array.get(x).setSeedState(y);
            System.out.println(array.get(x).seedInfo.getName() + " seed planted Successfully! ");
        } else if (array.get(x).seedState != 0 && array.get(x).plowState == 1) {
            System.out.println("Sorry. This tile already has a seed planted. ");
        } else if (array.get(x).seedState == 9) {
            System.out.println(
                    "Sorry. There is still a withered plant present here in this tile. Please remove it first.");
        }
    }

    public void Water(ArrayList<Tile> array, int x) {
        if (array.get(x).waterCount <= seedInfo.getWater() || array.get(x).waterCount < seedInfo.getBonusWater()
                && array.get(x).wateredToday == 0) {
            array.get(x).waterCount++;
            array.get(x).wateredToday = 1;
            System.out.println("Tile watered successfully.");
            playerExp.GainExp(0.5, array.get(x).playerExp);
        } else if (array.get(x).waterCount <= seedInfo.getWater() || array.get(x).waterCount <= seedInfo.getBonusWater()
                && array.get(x).wateredToday == 1) {
            System.out
                    .println("Tile has already been watered today. Please come again tomorrow to continute watering.");
        } else if (array.get(x).waterCount > seedInfo.getWater()
                && array.get(x).waterCount >= seedInfo.getBonusWater()) {
            System.out.println("You have reached the maximum amount that you can water this tile.");
        } else if (array.get(x).seedState == 9) {
            System.out.println(
                    "Sorry. There is still a withered plant present here in this tile. Please remove it first.");
        }
    }

    public void Fertilize(ArrayList<Tile> array, int x, Player p) {
        if (array.get(x).fertiCount <= seedInfo.getFertilizer()
                || array.get(x).fertiCount < seedInfo.getBonusFertilizer()
                        && seedInfo.getFertilizer() + seedInfo.getBonusFertilizer() != 0
                        && array.get(x).fertilizedToday == 0) {
            array.get(x).fertiCount++;
            array.get(x).fertilizedToday = 1;
            System.out.println("Tile fertilized successfully.");
            p.setOcoins(p.getOcoins() - 10);
            System.out.println(
                    "Deducted 10 Objectcoins from your Inventory. " + p.getOcoins() + " remaining.");
            playerExp.GainExp(4, array.get(x).playerExp);
        } else if (array.get(x).fertiCount <= seedInfo.getFertilizer()
                || array.get(x).fertiCount <= seedInfo.getBonusFertilizer()
                        && seedInfo.getFertilizer() + seedInfo.getBonusFertilizer() != 0
                        && array.get(x).fertilizedToday == 1) {
            System.out.println(
                    "Tile has already been fertilized today. Please come again tomorrow to continue fertilizing.");
        } else if (array.get(x).fertiCount > seedInfo.getFertilizer()
                && array.get(x).fertiCount >= seedInfo.getBonusFertilizer()) {
            System.out.println("You have reached the maximum amount that you can fertilize this tile.");
        } else if (array.get(x).seedState == 9) {
            System.out.println(
                    "Sorry. There is still a withered plant present here in this tile. Please remove it first.");
        }
    }

    public void RemoveWither(ArrayList<Tile> array, int x, Player p) {
        if (!array.get(x).witherState) {
            System.out.println("Sorry. The current tile does not contain a withered plant.");
        } else if (array.get(x).witherState && p.getOcoins() > 0) {
            p.setOcoins(p.getOcoins() - 7);
            System.out.println("Withered plant successfully removed. Deducting 7 Objectcoins from inventory. "
                    + p.getOcoins() + " Objectcoins remaining.");

            playerExp.GainExp(2, array.get(x).playerExp);

            array.get(x).plowState = 0;
            array.get(x).witherState = false;
            array.get(x).seedState = 1;
        } else {
            System.out.println(
                    "Sorry. You do not have enough Objectcoins to remove the withered plant in Tile " + x + ".");
        }
    }

    public void WitherCheck(ArrayList<Tile> array, int x) {
        if (array.get(x).seedInfo.getDaysLeft() < 0 || array.get(x).wateredToday == 0 && array.get(x).seedState != 0) {
            System.out.println("Oh no! The " + array.get(x).seedInfo.getName() + " in Tile " + x + " has withered!");
            array.get(x).witherState = true;
            array.get(x).seedState = 9;
            array.get(x).waterCount = 0;
            array.get(x).fertiCount = 0;
            array.get(x).seedInfo.Generate(0);
        }
    }

    public void Harvest(ArrayList<Tile> array, int x, Player p) {
        Random rand = new Random();

        int produceNum;
        double HarvestTotal, WaterBonusValue, FertilizerBonusValue, FinalHarvestPrice;
        if (array.get(x).seedInfo.getType() > 0 && array.get(x).seedInfo.getType() != 9) {

            produceNum = rand.nextInt(array.get(x).seedInfo.getProduceMin(), array.get(x).seedInfo.getProduceMax() + 1);
            HarvestTotal = produceNum
                    * (array.get(x).seedInfo.getBaseSell() + array.get(x).playerExp.getEarningBonus());
            WaterBonusValue = HarvestTotal * 0.2 * (array.get(x).getWaterCount() - 1);
            FertilizerBonusValue = HarvestTotal * 0.5 * (array.get(x).getFertiCount());
            FinalHarvestPrice = HarvestTotal + WaterBonusValue + FertilizerBonusValue;

            System.out.println(
                    "Yay! you have harvested " + produceNum + " pieces of " + seedInfo.getName() + ".");
            System.out.println("Profit Breakdown:");
            System.out.println("-----------------------");
            System.out.println("Total Number of Harvest: " + produceNum);
            System.out.println("Price for each " + seedInfo.getName() + ": " + seedInfo.getBaseSell());
            System.out.println("Times Plant was Watered: " + array.get(x).getWaterCount());
            System.out.println("Water Bonus: " + WaterBonusValue);
            System.out.println("Times Plant was Fertilized: " + array.get(x).getFertiCount());
            System.out.println("Fertilizer Bonus: " + FertilizerBonusValue);

            if (array.get(x).seedInfo.getType() >= 4 && array.get(x).seedInfo.getType() <= 6) {
                System.out.println("Flower Multiplier Bonus: 1.1");
                FinalHarvestPrice *= 1.1;
            }

            System.out.println("Total Profit: " + FinalHarvestPrice);

            System.out.println("-------------------------");

            p.setOcoins(p.getOcoins() + FinalHarvestPrice);

            System.out.println("Added " + FinalHarvestPrice + " to your inventory. Total of " + p.getOcoins()
                    + " Objectcoins in inventory.");

            playerExp.GainExp(array.get(x).seedInfo.getExpYield(), array.get(x).playerExp);

            array.get(x).plowState = 0;
            array.get(x).seedState = 0;
            array.get(x).waterCount = 0;
            array.get(x).fertiCount = 0;
            array.get(x).seedInfo.Generate(0);
        }
    }

    public void SeedInfoGen(int x) {
        seedInfo.Generate(x);
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
