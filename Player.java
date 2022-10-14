import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Integer> seeds; // Amount of seeds (and which seeds) player has
    private int Ocoins;
    private int exp;
    private Seeds seedData; // Seed Database
    private Exp expData; // Exp Database

    public Player() {
        seeds.set(0, 0);
        seeds.set(1, 0);
        seeds.set(2, 0);
        seeds.set(3, 0);
        seeds.set(4, 0);
        seeds.set(5, 0);
        seeds.set(6, 0);
        seeds.set(7, 0);
        seeds.set(8, 0);
        Ocoins = 100;
    }

    public void BuyMenu() {

    }

    public void BuySeeds() {
        Scanner input = new Scanner(System.in);
        int choice, type, quantity;

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
                    seeds.set(type, quantity); // tentative
                    System.out.println("Purchase successful! You now have " + seeds.get(type) + "pieces of "
                            + seedData.getName() + ".");
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

    public ArrayList<Integer> getSeeds() {
        return seeds;
    }

    public void setSeeds(ArrayList<Integer> seeds) {
        this.seeds = seeds;
    }

    public int getOcoins() {
        return Ocoins;
    }

    public void setOcoins(int ocoins) {
        Ocoins = ocoins;
    }

}
