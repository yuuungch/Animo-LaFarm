import java.util.Scanner;

public class Exp {
    private double exp;
    private String farmerType;
    private int level;
    private int earningBonus;
    private int costReduction;
    private int waterBonus;
    private int fertiBonus;
    private String status;

    public Exp() {
        exp = 0;
        farmerType = "Farmer";
        level = 0;
        earningBonus = 0;
        costReduction = 0;
        waterBonus = 0;
        fertiBonus = 0;
    }

    /**
     * Method that acts as the exp gain mechanic
     * 
     * @param gain    is the gained experience points
     * @param current the Exp class of the player
     */
    public void GainExp(double gain, Exp current) {
        current.setExp(current.getExp() + gain);
        System.out.println(
                "You have gained " + gain + " experience points! (" + current.getExp() + " / "
                        + (current.getLevel() + 1) * 100 + ")");

        LevelUp();
    }

    /**
     * Method that validates and enables players to level up by 1 stage (occurs
     * every menu open)
     */
    public void LevelUp() {
        if (exp / 100 >= level + 1) {
            level += 1;
            System.out.println("Congratulations! You reached level " + level + ".");
        }
    }

    /**
     * Void Method to check player's experience stats and bonuses
     */
    public String CheckStatus() {
        // System.out.println("EXP: " + exp);
        // System.out.println("EXP to next level: " + (level + 1) * 100);
        // System.out.println("Current Level: " + level);
        // System.out.println("Farmer Type:" + farmerType);
        // System.out.println("Bonus Earnings per Produce: " + earningBonus);
        // System.out.println("Seed Cost Reduction: " + costReduction);
        // System.out.println("Water Bonus Limit Increase: " + waterBonus);
        // System.out.println("Ferti'lizer Bonus Limit Increase: " + fertiBonus);
        status = "\nEXP: " + exp + "\nEXP to next level: " + (level + 1) * 100 + 
        "\nCurrent Level: " + level + "\nFarmer Type:" + farmerType + 
        "\nBonus Earnings per Produce: " + earningBonus +
        "\nSeed Cost Reduction: " + costReduction +
        "\nWater Bonus Limit Increase: " + waterBonus +
        "\nFertilizer Bonus Limit Increase: " + fertiBonus;
        return status;
    }

    /**
     * Actual Registration Procedure Method
     * 
     * @param nextType String, next level type to be unlocked by the player
     * @param p        Player class, used to directly interact with the Ocoins
     *                 variable of the player
     * @param regcap   Integer, amount to be spent in order to successfully register
     *                 to the next type
     */
    public void RegMenu(String nextType, Player p, double regcap) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Your current status is " + farmerType + ".");
            System.out.println("Next status is " + nextType + ". Registration fee is " + regcap + ".\n");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.print("Would you like to register as a " + nextType + "? ");
            choice = input.nextInt();

            if (choice == 1 && p.getOcoins() >= regcap) { // SUCCESSFUL
                farmerType = nextType;
                System.out.println("Congratulations! You have successfully registered as a " + farmerType + ".");

                p.setOcoins(p.getOcoins() - regcap);
                System.out.println("Deducted " + regcap + " Objectcoins for registration. " + p.getOcoins()
                        + " Objectcoins remaining.");
            } else if (choice == 1 && p.getOcoins() < regcap) { // NOT ENOUGH OBJECTCOINS
                System.out.println("Sorry. You do not have enough Objectcoins to register as a " + nextType + ".");
            } else if (choice == 2) { // REJECTION
                System.out.println("Okay. Status remains at " + farmerType + ".");
            }

        } while (choice < 1 && choice > 2);
    }

    /**
     * Assigns the correct bonuses once a player has reached a distinct level
     */
    public void Stats() {
        if (farmerType.equals("Registered Farmer")) {
            earningBonus = 1;
            costReduction = 1;
            waterBonus = 0;
            fertiBonus = 0;
        } else if (farmerType.equals("Distinguished Farmer")) {
            earningBonus = 2;
            costReduction = 2;
            waterBonus = 1;
            fertiBonus = 0;
        } else if (farmerType.equals("Legendary Farmer")) {
            earningBonus = 4;
            costReduction = 3;
            waterBonus = 2;
            fertiBonus = 1;
        }

        System.out.println("Respective Bonuses Increased:");
        System.out.println("Earning Bonus: " + earningBonus);
        System.out.println("Cost Reduction: " + costReduction);
        System.out.println("Water Bonus: " + waterBonus);
        System.out.println("Fertilizing Bonus: " + fertiBonus);
    }

    /**
     * Method to validate the registration of players to the next level
     * 
     * @param p Player class; specifically used to interact with the Ocoins variable
     *          of the player
     */
    public void Registration(Player p) {
        if (exp < 5 && farmerType.equals("Farmer")) { // DOES NOT MEET THE BASE REQUIREMENTS
            System.out.println("You do not yet meet the requirements to register as a Registered Farmer.");
        } else if (exp >= 5 && farmerType.equals("Farmer")) {
            RegMenu("Registered Farmer", p, 200);
            Stats();
        } else if (exp < 10 && farmerType.equals("Registered Farmer")) { // DOES NOT MEET THE BASE REQUIREMENTS
            System.out.println("You do not yet meet the requirements to register as a Distinguished Farmer.");
        } else if (exp >= 10 && farmerType.equals("Registered Farmer")) {
            RegMenu("Distinguished Farmer", p, 300);
            Stats();
        } else if (exp < 15 && farmerType.equals("Distinguished Farmer")) { // DOES NOT MEET THE BASE REQUIREMENTS
            System.out.println("You do not yet meet the requirements to register as a Legendary Farmer.");
        } else if (exp >= 15 && farmerType.equals("Distinguished Farmer")) {
            RegMenu("Legendary Farmer", p, 400);
            Stats();
        }
    }

    // GETTERS AND SETTERS

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getFarmerType() {
        return farmerType;
    }

    public void setFarmerType(String farmerType) {
        this.farmerType = farmerType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEarningBonus() {
        return earningBonus;
    }

    public void setEarningBonus(int earningBonus) {
        this.earningBonus = earningBonus;
    }

    public int getCostReduction() {
        return costReduction;
    }

    public void setCostReduction(int costReduction) {
        this.costReduction = costReduction;
    }

    public int getWaterBonus() {
        return waterBonus;
    }

    public void setWaterBonus(int waterBonus) {
        this.waterBonus = waterBonus;
    }

    public int getFertiBonus() {
        return fertiBonus;
    }

    public void setFertiBonus(int fertiBonus) {
        this.fertiBonus = fertiBonus;
    }

}
