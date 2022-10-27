import java.util.Scanner;

public class Exp {
    private int exp;
    private String farmerType;
    private int level;
    private int earningBonus;
    private int costReduction;
    private int waterBonus;
    private int fertiBonus;

    public Exp() {
        exp = 0;
        farmerType = "Farmer";
        level = 0;
        earningBonus = 0;
        costReduction = 0;
        waterBonus = 0;
        fertiBonus = 0;
    }

    public void LevelUp() {
        if (exp / 100 >= level + 1) {
            level += 1;
            System.out.println("Congratulations! You reached level " + level + ".");
        }
    }

    public void CheckStatus() {
        System.out.println("EXP: " + exp);
        System.out.println("EXP to next level: " + (level + 1) * 100);
        System.out.println("Current Level: " + level);
        System.out.println("Farmer Type:" + farmerType);
        System.out.println("Bonus Earnings per Produce: " + earningBonus);
        System.out.println("Seed Cost Reduction: " + costReduction);
        System.out.println("Water Bonus Limit Increase: " + waterBonus);
        System.out.println("Fertilizer Bonus Limit Increase: " + fertiBonus);
    }

    public void RegMenu(String nextType, int money, int regcap) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Your current status is " + farmerType + ".");
            System.out.println("Next status is " + nextType + ". Registration fee is " + regcap + ".\n");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.print("Would you like to register as a " + nextType + "? ");
            choice = input.nextInt();

            if (choice == 1 && money >= regcap) {
                farmerType = nextType;
                System.out.println("Congratulations! You have successfully registered as a " + farmerType + ".");
            } else if (choice == 1 && money < regcap) {
                System.out.println("Sorry. You do not have enough Objectcoins to register as a " + nextType + ".");
            } else if (choice == 2) {
                System.out.println("Okay. Status remains at " + farmerType + ".");
            }

        } while (choice < 1 && choice > 2);
    }

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
    }

    public void Registration(int money) {
        if (exp <= 5 && farmerType.equals("Farmer")) {
            System.out.println();
        } else if (exp >= 5 && farmerType.equals("Farmer")) {
            RegMenu("Registered Farmer", money, 200);
            Stats();
        } else if (exp >= 10 && farmerType.equals("Registered Farmer")) {
            RegMenu("Distinguished Farmer", money, 300);
            Stats();
        } else if (exp >= 15 && farmerType.equals("Distinguished Farmer")) {
            RegMenu("Legendary Farmer", money, 400);
            Stats();
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
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
