import java.util.ArrayList;
import java.util.Random;

// import java.util.Scanner;

public class Tile {
    private int plowState; // 0 = for no rocks and unplowed,
                           // 1 = for no rocks and plowed,
                           // 2 = for with rocks
    private int seedState; // 0 = unplanted, 1 = planted, 2 = withered
    private int seedPlanted; //(root crop) 1 = Turnip, 2 = Carrot, 3 = Potato, 4 = Rose
                             // (flower)   5 = Turnip, 6 = Sunflower
                             //(fruit tree)7 = Mango,  8 = Apple
                             //0 = no plant
    private int waterState; 
    private int fertilizedState;
    private int plantDate; 
    private int produce;

    public Tile(int plowState, int seedState, int seedPlanted, int waterState, int fertilizedState, int plantDate, int produce) {
        this.plowState = plowState;
        this.seedState = seedState;
        this.seedPlanted = seedPlanted;
        this.waterState = waterState;
        this.fertilizedState = fertilizedState;
        this.plantDate = plantDate;
        this.produce = produce;
    }

    public int createProduce(int seed){
        if (seed == 1 || seed == 2) {
            int max = 2;
            int min = 1;
            Random randomNum = new Random();
            produce = min + randomNum.nextInt(max);
        } else if (seed == 3) {
            int max = 10;
            int min = 1;
            Random randomNum = new Random();
            produce = min + randomNum.nextInt(max);
        } else if (seed == 4|| seed == 5 || seed == 6) {
            produce = 1;
        } else if (seed == 7) {
            int max = 15;
            int min = 5;
            Random randomNum = new Random();
            produce = min + randomNum.nextInt(max);
        } else if (seed == 8) {
            int max = 15;
            int min = 10;
            Random randomNum = new Random();
            produce = min + randomNum.nextInt(max);
        }
        return produce;
    }

    public Integer getPlowState() {
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

    public int getSeedPlanted() {
        return seedPlanted;
    }

    public void setSeedPlanted(int seedPlanted) {
        this.seedPlanted = seedPlanted;
    }

    public int getWaterState() {
        return waterState;
    }

    public void setWaterState(int waterState) {
        this.waterState = waterState;
    }

    public int getFertilizedState() {
        return fertilizedState;
    }

    public void setFertilizedState(int fertilizedState) {
        this.fertilizedState = fertilizedState;
    }

    public int getPlantDate() {
        return plantDate;
    }

    public void setPlantDate(int plantDate) {
        this.plantDate = plantDate;
    }

    public void setProduce(int produce) {
        this.produce = produce;
    }
    
}
