import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class WindowHelpGui extends JFrame {

    //private static final long serialVersionUID = 34534L;
    
    private JTextArea textArea_1;
    private JTextArea textArea_2;
    private JTextArea textArea_3;
    
    private JTabbedPane tabbedPane;
    

    //constructor
    public WindowHelpGui() {
        createForm();
    }

    void createForm() {
        //set resizable 
        setResizable(false);

        // add window title
        setTitle("Help");
        
        // set size of window
        setPreferredSize(new Dimension(800, 600));

        //set default close
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // OPTIONAL - Set form on top of everything.
        setAlwaysOnTop(true);

        tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        textArea_1 = new JTextArea();
        textArea_1.setText("MyFarm is a farming simulation game, where" + 
        "you will act as the sole farmer (and manager) " +
        "of your own farm. \nThe gameplay typically involves the " +
        "following tasks:" +
        "\n* Buying seeds,"+
        "\n* Preparing land,"+
        "\n* Planting seeds,"+
        "\n* Advancing days "+
        "\n* Harvesting crops"+
                
                
        "\n\n\n\nGame on!"+
        "\nOn the first day of the game, you will find yourself with "+
        "the following:"+
        "\n* A ten (10) by five (5) farm lot,"+
        "\n* Zero (0) seeds,"+
        "\n* One hundred (100) Objectcoins, and"+
        "\n* Farmer’s level zero (0)."+
                
        "\n\n\n\nThe Farming Process"+
        "\nThe farm lot starts off with none of the tiles containing "+
        "any crops and all the tiles being unplowed. Seeds cannot be \n"+
        "planted on unplowed tiles, so you must first use a plowing "+
        "tool to plow a tile. Once a tile has been plowed, you can \n"+
        "properly plant a seed in that tile. Upon planting a seed in "+
        "a plowed tile, the option to water and fertilize the "+
        "specific \ntile/crop becomes available to you. Watering and "+
        "fertilizing are only available when a tile is plowed. Just "+
        "like in real life, \nboth water and fertilizer have some "+
        "effect on a crop’s growth. Without properly taking care of a "+
        "crop, the crop will \nwither and stay on the tile forever. If "+
        "the crop is able to successfully grow (i.e. enough time has "+
        "passed and the \nminimum requirements of the crop have been "+
        "met), then an option to harvest the crop should be available "+
        "to you. \nHarvesting a crop that’s ready results to you "+
        "gaining n number of produce. Some crops produce only 1 "+
        "product, while \nothers may produce more. Regardless of the "+
        "number, all produce from the harvested crop are immediately "+
        "sold for \na specific amount, which is credited to your "+
        "Objectcoin wallet immediately. After harvesting a crop, the "+
        "crop is \nremoved from the tile and the tile reverts to an "+
        "unplowed tile. Take note, a successfully grown crop must be "+
        "harvested \nin the day it is ready. You will also gain some "+
        "farming experience from successfully grown crops. Forgetting "+
        "\nto harvest a crop (i.e. allowing a day to pass after the "+
        "crop is ready) will result in the \ncrop withering and you "+
        "losing any benefit from the harvest."+
                
        "\n\n\n\nOh no, Rocks!"+
        "\nRocks prevent any kind of player action from being "+
        "performed on a tile (i.e. can’t plow, so can’t plant) – "+
        "except for \nactually removing the rock. To remove the rock, "+
        "you must use the pickaxe tool which costs 50 Objectcoins to "+
        "use. \nOnce a rock is removed from a tile, you will gain "+
        "access to plowing the tile."+
                
        "\n\n\n\nWithering Away …"+
        "\nWhenever a crop withers, it stays on its tile forever… "+
        "unless you have a little bit of money. When a tile has a \n"+
        "withered crop, the option to use the shovel tool becomes "+
        "available. Hence, you can use the shovel tool to remove a "+
        "\ntile’s withered crop, but it costs 7 Objectcoins. After "+
        "removing the crop, the tile reverts to an unplowed tile."+
        " Unlike \nthe pickaxe tool, the shovel tool can be used "+
        "outside of its intended purpose. If used on an unplowed tile "+
        "or a \ntile with a stone, the tile remains as is and you will "+
        "simply lose Objectcoins. If the shovel tool is used on a "+
        "tile with \na plant, the plantwould be removed and the tile "+
        "reverts to being unplowed. Additionally, the water and/or "+
        "\nfertilizer status of the tile (if previously applied) is "+
        "removed. You will also lose 7 Objectcoins for using the "+
        "\nshovel in this scenario."+
                
        "\n\n\n\nFarming Experience"+
        "\nEvery time you successfully harvests a crop or uses a "+
        "tool, you will gain a specific amount of experience and "+
        "after \ngaining enough experience, you will automatically "+
        "level up. On the start of the game, you will start with zero "+
        "(0) \nexperience. Therefore, you will start off at level zero "+
        "(0). Each succeeding level is achieved by moving up 100 "+
        "\nexperience points. Take the following cases for reference:"+
        "\n* Experience: 0; Level: 0"+
        "\n* Experience: 40; Level: 0"+
        "\n* Experience: 99; Level: 0"+
        "\n* Experience: 100; Level: 1"+
        "\n* Experience: 199; Level: 1"+
        "\n* Experience: 201; Level: 2"+
        "\n* Experience: 500; Level: 5"+
        "\n* Experience: 1000; Level: 10"+
        "\nOnce your level is high enough, you may choose to "+
        "register yourself for a fee. With registration comes "+
        "benefits for you,\nsuch as earning more per harvest and "+
        "spending less for purchases. Please refer to the following "+
        "for all levels of \nregistration and their benefits:"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tFarmer (default): "+
        "\n\t\tLevel Requirement:\t\t 0"+
        "\n\t\tBonus Earnings per Produce:\t\t+0"+
        "\n\t\tSeed Cost Reduction:\t\t-0"+
        "\n\t\tWater Bonus Limit Increase:\t\t+0"+
        "\n\t\tFertilizer Bonus Limit Increase:\t+0"+
        "\n\t\tRegistration Fee:\t\tn/a"+
        "\n\t________________________________________________"+
        "______________________________________________"+
        "\n\tRegistered Farmer: "+
        "\n\t\tLevel Requirement:\t\t 5"+
        "\n\t\tBonus Earnings per Produce:\t\t+1"+
        "\n\t\tSeed Cost Reduction:\t\t-1"+
        "\n\t\tWater Bonus Limit Increase:\t\t+0"+
        "\n\t\tFertilizer Bonus Limit Increase:\t+0"+
        "\n\t\tRegistration Fee:\t\t200"+
        "\n\t________________________________________________"+
        "______________________________________________"+
        "\n\tDistinguished Farmer: "+
        "\n\t\tLevel Requirement:\t\t 10"+
        "\n\t\tBonus Earnings per Produce:\t\t+2"+
        "\n\t\tSeed Cost Reduction:\t\t-2"+
        "\n\t\tWater Bonus Limit Increase:\t\t+1"+
        "\n\t\tFertilizer Bonus Limit Increase:\t+0"+
        "\n\t\tRegistration Fee:\t\t300"+
        "\n\t________________________________________________"+
        "______________________________________________"+
        "\n\tLegendary Farmer: "+
        "\n\t\tLevel Requirement:\t\t 15"+
        "\n\t\tBonus Earnings per Produce:\t\t+4"+
        "\n\t\tSeed Cost Reduction:\t\t-3"+
        "\n\t\tWater Bonus Limit Increase:\t\t+2"+
        "\n\t\tFertilizer Bonus Limit Increase:\t+1"+
        "\n\t\tRegistration Fee:\t\t400"+
        "\n\t________________________________________________"+
        "______________________________________________"+
        "\n\nPlease note that registration is not automatically "+
        "awarded upon achieving the minimum level requirement because "+
        "a \nfee must be paid. If you do not have enough Objectcoins to "+
        "proceed, the registrations imply fails. Hence, registration "+
        "\nmust be explicitly selected by you. Additionally, you may "+
        "choose not to register at all despite reaching a high level."
        +
                
        "\n\n\n\nAdvancing to the Next Day"+
        "\nWhile this has already been hinted on, the game works on "+
        "a day system and starts on day 1. You should be able to "+
        "\nadvance to the next day when you’d like to. Advancing to the "+
        "next day should trigger updates to entities \nthroughout the "+
        "game. For example, if a crop needs 3 days until harvest, "+
        "then advancing to the next day would \nmean the crop would "+
        "need only 2 more days to harvest. Another example would be "+
        "when a crop is ready for \nharvest but the player advancing to "+
        "the next day, the crop should be updated as it should have "+
        "withered.");
        textArea_1.setCaretPosition(0);  // Set the caret to beginning of document.
        
        textArea_2 = new JTextArea();
        textArea_2.setText("Seed/Crop Information"+
        "\nThere are three different types of crops available: Vegetable, Flower, or Fruit Tree. Each of the crops \nhas certain nuances that set them apart from each other. In turn, each individual crop varies in terms of needs – water \nand fertilizer – to properly grow and become harvestable. Otherwise, they will wither. The list of all seeds available in \nthe game, as well as other important information, can be found in the following table:"+ 
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tTurnip"+
        "\n\t\tCrop Type:\t\tRoot Crop"+
        "\n\t\tHarvest Time in Days:\t2"+
        "\n\t\tWater Needs (bonus limit):\t1(2)"+
        "\n\t\tFertilizer Needs (bonus limit):\t0(1)"+
        "\n\t\tProducts Produced:\t1-2"+
        "\n\t\tSeed Cost:\t\t5"+
        "\n\t\tBase Selling Price per Piece:\t6"+
        "\n\t\tExperience Yield:\t5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tCarrot"+
        "\n\t\tCrop Type:\t\tRoot Crop"+
        "\n\t\tHarvest Time in Days:\t3"+
        "\n\t\tWater Needs (bonus limit):\t1(2)"+
        "\n\t\tFertilizer Needs (bonus limit):\t0(1)"+
        "\n\t\tProducts Produced:\t1-2"+
        "\n\t\tSeed Cost:\t\t10"+
        "\n\t\tBase Selling Price per Piece:\t9"+
        "\n\t\tExperience Yield:\t7.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tPotato"+
        "\n\t\tCrop Type:\t\tRoot Crop"+
        "\n\t\tHarvest Time in Days:\t5"+
        "\n\t\tWater Needs (bonus limit):\t3(4)"+
        "\n\t\tFertilizer Needs (bonus limit):\t1(2)"+
        "\n\t\tProducts Produced:\t1-10"+
        "\n\t\tSeed Cost:\t\t20"+
        "\n\t\tBase Selling Price per Piece:\t3"+
        "\n\t\tExperience Yield:\t12.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tRose"+
        "\n\t\tCrop Type:\t\tFlower"+
        "\n\t\tHarvest Time in Days:\t1"+
        "\n\t\tWater Needs (bonus limit):\t1(2)"+
        "\n\t\tFertilizer Needs (bonus limit):\t0(1)"+
        "\n\t\tProducts Produced:\t1"+
        "\n\t\tSeed Cost:\t\t5"+
        "\n\t\tBase Selling Price per Piece:\t5"+
        "\n\t\tExperience Yield:\t2.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tTurnips"+
        "\n\t\tCrop Type:\t\tFlower"+
        "\n\t\tHarvest Time in Days:\t2"+
        "\n\t\tWater Needs (bonus limit):\t2(3)"+
        "\n\t\tFertilizer Needs (bonus limit):\t0(1)"+
        "\n\t\tProducts Produced:\t1"+
        "\n\t\tSeed Cost:\t\t10"+
        "\n\t\tBase Selling Price per Piece:\t9"+
        "\n\t\tExperience Yield:\t5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tSunflower"+
        "\n\t\tCrop Type:\t\tFlower"+
        "\n\t\tHarvest Time in Days:\t3"+
        "\n\t\tWater Needs (bonus limit):\t2(3)"+
        "\n\t\tFertilizer Needs (bonus limit):\t1(2)"+
        "\n\t\tProducts Produced:\t1"+
        "\n\t\tSeed Cost:\t\t20"+
        "\n\t\tBase Selling Price per Piece:\t19"+
        "\n\t\tExperience Yield:\t7.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tMango"+
        "\n\t\tCrop Type:\t\tFruit Tree"+
        "\n\t\tHarvest Time in Days:\t10"+
        "\n\t\tWater Needs (bonus limit):\t7(7)"+
        "\n\t\tFertilizer Needs (bonus limit):\t4(4)"+
        "\n\t\tProducts Produced:\t5-15"+
        "\n\t\tSeed Cost:\t\t100"+
        "\n\t\tBase Selling Price per Piece:\t8"+
        "\n\t\tExperience Yield:\t25"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tApple"+
         "\n\t\tCrop Type:\t\tFruit Tree"+
         "\n\t\tHarvest Time in Days:\t10"+
         "\n\t\tWater Needs (bonus limit):\t7(7)"+
         "\n\t\tFertilizer Needs (bonus limit):\t5(5)"+
        "\n\t\tProducts Produced:\t10-15"+
        "\n\t\tSeed Cost:\t\t200"+
        "\n\t\tBase Selling Price per Piece:\t5"+
        "\n\t\tExperience Yield:\t25"+
        "\n\t_______________________________________________"+
        "_______________________________________________");    
        
        textArea_3 = new JTextArea();
        textArea_3.setText("Tool Usage"+
        "\nThe player’s actions have already been described previously, but let’s summarize them as tools and \nproperly define the expectations of each. Please refer to the following table:"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tPlow"+
        "\n\t\tFunction:"+
        "\n\t\t\tConverts an unplowed tile to a plowed tile. Can only be performed on an \n\t\t\tunplowed tile."+
        "\n\t\tCost of usage:\t\t0"+
        "\n\t\tExperienced Gain from Use:\t0.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tWatering Can"+
        "\n\t\tFunction:"+
        "\n\t\t\tAdds to the total number of tiles a tile/crop has been watered. Can only \n\t\t\tbe performed on a plowed tile with a crop."+
        "\n\t\tCost of usage:\t\t0"+
        "\n\t\tExperienced Gain from Use:\t0.5"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tFertilizer"+
        "\n\t\tFunction:"+
        "\n\t\t\tAdds to the total number of tiles a tile/crop has been applied with \n\t\t\tfertilizer. Can only be performed on a plowed tile with a crop."+
        "\n\t\tCost of usage:\t\t10"+
        "\n\t\tExperienced Gain from Use:\t4"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tPickaxe"+
        "\n\t\tFunction:"+
        "\n\t\t\tRemoves a rock from a tile. Can only be applied to tiles with a rock."+
        "\n\t\tCost of usage:\t\t50"+
        "\n\t\tExperienced Gain from Use:\t15"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n\tShovel"+
        "\n\t\tFunction:"+
        "\n\t\t\tRemoves a withered plant from a tile. Can be used on any tile/crop \n\t\t\twith varying effects, as described above."+
        "\n\t\tCost of usage:\t\t7"+
        "\n\t\tExperienced Gain from Use:\t2"+
        "\n\t_______________________________________________"+
        "_______________________________________________"+
        "\n* Cost of usage is immediately deducted from the player’s Objectcoin wallet if \nthey have enough money and the appropriate conditions are met.");                             

        JScrollPane scroll_1 = new JScrollPane();
        scroll_1.setViewportView(textArea_1);
        JScrollPane scroll_2 = new JScrollPane();
        scroll_2.setViewportView(textArea_2);
        JScrollPane scroll_3 = new JScrollPane();
        scroll_3.setViewportView(textArea_3);
        
        tabbedPane.add("How to play", scroll_1);
        tabbedPane.add("Seeds", scroll_2);
        tabbedPane.add("Tools", scroll_3);

        add(tabbedPane);
        
        pack(); // Now you can resize or maximize the form and everything will resize with it.
        
        setVisible(true);
        // Set Screen Location (after the pack())
        setLocationRelativeTo(null);
    }

}