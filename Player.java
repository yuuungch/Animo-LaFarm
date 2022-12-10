import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Integer> seedInv; // Amount of seeds (and which seeds) player has
    private double Ocoins;
    private Seeds seedData; // Seed Database
    private Exp expData; // Exp Database
    private Store store;
    private String output;
    private String output2;
    private String temp;
    private String tempp;

    public Player(Store store) {
        seedInv = new ArrayList<Integer>(8);
        Ocoins = 100;
        seedData = new Seeds(0);
        this.store = store;
        expData = new Exp();
        tempp = "";
    }

    /**
     * This method serves to initialize the seed inventory of the player
     */
    public void InitializeInventory() {
        int i;

        for (i = 0; i < 8; i++) {
            seedInv.add(i, 0);
        }
    }

    /**
     * Check Player's Seed Inventory
     */
    public void CheckSeedInventory() {
        int i;
        Seeds printTemp = new Seeds(0);

        temp = "Seed Names: [";

        if (tempp == "") {
            for (i = 1; i <= 7; i++) {
                printTemp.Generate(i);
                tempp = tempp + printTemp.getName() + ", ";
            }
            printTemp.Generate(i);
            output = temp + tempp + printTemp.getName() + "]";
        }
        output2 = "Seed Inventory : " + seedInv;
    }

    public void ClearOutputs() {
        output = "";
        output2 = "";
    }

    /**
     * Menu for buying seeds
     */
    public void BuySeeds() {
        int choice, type, prev, quantity = 1;
        String output;

        seedData.Generate(store.getCurrent());
        type = seedData.getType();
        if (Ocoins >= seedData.getCost() * quantity && quantity != 0) {
            prev = seedInv.get(type - 1);
            seedInv.set(type - 1, prev + quantity);
            // try to notify player how many seeds have been bought. TODO DEBUG
            Ocoins -= (seedData.getCost() * quantity);
            // update player info
            output = "Successfully bought 1 piece of " + seedData.getName() + ". \n" + Ocoins
                    + " Objectcoins remaining.";
        } else {
            // System.out.println("Sorry. You do not have enough Object Coins to purchase
            // that many.");
            // update user that they do not have enough coins using a window TODO DEBUG
            output = "Sorry. You do not have enough Objectcoins to purchase that many.";
        }
        WindowResultGui result = new WindowResultGui(output);
    }

    /**
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> getSeedInv() {
        return seedInv;
    }

    /**
     * @param seedInv
     */
    public void setSeedInv(ArrayList<Integer> seedInv) {
        this.seedInv = seedInv;
    }

    /**
     * @return double
     */
    public double getOcoins() {
        return Ocoins;
    }

    /**
     * @param ocoins
     */
    public void setOcoins(double ocoins) {
        Ocoins = ocoins;
    }

    /**
     * @return Seeds
     */
    public Seeds getSeedData() {
        return seedData;
    }

    /**
     * @param seedData
     */
    public void setSeedData(Seeds seedData) {
        this.seedData = seedData;
    }

    /**
     * @return Exp
     */
    public Exp getExpData() {
        return expData;
    }

    /**
     * @param expData
     */
    public void setExpData(Exp expData) {
        this.expData = expData;
    }

    /**
     * @return String
     */
    public String getOutput() {
        return output;
    }

    /**
     * @return String
     */
    public String getOutput2() {
        return output2;
    }

}
