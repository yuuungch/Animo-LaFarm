import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    private ArrayList<Tile> Land;
    private Player player;
    private Tile tile;
    private int day;

    public Farm(Player player, Tile tile) {
        Land = new ArrayList<Tile>();
        this.player = player;
        this.tile = tile;
        day = 1;
    }

    public void Menu() {
        Scanner input = new Scanner(System.in);
        int choice, c1, c2, i;

        player.InitializeInventory();

        Land.add(0, tile); // set tile 1 with corresponding tile state
        do {
            do {
                player.getExpData().LevelUp();

                System.out.println("Today is day " + day);

                if (Land.get(0).getSeedState() >= 1 && Land.get(0).getSeedState() <= 8) {
                    System.out.println("Incubation Period: " + Land.get(0).getSeedInfo().getHarvestTime());
                    System.out.println("Days left before Harvestable: " + Land.get(0).getSeedInfo().getDaysLeft());
                    System.out.println("Max Water Count: " + Land.get(0).getSeedInfo().getWater() + " ("
                            + Land.get(0).getSeedInfo().getBonusWater() + ")");
                    System.out.println("Current Water Count: " + Land.get(0).getWaterCount());
                    System.out.println("Max Fertilize Count: " + Land.get(0).getSeedInfo().getFertilizer() + " ("
                            + Land.get(0).getSeedInfo().getBonusFertilizer() + ")");
                    System.out.println("Current Fertilize Count: " + Land.get(0).getFertiCount());
                    System.out.println("--------------------------------------------------------------");
                }

                System.out.println("[1] Plow Tile"); // in Tile class
                System.out.println("[2] Buy Seeds"); // in Player class
                System.out.println("[3] Plant Seed"); // in Tile class
                System.out.println("[4] Water Tile"); // in Tile class
                System.out.println("[5] Fertilize Tile"); // in Tile class
                System.out.println("[6] Harvest Tile"); // in Tile class
                System.out.println("[7] Remove Withers"); // in Tile class
                System.out.println("[8] Check Player"); // in Player and Exp class
                System.out.println("[9] Rank up"); // in Player and Seeds class
                System.out.println("[0] Advance Day"); // here in Farm class

                System.out.print("\nChoice: ");
                choice = input.nextInt();

                if (choice == 1) {

                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (Land.get(c1).getPlowState() == 0 || Land.get(c1).getPlowState() == 1
                            || Land.get(c1).getPlowState() == 2) {
                        tile.Plow(Land, c1);
                    }

                } else if (choice == 2) {
                    player.BuySeeds();
                } else if (choice == 3) {
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    if (Land.get(c1).getSeedState() == 0) {
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

                            System.out.print("\nWhat seed would you like to plant: ");
                            c2 = input.nextInt();

                            if (c2 >= 1 && c2 <= 9) {
                                Land.get(c1).SeedInfoGen(c2);

                                if (player.getSeedInv().get(Land.get(c1).getSeedInfo().getType() - 1) == 0) {
                                    System.out.println("Sorry. You do not have enough seeds of that kind ("
                                            + Land.get(c1).getSeedInfo().getName() + ")");
                                } else {
                                    player.getSeedInv().set(Land.get(c1).getSeedInfo().getType() - 1,
                                            player.getSeedInv().get(Land.get(c1).getSeedInfo().getType() - 1) - 1);
                                    tile.Plant(Land, c1, c2);
                                }
                            }
                        } while (c2 < 1 && c2 > 9);

                    }
                } else if (choice == 4) {
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    tile.Water(Land, c1);

                } else if (choice == 5) {
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    tile.Fertilize(Land, c1, player);

                } else if (choice == 6) {
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    tile.Harvest(Land, c1, player);

                } else if (choice == 7) {
                    System.out.print("Enter tile number: ");
                    c1 = input.nextInt();

                    tile.RemoveWither(Land, c1, player);

                } else if (choice == 8) {
                    System.out.println("---------------------------------");

                    player.CheckSeedInventory();
                    System.out.println("Objectcoins Available: " + player.getOcoins());
                    System.out.println("---------------------------------");
                    player.CheckExpBonus();
                } else if (choice == 9) {
                    player.getExpData().Registration(player);

                    player.getSeedData().ExpChange(player.getExpData().getEarningBonus(),
                            player.getExpData().getCostReduction(), player.getExpData().getWaterBonus(),
                            player.getExpData().getFertiBonus());
                }

            } while (choice != 0);
            day++;

            for (i = 0; i < Land.size(); i++) {
                tile.WitherCheck(Land, i);
                Land.get(i).setWateredToday(0);
                Land.get(i).setFertilizedToday(0);
                if (Land.get(i).getSeedInfo().getDaysLeft() > 0)
                    Land.get(i).getSeedInfo().setDaysLeft(Land.get(i).getSeedInfo().getDaysLeft() - 1);
            }
        } while (day != 1000); // temporary
        System.out.println("You have reached 1000 days. Thank you for playing MyFarm.");
    }

    // GETTERS AND SETTERS

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
