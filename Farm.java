import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    //attributes
    private Player player;
    private Tile tile;
    private int day;

    //constructor
    public Farm(Player player, Tile tile) {
        this.player = player;
        this.tile = tile;
        day = 1;
    }
    
    //create method for menu
    public void Menu() {
        //create scanner for user inputs
        Scanner input = new Scanner(System.in);

        //create arraylist for the farm land
        ArrayList<ArrayList<ArrayList<Integer>>> Land = new ArrayList(9);
        //create row 1 of the land
        ArrayList<ArrayList<Integer>> row1 = new ArrayList(4);
        //create row 2 of the land
        ArrayList<ArrayList<Integer>> row2 = new ArrayList(4);
        //create row 3 of the land
        ArrayList<ArrayList<Integer>> row3 = new ArrayList(4);
        //create row 4 of the land
        ArrayList<ArrayList<Integer>> row4 = new ArrayList(4);
        //create row 5 of the land
        ArrayList<ArrayList<Integer>> row5 = new ArrayList(4);
        //create row 6 of the land
        ArrayList<ArrayList<Integer>> row6 = new ArrayList(4);
        //create row 7 of the land
        ArrayList<ArrayList<Integer>> row7 = new ArrayList(4);
        //create row 8 of the land
        ArrayList<ArrayList<Integer>> row8 = new ArrayList(4);
        //create row 9 of the land
        ArrayList<ArrayList<Integer>> row9 = new ArrayList(4);
        //create row 10 of the land
        ArrayList<ArrayList<Integer>> row10 = new ArrayList(4);
        //create lotinfo for row 1
        ArrayList<Integer> r1c1 = new ArrayList<Integer>();
        ArrayList<Integer> r1c2 = new ArrayList<Integer>();
        ArrayList<Integer> r1c3 = new ArrayList<Integer>();
        ArrayList<Integer> r1c4 = new ArrayList<Integer>();
        ArrayList<Integer> r1c5 = new ArrayList<Integer>();
        //create lotinfo for row 2
        ArrayList<Integer> r2c1 = new ArrayList<Integer>();
        ArrayList<Integer> r2c2 = new ArrayList<Integer>();
        ArrayList<Integer> r2c3 = new ArrayList<Integer>();
        ArrayList<Integer> r2c4 = new ArrayList<Integer>();
        ArrayList<Integer> r2c5 = new ArrayList<Integer>();
        //create lotinfo for row 3
        ArrayList<Integer> r3c1 = new ArrayList<Integer>();
        ArrayList<Integer> r3c2 = new ArrayList<Integer>();
        ArrayList<Integer> r3c3 = new ArrayList<Integer>();
        ArrayList<Integer> r3c4 = new ArrayList<Integer>();
        ArrayList<Integer> r3c5 = new ArrayList<Integer>();
        //create lotinfo for row 4
        ArrayList<Integer> r4c1 = new ArrayList<Integer>();
        ArrayList<Integer> r4c2 = new ArrayList<Integer>();
        ArrayList<Integer> r4c3 = new ArrayList<Integer>();
        ArrayList<Integer> r4c4 = new ArrayList<Integer>();
        ArrayList<Integer> r4c5 = new ArrayList<Integer>();
        //create lotinfo for row 5
        ArrayList<Integer> r5c1 = new ArrayList<Integer>();
        ArrayList<Integer> r5c2 = new ArrayList<Integer>();
        ArrayList<Integer> r5c3 = new ArrayList<Integer>();
        ArrayList<Integer> r5c4 = new ArrayList<Integer>();
        ArrayList<Integer> r5c5 = new ArrayList<Integer>();
        //create lotinfo for row 6
        ArrayList<Integer> r6c1 = new ArrayList<Integer>();
        ArrayList<Integer> r6c2 = new ArrayList<Integer>();
        ArrayList<Integer> r6c3 = new ArrayList<Integer>();
        ArrayList<Integer> r6c4 = new ArrayList<Integer>();
        ArrayList<Integer> r6c5 = new ArrayList<Integer>();
        //create lotinfo for row 7
        ArrayList<Integer> r7c1 = new ArrayList<Integer>();
        ArrayList<Integer> r7c2 = new ArrayList<Integer>();
        ArrayList<Integer> r7c3 = new ArrayList<Integer>();
        ArrayList<Integer> r7c4 = new ArrayList<Integer>();
        ArrayList<Integer> r7c5 = new ArrayList<Integer>();
        //create lotinfo for row 8
        ArrayList<Integer> r8c1 = new ArrayList<Integer>();
        ArrayList<Integer> r8c2 = new ArrayList<Integer>();
        ArrayList<Integer> r8c3 = new ArrayList<Integer>();
        ArrayList<Integer> r8c4 = new ArrayList<Integer>();
        ArrayList<Integer> r8c5 = new ArrayList<Integer>();
        //create lotinfo for row 9
        ArrayList<Integer> r9c1 = new ArrayList<Integer>();
        ArrayList<Integer> r9c2 = new ArrayList<Integer>();
        ArrayList<Integer> r9c3 = new ArrayList<Integer>();
        ArrayList<Integer> r9c4 = new ArrayList<Integer>();
        ArrayList<Integer> r9c5 = new ArrayList<Integer>();
        //create lotinfo for row 10
        ArrayList<Integer> r10c1 = new ArrayList<Integer>();
        ArrayList<Integer> r10c2 = new ArrayList<Integer>();
        ArrayList<Integer> r10c3 = new ArrayList<Integer>();
        ArrayList<Integer> r10c4 = new ArrayList<Integer>();
        ArrayList<Integer> r10c5 = new ArrayList<Integer>();
        
        //add lotinfo to row1
        row1.add(r1c1);
        row1.add(r1c2);
        row1.add(r1c3);
        row1.add(r1c4);
        row1.add(r1c5);
        //add lotinfo to row2
        row2.add(r2c1);
        row2.add(r2c2);
        row2.add(r2c3);
        row2.add(r2c4);
        row2.add(r2c5);
        //add lotinfo to row3
        row3.add(r3c1);
        row3.add(r3c2);
        row3.add(r3c3);
        row3.add(r3c4);
        row3.add(r3c5);
        //add lotinfo to row4
        row4.add(r4c1);
        row4.add(r4c2);
        row4.add(r4c3);
        row4.add(r4c4);
        row4.add(r4c5);
        //add lotinfo to row5
        row5.add(r5c1);
        row5.add(r5c2);
        row5.add(r5c3);
        row5.add(r5c4);
        row5.add(r5c5);
         //add lotinfo to row6
         row6.add(r6c1);
         row6.add(r6c2);
         row6.add(r6c3);
         row6.add(r6c4);
         row6.add(r6c5);
         //add lotinfo to row7
         row7.add(r7c1);
         row7.add(r7c2);
         row7.add(r7c3);
         row7.add(r7c4);
         row7.add(r7c5);
         //add lotinfo to row8
         row8.add(r8c1);
         row8.add(r8c2);
         row8.add(r8c3);
         row8.add(r8c4);
         row8.add(r8c5);
         //add lotinfo to row9
         row9.add(r9c1);
         row9.add(r9c2);
         row9.add(r9c3);
         row9.add(r9c4);
         row9.add(r9c5);
         //add lotinfo to row10
         row10.add(r10c1);
         row10.add(r10c2);
         row10.add(r10c3);
         row10.add(r10c4);
         row10.add(r10c5);

        //add the rows to the land
        Land.add(row1);
        Land.add(row2);
        Land.add(row3);
        Land.add(row4);
        Land.add(row5);
        Land.add(row6);
        Land.add(row7);
        Land.add(row8);
        Land.add(row9);
        Land.add(row10);

        //create temporary arraylist for player seed inventory
        ArrayList<Integer> temp = new ArrayList<Integer>();

        //variables needed in method
        int choice, r1, c1, s3, r3, c3, r4, c4, r5, c5, r6, c6, i;

        // set tile with corresponding tile state
        r1c1.add(0, tile.getPlowState()); 
        r1c1.add(1, tile.getSeedState());
        r1c1.add(2, tile.getSeedPlanted());
        r1c1.add(3, tile.getWaterState());
        r1c1.add(4, tile.getFertilizedState());
        r1c2.add(0, tile.getPlowState()); 
        r1c2.add(1, tile.getSeedState());
        r1c2.add(2, tile.getSeedPlanted());
        r1c2.add(3, tile.getWaterState());
        r1c2.add(4, tile.getFertilizedState());
        r1c3.add(0, tile.getPlowState()); 
        r1c3.add(1, tile.getSeedState());
        r1c3.add(2, tile.getSeedPlanted());
        r1c3.add(3, tile.getWaterState());
        r1c3.add(4, tile.getFertilizedState());
        r1c4.add(0, tile.getPlowState()); 
        r1c4.add(1, tile.getSeedState());
        r1c4.add(2, tile.getSeedPlanted());
        r1c4.add(3, tile.getWaterState());
        r1c4.add(4, tile.getFertilizedState());
        r1c5.add(0, tile.getPlowState()); 
        r1c5.add(1, tile.getSeedState());
        r1c5.add(2, tile.getSeedPlanted());
        r1c5.add(3, tile.getWaterState());
        r1c5.add(4, tile.getFertilizedState());
        r2c1.add(0, tile.getPlowState()); 
        r2c1.add(1, tile.getSeedState());
        r2c1.add(2, tile.getSeedPlanted());
        r2c1.add(3, tile.getWaterState());
        r2c1.add(4, tile.getFertilizedState());
        r2c2.add(0, tile.getPlowState()); 
        r2c2.add(1, tile.getSeedState());
        r2c2.add(2, tile.getSeedPlanted());
        r2c2.add(3, tile.getWaterState());
        r2c2.add(4, tile.getFertilizedState());
        r2c3.add(0, tile.getPlowState()); 
        r2c3.add(1, tile.getSeedState());
        r2c3.add(2, tile.getSeedPlanted());
        r2c3.add(3, tile.getWaterState());
        r2c3.add(4, tile.getFertilizedState());
        r2c4.add(0, tile.getPlowState()); 
        r2c4.add(1, tile.getSeedState());
        r2c4.add(2, tile.getSeedPlanted());
        r2c4.add(3, tile.getWaterState());
        r2c4.add(4, tile.getFertilizedState());
        r2c5.add(0, tile.getPlowState()); 
        r2c5.add(1, tile.getSeedState());
        r2c5.add(2, tile.getSeedPlanted());
        r2c5.add(3, tile.getWaterState());
        r2c5.add(4, tile.getFertilizedState());
        r3c1.add(0, tile.getPlowState()); 
        r3c1.add(1, tile.getSeedState());
        r3c1.add(2, tile.getSeedPlanted());
        r3c1.add(3, tile.getWaterState());
        r3c1.add(4, tile.getFertilizedState());
        r3c2.add(0, tile.getPlowState()); 
        r3c2.add(1, tile.getSeedState());
        r3c2.add(2, tile.getSeedPlanted());
        r3c2.add(3, tile.getWaterState());
        r3c2.add(4, tile.getFertilizedState());
        r3c3.add(0, tile.getPlowState()); 
        r3c3.add(1, tile.getSeedState());
        r3c3.add(2, tile.getSeedPlanted());
        r3c3.add(3, tile.getWaterState());
        r3c3.add(4, tile.getFertilizedState());
        r3c4.add(0, tile.getPlowState()); 
        r3c4.add(1, tile.getSeedState());
        r3c4.add(2, tile.getSeedPlanted());
        r3c4.add(3, tile.getWaterState());
        r3c4.add(4, tile.getFertilizedState());
        r3c5.add(0, tile.getPlowState()); 
        r3c5.add(1, tile.getSeedState());
        r3c5.add(2, tile.getSeedPlanted());
        r3c5.add(3, tile.getWaterState());
        r3c5.add(4, tile.getFertilizedState());
        r4c1.add(0, tile.getPlowState()); 
        r4c1.add(1, tile.getSeedState());
        r4c1.add(2, tile.getSeedPlanted());
        r4c1.add(3, tile.getWaterState());
        r4c1.add(4, tile.getFertilizedState());
        r4c2.add(0, tile.getPlowState()); 
        r4c2.add(1, tile.getSeedState());
        r4c2.add(2, tile.getSeedPlanted());
        r4c2.add(3, tile.getWaterState());
        r4c2.add(4, tile.getFertilizedState());
        r4c3.add(0, tile.getPlowState()); 
        r4c3.add(1, tile.getSeedState());
        r4c3.add(2, tile.getSeedPlanted());
        r4c3.add(3, tile.getWaterState());
        r4c3.add(4, tile.getFertilizedState());
        r4c4.add(0, tile.getPlowState()); 
        r4c4.add(1, tile.getSeedState());
        r4c4.add(2, tile.getSeedPlanted());
        r4c4.add(3, tile.getWaterState());
        r4c4.add(4, tile.getFertilizedState());
        r4c5.add(0, tile.getPlowState()); 
        r4c5.add(1, tile.getSeedState());
        r4c5.add(2, tile.getSeedPlanted());
        r4c5.add(3, tile.getWaterState());
        r4c5.add(4, tile.getFertilizedState());
        r5c1.add(0, tile.getPlowState()); 
        r5c1.add(1, tile.getSeedState());
        r5c1.add(2, tile.getSeedPlanted());
        r5c1.add(3, tile.getWaterState());
        r5c1.add(4, tile.getFertilizedState());
        r5c2.add(0, tile.getPlowState()); 
        r5c2.add(1, tile.getSeedState());
        r5c2.add(2, tile.getSeedPlanted());
        r5c2.add(3, tile.getWaterState());
        r5c2.add(4, tile.getFertilizedState());
        r5c3.add(0, tile.getPlowState()); 
        r5c3.add(1, tile.getSeedState());
        r5c3.add(2, tile.getSeedPlanted());
        r5c3.add(3, tile.getWaterState());
        r5c3.add(4, tile.getFertilizedState());
        r5c4.add(0, tile.getPlowState()); 
        r5c4.add(1, tile.getSeedState());
        r5c4.add(2, tile.getSeedPlanted());
        r5c4.add(3, tile.getWaterState());
        r5c4.add(4, tile.getFertilizedState());
        r5c5.add(0, tile.getPlowState()); 
        r5c5.add(1, tile.getSeedState());
        r5c5.add(2, tile.getSeedPlanted());
        r5c5.add(3, tile.getWaterState());
        r5c5.add(4, tile.getFertilizedState());
        r6c1.add(0, tile.getPlowState()); 
        r6c1.add(1, tile.getSeedState());
        r6c1.add(2, tile.getSeedPlanted());
        r6c1.add(3, tile.getWaterState());
        r6c1.add(4, tile.getFertilizedState());
        r6c2.add(0, tile.getPlowState()); 
        r6c2.add(1, tile.getSeedState());
        r6c2.add(2, tile.getSeedPlanted());
        r6c2.add(3, tile.getWaterState());
        r6c2.add(4, tile.getFertilizedState());
        r6c3.add(0, tile.getPlowState()); 
        r6c3.add(1, tile.getSeedState());
        r6c3.add(2, tile.getSeedPlanted());
        r6c3.add(3, tile.getWaterState());
        r6c3.add(4, tile.getFertilizedState());
        r6c4.add(0, tile.getPlowState()); 
        r6c4.add(1, tile.getSeedState());
        r6c4.add(2, tile.getSeedPlanted());
        r6c4.add(3, tile.getWaterState());
        r6c4.add(4, tile.getFertilizedState());
        r6c5.add(0, tile.getPlowState()); 
        r6c5.add(1, tile.getSeedState());
        r6c5.add(2, tile.getSeedPlanted());
        r6c5.add(3, tile.getWaterState());
        r6c5.add(4, tile.getFertilizedState());
        r7c1.add(0, tile.getPlowState()); 
        r7c1.add(1, tile.getSeedState());
        r7c1.add(2, tile.getSeedPlanted());
        r7c1.add(3, tile.getWaterState());
        r7c1.add(4, tile.getFertilizedState());
        r7c2.add(0, tile.getPlowState()); 
        r7c2.add(1, tile.getSeedState());
        r7c2.add(2, tile.getSeedPlanted());
        r7c2.add(3, tile.getWaterState());
        r7c2.add(4, tile.getFertilizedState());
        r7c3.add(0, tile.getPlowState()); 
        r7c3.add(1, tile.getSeedState());
        r7c3.add(2, tile.getSeedPlanted());
        r7c3.add(3, tile.getWaterState());
        r7c3.add(4, tile.getFertilizedState());
        r7c4.add(0, tile.getPlowState()); 
        r7c4.add(1, tile.getSeedState());
        r7c4.add(2, tile.getSeedPlanted());
        r7c4.add(3, tile.getWaterState());
        r7c4.add(4, tile.getFertilizedState());
        r7c5.add(0, tile.getPlowState()); 
        r7c5.add(1, tile.getSeedState());
        r7c5.add(2, tile.getSeedPlanted());
        r7c5.add(3, tile.getWaterState());
        r7c5.add(4, tile.getFertilizedState());
        r8c1.add(0, tile.getPlowState()); 
        r8c1.add(1, tile.getSeedState());
        r8c1.add(2, tile.getSeedPlanted());
        r8c1.add(3, tile.getWaterState());
        r8c1.add(4, tile.getFertilizedState());
        r8c2.add(0, tile.getPlowState()); 
        r8c2.add(1, tile.getSeedState());
        r8c2.add(2, tile.getSeedPlanted());
        r8c2.add(3, tile.getWaterState());
        r8c2.add(4, tile.getFertilizedState());
        r8c3.add(0, tile.getPlowState()); 
        r8c3.add(1, tile.getSeedState());
        r8c3.add(2, tile.getSeedPlanted());
        r8c3.add(3, tile.getWaterState());
        r8c3.add(4, tile.getFertilizedState());
        r8c4.add(0, tile.getPlowState()); 
        r8c4.add(1, tile.getSeedState());
        r8c4.add(2, tile.getSeedPlanted());
        r8c4.add(3, tile.getWaterState());
        r8c4.add(4, tile.getFertilizedState());
        r8c5.add(0, tile.getPlowState()); 
        r8c5.add(1, tile.getSeedState());
        r8c5.add(2, tile.getSeedPlanted());
        r8c5.add(3, tile.getWaterState());
        r8c5.add(4, tile.getFertilizedState());
        r9c1.add(0, tile.getPlowState()); 
        r9c1.add(1, tile.getSeedState());
        r9c1.add(2, tile.getSeedPlanted());
        r9c1.add(3, tile.getWaterState());
        r9c1.add(4, tile.getFertilizedState());
        r9c2.add(0, tile.getPlowState()); 
        r9c2.add(1, tile.getSeedState());
        r9c2.add(2, tile.getSeedPlanted());
        r9c2.add(3, tile.getWaterState());
        r9c2.add(4, tile.getFertilizedState());
        r9c3.add(0, tile.getPlowState()); 
        r9c3.add(1, tile.getSeedState());
        r9c3.add(2, tile.getSeedPlanted());
        r9c3.add(3, tile.getWaterState());
        r9c3.add(4, tile.getFertilizedState());
        r9c4.add(0, tile.getPlowState()); 
        r9c4.add(1, tile.getSeedState());
        r9c4.add(2, tile.getSeedPlanted());
        r9c4.add(3, tile.getWaterState());
        r9c4.add(4, tile.getFertilizedState());
        r9c5.add(0, tile.getPlowState()); 
        r9c5.add(1, tile.getSeedState());
        r9c5.add(2, tile.getSeedPlanted());
        r9c5.add(3, tile.getWaterState());
        r9c5.add(4, tile.getFertilizedState());
        r10c1.add(0, tile.getPlowState()); 
        r10c1.add(1, tile.getSeedState());
        r10c1.add(2, tile.getSeedPlanted());
        r10c1.add(3, tile.getWaterState());
        r10c1.add(4, tile.getFertilizedState());
        r10c2.add(0, tile.getPlowState()); 
        r10c2.add(1, tile.getSeedState());
        r10c2.add(2, tile.getSeedPlanted());
        r10c2.add(3, tile.getWaterState());
        r10c2.add(4, tile.getFertilizedState());
        r10c3.add(0, tile.getPlowState()); 
        r10c3.add(1, tile.getSeedState());
        r10c3.add(2, tile.getSeedPlanted());
        r10c3.add(3, tile.getWaterState());
        r10c3.add(4, tile.getFertilizedState());
        r10c4.add(0, tile.getPlowState()); 
        r10c4.add(1, tile.getSeedState());
        r10c4.add(2, tile.getSeedPlanted());
        r10c4.add(3, tile.getWaterState());
        r10c4.add(4, tile.getFertilizedState());
        r10c5.add(0, tile.getPlowState()); 
        r10c5.add(1, tile.getSeedState());
        r10c5.add(2, tile.getSeedPlanted());
        r10c5.add(3, tile.getWaterState());
        r10c5.add(4, tile.getFertilizedState());

        // set the values of the player seed inventory arraylist
        for (i = 0; i < 8; i++) {
            temp.add(i, 0);
        }
        player.setSeedInv(temp);

        do {
            //create choices
            System.out.println("Land State: " + Land); // debugging
            System.out.println("[1] Plow Tile"); // in Tile class
            System.out.println("[2] Buy Seeds"); // in Player class
            System.out.println("[3] Plant Seed"); // in Tile class
            System.out.println("[4] Water Tile"); // in Tile class
            System.out.println("[5] Fertilize Tile"); // in Tile class
            System.out.println("[6] Harvest Tile"); // in Tile class
            System.out.println("[7] Check Player"); // in Player and Exp class
            System.out.println("[0] Advance Day"); // here in Farm class

            //get player choice
            System.out.print("\nChoice: ");
            choice = input.nextInt();

            //plow tile
            if (choice == 1) {

                System.out.print("Enter tile row number: (0-9)");
                r1 = input.nextInt();

                switch(r1){
                    case 0:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r1c1, 0);
                                break;
                            case 1:
                                tile.Plow(r1c2, 0);
                                break;
                            case 2:
                                tile.Plow(r1c3, 0);
                                break;
                            case 3:
                                tile.Plow(r1c4, 0);
                                break;
                            case 4:
                                tile.Plow(r1c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 1:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r2c1, 0);
                                break;
                            case 1:
                                tile.Plow(r2c2, 0);
                                break;
                            case 2:
                                tile.Plow(r2c3, 0);
                                break;
                            case 3:
                                tile.Plow(r2c4, 0);
                                break;
                            case 4:
                                tile.Plow(r2c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 2:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r3c1, 0);
                                break;
                            case 1:
                                tile.Plow(r3c2, 0);
                                break;
                            case 2:
                                tile.Plow(r3c3, 0);
                                break;
                            case 3:
                                tile.Plow(r3c4, 0);
                                break;
                            case 4:
                                tile.Plow(r3c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r4c1, 0);
                                break;
                            case 1:
                                tile.Plow(r4c2, 0);
                                break;
                            case 2:
                                tile.Plow(r4c3, 0);
                                break;
                            case 3:
                                tile.Plow(r4c4, 0);
                                break;
                            case 4:
                                tile.Plow(r4c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r5c1, 0);
                                break;
                            case 1:
                                tile.Plow(r5c2, 0);
                                break;
                            case 2:
                                tile.Plow(r5c3, 0);
                                break;
                            case 3:
                                tile.Plow(r5c4, 0);
                                break;
                            case 4:
                                tile.Plow(r5c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 5:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r6c1, 0);
                                break;
                            case 1:
                                tile.Plow(r6c2, 0);
                                break;
                            case 2:
                                tile.Plow(r6c3, 0);
                                break;
                            case 3:
                                tile.Plow(r6c4, 0);
                                break;
                            case 4:
                                tile.Plow(r6c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 6:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r7c1, 0);
                                break;
                            case 1:
                                tile.Plow(r7c2, 0);
                                break;
                            case 2:
                                tile.Plow(r7c3, 0);
                                break;
                            case 3:
                                tile.Plow(r7c4, 0);
                                break;
                            case 4:
                                tile.Plow(r7c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 7:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r8c1, 0);
                                break;
                            case 1:
                                tile.Plow(r8c2, 0);
                                break;
                            case 2:
                                tile.Plow(r8c3, 0);
                                break;
                            case 3:
                                tile.Plow(r8c4, 0);
                                break;
                            case 4:
                                tile.Plow(r8c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r9c1, 0);
                                break;
                            case 1:
                                tile.Plow(r9c2, 0);
                                break;
                            case 2:
                                tile.Plow(r9c3, 0);
                                break;
                            case 3:
                                tile.Plow(r9c4, 0);
                                break;
                            case 4:
                                tile.Plow(r9c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Plow(r10c1, 0);
                                break;
                            case 1:
                                tile.Plow(r10c2, 0);
                                break;
                            case 2:
                                tile.Plow(r10c3, 0);
                                break;
                            case 3:
                                tile.Plow(r10c4, 0);
                                break;
                            case 4:
                                tile.Plow(r10c5, 0);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    default:
                        System.out.println("Invalid. Tile does not exist");
                }
            } else if (choice == 2) { // buy seed
                player.BuySeeds();
            } else if (choice == 3) { // plant seed
                //show player seed inventory
                System.out.println("You currently have: ");
                System.out.println ("[Turnip(root crop), Carrot, Potato, Rose, Turnip(flower), Sunflower, Mango, Apple]");
                System.out.println(player.getSeedInv());

                // ask player which seed to plant
                System.out.println("Which seed would you like to plant? (1-8)?");
                s3 = input.nextInt();
                
                //change inventory
                player.PlantSeed(s3);
                
                //ask player which row tile they want to plant in
                System.out.print("Enter tile row number: (0-9)");
                r3 = input.nextInt();

                switch(r3){
                    case 0:
                        System.out.print("Enter tile column number: (0-4)");
                        c3 = input.nextInt();
                        switch(c3){
                            case 0:
                                if ( r1c1.get(0)== 1){
                                    tile.Plant(r1c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r1c2.get(0)== 1){
                                    tile.Plant (r1c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r1c3.get(0)== 1){
                                    tile.Plant (r1c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r1c4.get(0)== 1){
                                    tile.Plant (r1c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r1c5.get(0)== 1){
                                    tile.Plant (r1c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 1:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r2c1.get(0)== 1){
                                    tile.Plant (r2c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r2c2.get(0)== 1){
                                    tile.Plant (r2c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r2c3.get(0)== 1){
                                    tile.Plant (r2c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r2c4.get(0)== 1){
                                    tile.Plant (r2c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r2c5.get(0)== 1){
                                    tile.Plant (r2c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 2:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r3c1.get(0)== 1){
                                    tile.Plant (r3c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r3c2.get(0)== 1){
                                    tile.Plant (r3c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r3c3.get(0)== 1){
                                    tile.Plant (r3c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r3c4.get(0)== 1){
                                    tile.Plant (r3c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r3c5.get(0)== 1){
                                    tile.Plant (r3c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r4c1.get(0)== 1){
                                    tile.Plant (r4c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r4c2.get(0)== 1){
                                    tile.Plant (r4c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r4c3.get(0)== 1){
                                    tile.Plant (r4c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r4c4.get(0)== 1){
                                    tile.Plant (r4c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r4c5.get(0)== 1){
                                    tile.Plant (r4c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r5c1.get(0)== 1){
                                    tile.Plant (r5c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r5c2.get(0)== 1){
                                    tile.Plant (r5c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r5c3.get(0)== 1){
                                    tile.Plant (r5c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r5c4.get(0)== 1){
                                    tile.Plant (r5c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r5c5.get(0)== 1){
                                    tile.Plant (r5c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 5:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r6c1.get(0)== 1){
                                    tile.Plant (r6c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r6c2.get(0)== 1){
                                    tile.Plant (r6c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r6c3.get(0)== 1){
                                    tile.Plant (r6c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r6c4.get(0)== 1){
                                    tile.Plant (r6c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r6c5.get(0)== 1){
                                    tile.Plant (r6c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 6:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r7c1.get(0)== 1){
                                    tile.Plant (r7c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r7c2.get(0)== 1){
                                    tile.Plant (r7c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r7c3.get(0)== 1){
                                    tile.Plant (r7c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r7c4.get(0)== 1){
                                    tile.Plant (r7c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r7c5.get(0)== 1){
                                    tile.Plant (r7c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 7:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r8c1.get(0)== 1){
                                    tile.Plant (r8c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r8c2.get(0)== 1){
                                    tile.Plant (r8c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r8c3.get(0)== 1){
                                    tile.Plant (r8c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r8c4.get(0)== 1){
                                    tile.Plant (r8c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r8c5.get(0)== 1){
                                    tile.Plant (r8c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r9c1.get(0)== 1){
                                    tile.Plant (r9c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r9c2.get(0)== 1){
                                    tile.Plant (r9c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r9c3.get(0)== 1){
                                    tile.Plant (r9c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r9c4.get(0)== 1){
                                    tile.Plant (r9c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r9c5.get(0)== 1){
                                    tile.Plant (r9c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r10c1.get(0)== 1){
                                    tile.Plant (r10c1, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 1:
                                if (r10c2.get(0)== 1){
                                    tile.Plant (r10c2, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 2:
                                if (r10c3.get(0)== 1){
                                    tile.Plant (r10c3, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 3:
                                if (r10c4.get(0)== 1){
                                    tile.Plant (r10c4, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            case 4:
                                if (r10c5.get(0)== 1){
                                    tile.Plant (r10c5, 1, 2, s3);
                                }else{
                                    System.out.println("You cannot plant on an unplowed tile. please plow first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    default:
                        System.out.println("Invalid. Tile does not exist");
                    }


            } else if (choice == 4){ // water plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r4 = input.nextInt();

                switch(r4){
                    case 0:
                        System.out.print("Enter tile column number: (0-4)");
                        c4 = input.nextInt();
                        switch(c4){
                            case 0:
                                if ( r1c1.get(1) == 1){ // check if planted
                                    tile.Water(r1c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r1c2.get(1) == 1){ // check if planted
                                    tile.Water(r1c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r1c3.get(1) == 1){ // check if planted
                                    tile.Water(r1c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r1c4.get(1) == 1){ // check if planted
                                    tile.Water(r1c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r1c5.get(1) == 1){ // check if planted
                                    tile.Water(r1c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 1:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r2c1.get(1) == 1){ // check if planted
                                    tile.Water(r2c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r2c2.get(1) == 1){ // check if planted
                                    tile.Water(r2c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r2c3.get(1) == 1){ // check if planted
                                    tile.Water(r2c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r2c4.get(1) == 1){ // check if planted
                                    tile.Water(r2c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r2c5.get(1) == 1){ // check if planted
                                    tile.Water(r2c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 2:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r3c1.get(1) == 1){ // check if planted
                                    tile.Water(r3c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r3c2.get(1) == 1){ // check if planted
                                    tile.Water(r3c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r3c3.get(1) == 1){ // check if planted
                                    tile.Water(r3c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r3c4.get(1) == 1){ // check if planted
                                    tile.Water(r3c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r3c5.get(1) == 1){ // check if planted
                                    tile.Water(r3c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r4c1.get(1) == 1){ // check if planted
                                    tile.Water(r4c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r4c2.get(1) == 1){ // check if planted
                                    tile.Water(r4c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r4c3.get(1) == 1){ // check if planted
                                    tile.Water(r4c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r4c4.get(1) == 1){ // check if planted
                                    tile.Water(r4c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r4c5.get(1) == 1){ // check if planted
                                    tile.Water(r4c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r5c1.get(1) == 1){ // check if planted
                                    tile.Water(r5c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r5c2.get(1) == 1){ // check if planted
                                    tile.Water(r5c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r5c3.get(1) == 1){ // check if planted
                                    tile.Water(r5c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r5c4.get(1) == 1){ // check if planted
                                    tile.Water(r5c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r5c5.get(1) == 1){ // check if planted
                                    tile.Water(r5c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 5:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r6c1.get(1) == 1){ // check if planted
                                    tile.Water(r6c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r6c2.get(1) == 1){ // check if planted
                                    tile.Water(r6c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r6c3.get(1) == 1){ // check if planted
                                    tile.Water(r6c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r6c4.get(1) == 1){ // check if planted
                                    tile.Water(r6c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r6c5.get(1) == 1){ // check if planted
                                    tile.Water(r6c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 6:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r7c1.get(1) == 1){ // check if planted
                                    tile.Water(r7c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r7c2.get(1) == 1){ // check if planted
                                    tile.Water(r7c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r7c3.get(1) == 1){ // check if planted
                                    tile.Water(r7c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r7c4.get(1) == 1){ // check if planted
                                    tile.Water(r7c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r7c5.get(1) == 1){ // check if planted
                                    tile.Water(r7c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 7:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r8c1.get(1) == 1){ // check if planted
                                    tile.Water(r8c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r8c2.get(1) == 1){ // check if planted
                                    tile.Water(r8c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r8c3.get(1) == 1){ // check if planted
                                    tile.Water(r8c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r8c4.get(1) == 1){ // check if planted
                                    tile.Water(r8c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r8c5.get(1) == 1){ // check if planted
                                    tile.Water(r8c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r9c1.get(1) == 1){ // check if planted
                                    tile.Water(r9c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r9c2.get(1) == 1){ // check if planted
                                    tile.Water(r9c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r9c3.get(1) == 1){ // check if planted
                                    tile.Water(r9c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r9c4.get(1) == 1){ // check if planted
                                    tile.Water(r9c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r9c5.get(1) == 1){ // check if planted
                                    tile.Water(r9c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if ( r10c1.get(1) == 1){ // check if planted
                                    tile.Water(r10c1, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if ( r10c2.get(1) == 1){ // check if planted
                                    tile.Water(r10c2, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if ( r10c3.get(1) == 1){ // check if planted
                                    tile.Water(r10c3, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if ( r10c4.get(1) == 1){ // check if planted
                                    tile.Water(r10c4, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if ( r10c5.get(1) == 1){ // check if planted
                                    tile.Water(r10c5, 3);
                                }else{
                                    System.out.println("You cannot water on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    default:
                        System.out.println("Invalid. Tile does not exist");
                    }
            } else if (choice == 5){ //fertilze plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r5 = input.nextInt();

                switch(r5){
                    case 0:
                        System.out.print("Enter tile column number: (0-4)");
                        c5 = input.nextInt();
                        switch(c5){
                            case 0:
                                if (r1c1.get(1) == 1){ // check if planted
                                    tile.Water(r1c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r1c2.get(1) == 1){ // check if planted
                                    tile.Water(r1c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r1c3.get(1) == 1){ // check if planted
                                    tile.Water(r1c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r1c4.get(1) == 1){ // check if planted
                                    tile.Water(r1c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r1c5.get(1) == 1){ // check if planted
                                    tile.Water(r1c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 1:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r2c1.get(1) == 1){ // check if planted
                                    tile.Water(r2c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r2c2.get(1) == 1){ // check if planted
                                    tile.Water(r2c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r2c3.get(1) == 1){ // check if planted
                                    tile.Water(r2c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r2c4.get(1) == 1){ // check if planted
                                    tile.Water(r2c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r2c5.get(1) == 1){ // check if planted
                                    tile.Water(r2c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 2:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r3c1.get(1) == 1){ // check if planted
                                    tile.Water(r3c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r3c2.get(1) == 1){ // check if planted
                                    tile.Water(r3c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r3c3.get(1) == 1){ // check if planted
                                    tile.Water(r3c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r3c4.get(1) == 1){ // check if planted
                                    tile.Water(r3c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r3c5.get(1) == 1){ // check if planted
                                    tile.Water(r3c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r4c1.get(1) == 1){ // check if planted
                                    tile.Water(r4c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r4c2.get(1) == 1){ // check if planted
                                    tile.Water(r4c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r4c3.get(1) == 1){ // check if planted
                                    tile.Water(r4c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r4c4.get(1) == 1){ // check if planted
                                    tile.Water(r4c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r4c5.get(1) == 1){ // check if planted
                                    tile.Water(r4c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r5c1.get(1) == 1){ // check if planted
                                    tile.Water(r5c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r5c2.get(1) == 1){ // check if planted
                                    tile.Water(r5c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r5c3.get(1) == 1){ // check if planted
                                    tile.Water(r5c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r5c4.get(1) == 1){ // check if planted
                                    tile.Water(r5c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r5c5.get(1) == 1){ // check if planted
                                    tile.Water(r5c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 5:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r6c1.get(1) == 1){ // check if planted
                                    tile.Water(r6c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r6c2.get(1) == 1){ // check if planted
                                    tile.Water(r6c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r6c3.get(1) == 1){ // check if planted
                                    tile.Water(r6c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r6c4.get(1) == 1){ // check if planted
                                    tile.Water(r6c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r6c5.get(1) == 1){ // check if planted
                                    tile.Water(r6c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 6:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r7c1.get(1) == 1){ // check if planted
                                    tile.Water(r7c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r7c2.get(1) == 1){ // check if planted
                                    tile.Water(r7c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r7c3.get(1) == 1){ // check if planted
                                    tile.Water(r7c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r7c4.get(1) == 1){ // check if planted
                                    tile.Water(r7c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r7c5.get(1) == 1){ // check if planted
                                    tile.Water(r7c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 7:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r8c1.get(1) == 1){ // check if planted
                                    tile.Water(r8c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r8c2.get(1) == 1){ // check if planted
                                    tile.Water(r8c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r8c3.get(1) == 1){ // check if planted
                                    tile.Water(r8c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r8c4.get(1) == 1){ // check if planted
                                    tile.Water(r8c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r8c5.get(1) == 1){ // check if planted
                                    tile.Water(r8c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r9c1.get(1) == 1){ // check if planted
                                    tile.Water(r9c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r9c2.get(1) == 1){ // check if planted
                                    tile.Water(r9c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r9c3.get(1) == 1){ // check if planted
                                    tile.Water(r9c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r9c4.get(1) == 1){ // check if planted
                                    tile.Water(r9c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r9c5.get(1) == 1){ // check if planted
                                    tile.Water(r9c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                if (r10c1.get(1) == 1){ // check if planted
                                    tile.Water(r10c1, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 1:
                                if (r10c2.get(1) == 1){ // check if planted
                                    tile.Water(r10c2, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 2:
                                if (r10c3.get(1) == 1){ // check if planted
                                    tile.Water(r10c3, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 3:
                                if (r10c4.get(1) == 1){ // check if planted
                                    tile.Water(r10c4, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            case 4:
                                if (r10c5.get(1) == 1){ // check if planted
                                    tile.Water(r10c5, 4);
                                }else{
                                    System.out.println("You cannot fertilize on an unplowed tile. please plow and plant first.");
                                }
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    default:
                        System.out.println("Invalid. Tile does not exist");
                    }
            } else if (choice == 6) { // harvest plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r6 = input.nextInt();

                switch(r6){
                    case 0:
                        System.out.print("Enter tile column number: (0-4)");
                        c6 = input.nextInt();
                        switch(c6){
                            case 0:
                                tile.Harvest(r1c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r1c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r1c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r1c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r1c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 1:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r2c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r2c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r2c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r2c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r2c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 2:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r3c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r3c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r3c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r3c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r3c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r4c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r4c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r4c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r4c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r4c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r5c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r5c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r5c3, 2);
                            case 3:
                                tile.Harvest(r5c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r5c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 5:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r6c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r6c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r6c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r6c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r6c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 6:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r7c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r7c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r7c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r7c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r7c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 7:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r8c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r8c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r8c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r8c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r8c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r9c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r9c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r9c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r9c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r9c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter tile column number: (0-4)");
                        c1 = input.nextInt();
                        switch(c1){
                            case 0:
                                tile.Harvest(r10c1, 2);
                                break;
                            case 1:
                                tile.Harvest(r10c2, 2);
                                break;
                            case 2:
                                tile.Harvest(r10c3, 2);
                                break;
                            case 3:
                                tile.Harvest(r10c4, 2);
                                break;
                            case 4:
                                tile.Harvest(r10c5, 2);
                                break;
                            default:
                                System.out.println("Invalid. Tile does not exist");
                        }
                        break;
                    default:
                        System.out.println("Invalid. Tile does not exist");
                    }

            }else if (choice == 7) {
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
