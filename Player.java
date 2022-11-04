import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Integer> seedInv; // Amount of seeds (and which seeds) player has
    private double Ocoins;
    private Seeds seedData; // Seed Database
    private Exp expData; // Exp Database

    public Player(ArrayList<Integer> seedInv, Seeds seedData, Exp expData) {
        this.seedInv = seedInv;
        Ocoins = 100;
        this.seedData = seedData;
        this.expData = expData;
    }

    public void CheckExpBonus() {
        expData.CheckStatus();
    }

    public void CheckSeedInventory() {
        System.out.println(seedInv);
    }

    public void BuyMenu() {

    }

    public void BuySeeds(){
        Scanner input = new Scanner(System.in);
        int choice, type, prev, quantity;

        do {
            System.out.println("--Root Crops--");
            System.out.println("[1] Turnip");
            System.out.println("[2] Carrot");
            System.out.println("[3] Potato");
            System.out.println("[4] Rose");
            System.out.println("--Flowers--");
            System.out.println("[5] Turnip");
            System.out.println("[6] Sunflower");
            System.out.println("--Fruit Trees--");
            System.out.println("[7] Mango");
            System.out.println("[8] Apple");

            System.out.print("\nWhat seed would you like to buy: ");
            choice = input.nextInt();

            if (choice < 0 && choice > 9) {
                System.out.println("Invalid choice. Try again.");
            } else if (choice == 1) {
                seedData.Generate(choice);
                type = seedData.getType();
                System.out.print("How many would you like to buy? ");
                quantity = input.nextInt();
                if (Ocoins >= seedData.getCost() * quantity) {
                    prev = seedInv.get(type - 1);
                    seedInv.set(type - 1, prev + quantity); // tentative
                    System.out.println("Purchase successful! You now have " + seedInv.get(type - 1) + " pieces of "
                            + seedData.getName() + ".");
                    Ocoins -= (seedData.getCost() * quantity);
                    System.out.println("You now have " + Ocoins + " Objectcoins left.");
                } else {
                    System.out.println("Sorry. You do not have enough Object Coins to purchase that many.");
                }
            } else if (choice == 2) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 3) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 4) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 5) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 6) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 7) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 8) {
                seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            }
        } while (choice < 0 && choice > 9);
    
    }
    public boolean runOutOfSeeds (ArrayList<Integer> seedInv){
        return seedInv.isEmpty() || seedInv.stream()
        .allMatch(seedInv.get(0)::equals);
    }

    //plant seed (minus 1 on seed inventory)
    public void PlantSeed (int seed) {
        seedInv.set(seed-1, seedInv.get(seed)); // change thissss
        System.out.println("You are now planting " + seedData.getName() + ".");
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

    public void setOcoins(double d) {
        Ocoins = d;
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
