import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    private Player player;
    private Tile tile;
    private int day;

    public Farm(Player player, Tile tile) {
        this.player = player;
        this.tile = tile;
        day = 1;
    }

    public void Menu() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> Land = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int choice, c1, i;

        Land.add(0, tile.getPlowState()); // set tile 1 with corresponding tile state

        for (i = 0; i < 8; i++) {
            temp.add(i, 0);
        }
        player.setSeedInv(temp);

        do {
            System.out.println("Land State: " + Land); // debugging
            System.out.println("[1] Plow Tile"); // in Tile class
            System.out.println("[2] Buy Seeds"); // in Player class
            System.out.println("[3] Plant Seed"); // in Tile class
            System.out.println("[4] Water Tile"); // in Tile class
            System.out.println("[5] Harvest Tile"); // in Tile class
            System.out.println("[6] Check Player"); // in Player and Exp class
            System.out.println("[0] Advance Day"); // here in Farm class

            System.out.print("\nChoice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                if (Land.get(c1) == 0 || Land.get(c1) == 1 || Land.get(c1) == 2) {
                    tile.Plow(Land, c1);
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }

            } else if (choice == 2) {
                player.BuySeeds();
            } else if (choice == 6) {
                System.out.println("---------------------------------");

                player.CheckSeedInventory();
                System.out.println("Objectcoins Available: " + player.getOcoins());
                System.out.println("---------------------------------");
                player.CheckExpBonus();
            }

        } while (choice != 0);

    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
