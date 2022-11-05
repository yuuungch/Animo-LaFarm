Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@ArigatYungch 
ArigatYungch
/
CCPROG3-MachineProject
Private
Code
Issues
Pull requests
Actions
Projects
Security
Insights
Settings
CCPROG3-MachineProject
/
Tile.java
in
Single-Tile-Prototype
 

Spaces

4

No wrap
1
import java.util.ArrayList;
2
import java.util.Random;
3
​
4
public class Tile {
5
    private int rockState; // 0 with rock, 1 no rock
6
    private int plowState; // 0 for unplowed, 1 for plowed
7
    private int seedState; // 0 unplanted, 1 to 8 for types of seed, 9 if withered
8
    private boolean witherState; // false unwithered, true withered
9
    private int waterCount; // counts number of times tile has been watered
10
    private int wateredToday; // 0 if not yet, 1 if done already.
11
    private int fertiCount; // 0 if not fertilized, 1 if fertilized
12
    private int fertilizedToday; // 0 if not yet, 1 if done already.
13
    private Seeds seedInfo; // contains information regarding which seed
14
    private Exp playerExp;
15
​
16
    public Tile(Exp playerExp) {
17
        rockState = 1;
18
        plowState = 0;
19
        seedState = 0;
20
        witherState = false;
21
        waterCount = 0;
22
        wateredToday = 0;
23
        fertiCount = 0;
24
        fertilizedToday = 0;
25
        seedInfo = new Seeds();
26
        this.playerExp = playerExp;
27
    }
28
​
29
    /**
30
     * Method for plowing a tile (To be moved to Hoe class)
31
     * 
32
     * @param array ArrayList of Tiles
33
     * @param x     Tile number
34
     */
35
    public void Plow(ArrayList<Tile> array, int x) {
36
        if (array.get(x).plowState == 0 && array.get(x).rockState != 0) {
37
            array.get(x).setPlowState(1);
38
            System.out.println("Tile has been successfully plowed!");
39
            playerExp.GainExp(0.5, array.get(x).playerExp);
40
        } else if (array.get(x).plowState == 1) {
41
            System.out.println("Tile is already plowed!");
42
        } else if (array.get(x).plowState == 0 && array.get(x).rockState == 0) {
43
            System.out.println("Tile cannot be plowed as there are rocks on it.");
44
        }
45
    }
@ArigatYungch
Commit changes
Commit summary
Create Tile.java
Optional extended description
Add an optional extended description…
 Commit directly to the Single-Tile-Prototype branch.
 Create a new branch for this commit and start a pull request. Learn more about pull requests.
 
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
