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
        int choice, c1;

        Land.add(tile.getPlowState()); // set tile 1 with corresponding tile state

        System.out.println(Land); // debugging

        do {
            System.out.println("[1] Plow Tile"); // in Tile class
            System.out.println("[2] Buy Seeds"); // in Player class
            System.out.println("[3] Plant Seed"); // in Tile class
            System.out.println("[4] Water Tile"); // in Tile class
            System.out.println("[5] Harvest Tile"); // in Tile class
            System.out.println("[0] Advance Day"); // here in Farm class

            System.out.print("\nChoice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter tile number: ");
                c1 = input.nextInt();

                switch (Land.get(c1)) {
                    case 0:
                    case 1:
                    case 2:
                        tile.Plow(Land, c1);
                        break;
                    default:
                        System.out.println("Invalid Tile. Tile does not exist.");

                }
            } else if (choice == 2) {
                player.BuySeeds();
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
