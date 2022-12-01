import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Integer> seedInv; // Amount of seeds (and which seeds) player has
    private double Ocoins;
    private Seeds seedData; // Seed Database
    private Exp expData; // Exp Database

    public Player() {
        seedInv = new ArrayList<Integer>(8);
        Ocoins = 100;
        seedData = new Seeds();
        expData = new Exp();
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
        Seeds printTemp = new Seeds();

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
            System.out.println("----------------");
            System.out.println("[0] Exit");

            System.out.print("\nWhat seed would you like to buy: ");
            choice = input.nextInt();

            if (choice < 0 && choice > 9) {
                System.out.println("Invalid choice. Try again.");
            } else if (choice == 1) {
                seedData.Generate(choice);
                type = seedData.getType();
                if (expData.getCostReduction() == 0)
                    System.out.println(
                            "The price of one seed of " + seedData.getName() + " is " + seedData.getCost() + ".");
                else
                    System.out.println(
                            "The price of one seed of " + seedData.getName() + " is " + seedData.getCost() + " ("
                                    + expData.getCostReduction() + " Objectcoins deduction already applied)");
                System.out.print("How many would you like to buy? ");
                quantity = input.nextInt();
                if (Ocoins >= seedData.getCost() * quantity && quantity != 0) {
                    prev = seedInv.get(type - 1);
                    seedInv.set(type - 1, prev + quantity);
                    System.out.println("Purchase successful! You now have " + seedInv.get(type - 1) + " piece/s of "
                            + seedData.getName() + ".");
                    Ocoins -= (seedData.getCost() * quantity);
                    System.out.println("You now have " + Ocoins + " Objectcoins left.");
                } else if (quantity == 0) {
                    System.out.println("Please enter a value greater than 0 to buy.");
                } else {
                    System.out.println("Sorry. You do not have enough Object Coins to purchase that many.");
                }
            } else if (choice == 2) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 3) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 4) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 5) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 6) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 7) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice == 8) {
                // seedData.Generate(choice);
                System.out.println("Out of stock. Sorry.");
            } else if (choice != 0) {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
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
