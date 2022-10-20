import java.util.ArrayList;
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
    //private Seeds seedData; // Seed Database

    

    // public Tile() {
    //     plowState = 0;
    //     seedState = 0;
    //     seedPlanted = 0;
    //     waterState = 0;
    //     fertilizedState = 0;
    //     plantDate = 0;
    // }

    // public void Plow(Tile[][] array, int r, int c) {
    //     if (array[r][c] ) {
    //         array.set(x, 1);
    //         System.out.println("Tile has been successfully plowed!");
    //     } else if (array.get(x) == 1) {
    //         System.out.println("Tile is already plowed!");
    //     } else if (array.get(x) == 2) {
    //         System.out.println("Tile cannot be plowed as there are rocks on it.");
    //     }
    //}

    // public void Plant(ArrayList<Integer> array, int x, int y, int seed){
    //     if (array.get(x) == 0) {
    //         array.set(x, 1);
    //         array.set(y, seed);
    //         System.out.println("Seed has been successfully planted!");
    //     } else if (array.get(x) == 1) {
    //         System.out.println("A seed is already planted!");
    //     } 
    // }

    // public void Water(ArrayList<Integer> array, int x){
    //     if (array.get(x) >= 0|| array.get(x) <= seedData.getBonusWater()) {
    //         array.set(x, array.get(x)+1);
    //         System.out.println("Plant has been successfully watered!");
    //     } else if (array.get(x) > seedData.getBonusWater()) {
    //         System.out.println("Plant is already on bonus water limit!");
    //     } 
    // }

    // public void Fertilize(ArrayList<Integer> array, int x){
    //     if (array.get(x) >= 0|| array.get(x) <= seedData.getBonusFertilizer()) {
    //         array.set(x, array.get(x)+1);
    //         System.out.println("Plant has been successfully fertilized!");
    //     } else if (array.get(x) > seedData.getBonusFertilizer()) {
    //         System.out.println("Plant is already on bonus fertilize limit!");
    //     } 
    // }

    // public void Harvest(ArrayList<Integer> array, int x){
    //     if (array.get(3) >= seedData.getWater() && array.get(4) >= seedData.getFertilizer()){
    //         array.set(x, 0);
    //         array.set(x-1, 0);
    //         array.set(x-2, 0);
    //     }
    // }


    public Tile(int plowState, int seedState, int seedPlanted, int waterState, int fertilizedState, int plantDate) {
        this.plowState = plowState;
        this.seedState = seedState;
        this.seedPlanted = seedPlanted;
        this.waterState = waterState;
        this.fertilizedState = fertilizedState;
        this.plantDate = plantDate;
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
    
}
