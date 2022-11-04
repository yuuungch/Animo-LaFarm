import java.util.Random;

public class Seeds {
    private int type;
    private String name;
    private int harvestTime;
    private int water;
    private int bonusWater;
    private int fertilizer;
    private int bonusFertilizer;
    private int produce;
    private int cost;
    private int baseSell;
    private double expYield;

    public Seeds() {
        type = 0;
        name = "";
        harvestTime = 0;
        water = 0;
        bonusWater = 0;
        fertilizer = 0;
        bonusFertilizer = 0;
        produce = 0;
        cost = 0;
        baseSell = 0;
        expYield = 0;
    }

    /*
     * 1. Turnip (root Crop)
     * 2. Carrot
     * 3. Potato
     * 4. Rose
     * 5. Turnips (Flower)
     * 6. Sunflower
     * 7. Mango
     * 8. Apple
     */
    public void Generate(int x) {
        if (x == 1) {
            type = 1;
            name = "Turnip (root crop)";
            harvestTime = 2;
            water = 1;
            bonusWater = 2;
            fertilizer = 0;
            bonusFertilizer = 1;
            //produce = 1-2;
            cost = 5;
            baseSell = 6;
            expYield = 5;
        } else if (x == 2) {
            type = 2;
            name = "Carrot";
            harvestTime = 3;
            water = 1;
            bonusWater = 2;
            fertilizer = 0;
            bonusFertilizer = 1;
            //produce = 1-2;
            cost = 10;
            baseSell = 9;
            expYield = 7.5;
        } else if (x == 3) {
            type = 3;
            name = "Potato";
            harvestTime = 5;
            water = 3;
            bonusWater = 4;
            fertilizer = 1;
            bonusFertilizer = 2;
            //produce = 1-10;
            cost = 20;
            baseSell = 3;
            expYield = 12.5;
        } else if (x == 4) {
            type = 4;
            name = "Rose";
            harvestTime = 1;
            water = 1;
            bonusWater = 2;
            fertilizer = 0;
            bonusFertilizer = 1;
            //produce = 1;
            cost = 10;
            baseSell = 5;
            expYield = 2.5;
        } else if (x == 5) {
            type = 5;
            name = "Turnip (Flower)";
            harvestTime = 2;
            water = 2;
            bonusWater = 3;
            fertilizer = 0;
            bonusFertilizer = 1;
            //produce = 1;
            cost = 10;
            baseSell = 19;
            expYield = 5;
        } else if (x == 6) {
            type = 6;
            name = "Sunflower";
            harvestTime = 3;
            water = 2;
            bonusWater = 3;
            fertilizer = 1;
            bonusFertilizer = 2;
            // produce = 1;
            cost = 20;
            baseSell = 19;
            expYield = 7.5;
        } else if (x == 7) {
            type = 7;
            name = "Mango";
            harvestTime = 10;
            water = 7;
            bonusWater = 7;
            fertilizer = 4;
            bonusFertilizer = 4;
            //produce = 5-15;
            cost = 100;
            baseSell = 8;
            expYield = 25;
        } else if (x == 8) {
            type = 8;
            name = "Apple";
            harvestTime = 10;
            water = 7;
            bonusWater = 7;
            fertilizer = 5;
            bonusFertilizer = 5;
            //produce = 10-15;
            cost = 200;
            baseSell = 5;
            expYield = 25;
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(int harvestTime) {
        this.harvestTime = harvestTime;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getBonusWater() {
        return bonusWater;
    }

    public void setBonusWater(int bonusWater) {
        this.bonusWater = bonusWater;
    }

    public int getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(int fertilizer) {
        this.fertilizer = fertilizer;
    }

    public int getBonusFertilizer() {
        return bonusFertilizer;
    }

    public void setBonusFertilizer(int bonusFertilizer) {
        this.bonusFertilizer = bonusFertilizer;
    }

    public int getProduce() {
        return produce;
    }

    public void setProduce(int produce) {
        this.produce = produce;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getBaseSell() {
        return baseSell;
    }

    public void setBaseSell(int baseSell) {
        this.baseSell = baseSell;
    }

    public double getExpYield() {
        return expYield;
    }

    public void setExpYield(double expYield) {
        this.expYield = expYield;
    }


}
