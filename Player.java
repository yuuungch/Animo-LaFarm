import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Integer> seedInv; // Amount of seeds (and which seeds) player has
    private double Ocoins = 100;
    private Seeds seedData; // Seed Database
    private Exp expData; // Exp Database
    private Store store;

    public Player(Store store) {
        seedInv = new ArrayList<Integer>(8);
        Ocoins = 100;
        seedData = new Seeds(0);
        expData = new Exp();
        this.store = store;
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

        System.out.print("Seed Names: [");

        for (i = 1; i <= 7; i++) {
            printTemp.Generate(i);
            System.out.print(printTemp.getName() + ", ");
        }
        printTemp.Generate(i);
        System.out.println(printTemp.getName() + "]");
        System.out.println("Seed Inventory : " + seedInv);
    }

    /**
     * Menu for buying seeds
     */
    public void BuySeeds() {
        int choice, type, prev, quantity = 1;
   
        seedData.Generate(store.getCurrent());
        type = seedData.getType();
        if (Ocoins >= seedData.getCost() * quantity && quantity != 0) {
            prev = seedInv.get(type - 1);
            seedInv.set(type - 1, prev + quantity);
            //try to notify player how many seeds have been bought. TODO DEBUG
            Ocoins -= (seedData.getCost() * quantity);
            //update player info
        } else {
            //System.out.println("Sorry. You do not have enough Object Coins to purchase that many.");
            //update user that they do not have enough coins using a window TODO DEBUG
            Ocoins += Ocoins;
        }
    }

    /**
     * Method for checking if the seeds of the player has run out
     * 

     */
    public boolean runOutOfSeeds (){
        return seedInv.isEmpty() || seedInv.stream()
        .allMatch(seedInv.get(0)::equals);
    }

    public ArrayList<Integer> getSeedInv() {
        return seedInv;
    }

    public void setSeedInv(ArrayList<Integer> seedInv) {
        this.seedInv = seedInv;
    }

    public double getOcoins() {
        return Ocoins;
    }

    public void setOcoins(double ocoins) {
        Ocoins = ocoins;
    }

    public Seeds getSeedData() {
        return seedData;
    }

    public void setSeedData(Seeds seedData) {
        this.seedData = seedData;
    }

    public Exp getExpData() {
        return expData;
    }

    public void setExpData(Exp expData) {
        this.expData = expData;
    }

}
