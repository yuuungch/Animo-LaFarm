import java.util.Scanner;
import java.util.ArrayList;

public class Farm {
    //attributes
    private Player player;
    private Tile tile;
    private int day;
    private Seeds seedData; // Seed Database

    //constructor
    public Farm(Player player, Tile tile, Seeds seedData) {
        this.player = player;
        this.tile = tile;
        this.seedData = seedData;
        day = 1;
    }
    
    //create method for menu
    public void Menu() {
        //create scanner for user inputs
        Scanner input = new Scanner(System.in);

        //create arraylist for the farm land
        ArrayList<ArrayList<ArrayList<Integer>>> Land = new ArrayList(9);
        Tile[][] farmLotTile = new Tile[1][1];
        

        //create temporary arraylist for player seed inventory
        ArrayList<Integer> temp = new ArrayList<Integer>();

        //variables needed in method
        int choice, r1, c1, s3, r3, c3, r4, c4, r5, c5, r6, c6, i;

        

        // set tiles with corresponding tile state
        for ( int row = 0; row < farmLotTile.length; row++){
            for (int col = 0; col < farmLotTile[row].length; col++){
                farmLotTile[row][col] = new Tile(0,0,0,0,0,0);
                // farmLotTile[row][col].setPlowState(0);
                // farmLotTile[row][col].setSeedState(0);
                // farmLotTile[row][col].setSeedPlanted(0);
                // farmLotTile[row][col].setWaterState(0);
                // farmLotTile[row][col].setFertilizedState(0);
                // farmLotTile[row][col].setPlantDate(0);
            }
        }
        

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
                //ask player which tile they want to plow
                System.out.print("Enter tile row number: (0-9)");
                r1 = input.nextInt();

                if (r1 >= 0 && r1 <= farmLotTile.length){
                    System.out.print("Enter tile column number: (0-4)");
                    c1 = input.nextInt();
                    if (c1 >= 0 && c1 <= farmLotTile[r1].length){
                        farmLotTile[r1][c1].setPlowState(1);
                    } else {
                        System.out.println("Invalid. Tile does not exist");
                    }// end of if to check if player chose a valid col tile
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }// end of if to check if player chose a valid row tile
                
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

                if (r3 >= 0 && r3 <= farmLotTile.length){
                    System.out.print("Enter tile column number: (0-4)");
                    c3 = input.nextInt();
                    if (c3 >= 0 && c3 <= farmLotTile[r3].length){
                        if(farmLotTile[r3][c3].getPlowState() == 1){ //check if tile is plowed
                             farmLotTile[r3][c3].setSeedState(1);
                             farmLotTile[r3][c3].setSeedPlanted(s3);
                        }else{
                            System.out.println("Error! Please plow tile before planting.");
                        }
                    } else {
                        System.out.println("Invalid. Tile does not exist");
                    }// end of if to check if player chose a valid col tile
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }// end of if to check if player chose a valid row tile
           
            } else if (choice == 4){ // water plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r4 = input.nextInt();

                if (r4 >= 0 && r4 <= farmLotTile.length){
                    System.out.print("Enter tile column number: (0-4)");
                    c4 = input.nextInt();
                    if (c4 >= 0 && c4 <= farmLotTile[r4].length){
                        if(farmLotTile[r4][c4].getSeedState() == 1){ //check if tile has a seed planted
                             farmLotTile[r4][c4].setWaterState(farmLotTile[r4][c4].getWaterState()+1);
                        }else{
                            System.out.println("Error! Please plant a seed before watering the tile.");
                        }
                    } else {
                        System.out.println("Invalid. Tile does not exist");
                    }// end of if to check if player chose a valid col tile
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }// end of if to check if player chose a valid row tile
               
            } else if (choice == 5){ //fertilze plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r5 = input.nextInt();

                if (r5 >= 0 && r5 <= farmLotTile.length){
                    System.out.print("Enter tile column number: (0-4)");
                    c5 = input.nextInt();
                    if (c5 >= 0 && c5 <= farmLotTile[r5].length){
                        if(farmLotTile[r5][c5].getSeedState() == 1){ //check if tile has a seed planted
                             farmLotTile[r5][c5].setFertilizedState(farmLotTile[r5][c5].getFertilizedState()+1);
                        }else{
                            System.out.println("Error! Please plant a seed before watering the tile.");
                        }
                    } else {
                        System.out.println("Invalid. Tile does not exist");
                    }// end of if to check if player chose a valid col tile
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }// end of if to check if player chose a valid row tile
               
            } else if (choice == 6) { // harvest plant
                //ask player which row tile they want to water
                System.out.print("Enter tile row number: (0-9)");
                r6 = input.nextInt();

                if (r6 >= 0 && r6 <= farmLotTile.length){
                    System.out.print("Enter tile column number: (0-4)");
                    c6 = input.nextInt();
                    if (c6 >= 0 && c6 <= farmLotTile[r6].length){
                        if (farmLotTile[r6][c6].getSeedPlanted() == 1) {
                            if(farmLotTile[r6][c6].getSeedState() == 1 && farmLotTile[r6][c6].getFertilizedState() >= seedData.getFertilizer()
                                && farmLotTile[r6][c6].getWaterState() >= seedData.getWater() && farmLotTile[r6][c6].getPlantDate() == seedData.getHarvestTime()){ //check if tile has a seed planted and if still harvestable
                                farmLotTile[r6][c6].setFertilizedState(farmLotTile[r6][c6].getFertilizedState()+1);
                            }else{
                                System.out.println("Error! Please plant a seed before watering the tile.");
                            }
                        }else if (farmLotTile[r6][c6].getSeedPlanted() == 2) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 3) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 4) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 5) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 6) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 7) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r6][c6].getSeedPlanted() == 8) {
                            System.out.println("Sorry this is not yet available.");
                        }
                    } else {
                        System.out.println("Invalid. Tile does not exist");
                    }// end of if to check if player chose a valid col tile
                } else {
                    System.out.println("Invalid. Tile does not exist");
                }// end of if to check if player chose a valid row tile

            }else if (choice == 7) {
                System.out.println("---------------------------------");

                player.CheckSeedInventory();
                System.out.println("Objectcoins Available: " + player.getOcoins());
                System.out.println("---------------------------------");
                player.CheckExpBonus();
            }else if (choice == 8) {
                day ++;
                System.out.println("You have advanced a day. Today is now Day " + day + ".");
                for ( int r8 = 0; r8 < farmLotTile.length; r8++){
                    for (int c8 = 0; c8 < farmLotTile[0].length; c8++){
                        if (farmLotTile[r8][c8].getSeedState() == 1){
                            farmLotTile[r8][c8].setPlantDate(farmLotTile[r8][c8].getPlantDate()+1);
                        }
                        //if (farmLotTile[r8][c8].getPlantDate() > )
                        if (farmLotTile[r8][c8].getSeedPlanted() == 1) {
                            if (farmLotTile[r8][c8].getPlantDate() > seedData.getHarvestTime() && farmLotTile[r8][c8].getWaterState() >= seedData.getWater() 
                                && farmLotTile[r8][c8].getFertilizedState() >= seedData.getFertilizer()){
                                farmLotTile[r8][c8].setSeedState(2);
                            }
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 2) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 3) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 4) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 5) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 6) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 7) {
                            System.out.println("Sorry this is not yet available.");
                        } else if (farmLotTile[r8][c8].getSeedPlanted() == 8) {
                            System.out.println("Sorry this is not yet available.");
                        }
                    }
                }

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
