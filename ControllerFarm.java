import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControllerFarm implements ActionListener, DocumentListener{
    private Seeds seedInfo;
    private ArrayList<Tile> Land;
    private Store store;
    private Player player;
    private WindowFarmGui farmGui;
    private Farm farm;
    //private WindowStoreGui storeGui;
    private ControllerStore storeController;
    private WindowHelpGui helpGui;
    private WindowAskGui askGui;
    private String chosenTile; 
    private int chosenTileNum;
    //private ControllerHelp helpController;

    //contstructor
    public ControllerFarm(Seeds seedInfo, ArrayList<Tile> Land, Store store, 
    Player player, WindowFarmGui farmGui, Farm farm){
        this.seedInfo = seedInfo;
        this.Land = Land;
        this.store = store;
        this.player = player;
        this.farmGui = farmGui;
        this.farm = farm;
        updatePlayer();

        farmGui.setActionListener(this);
        farmGui.setDocumentsListener(this);
    }


    //update the player info
    public void updatePlayer(){
        farmGui.setPlayerInfo(farm.getCurrentPlayerInfo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("btnStore")){
            WindowStoreGui storeGui = new WindowStoreGui(seedInfo, Land, store);
            storeController = new ControllerStore(storeGui, store, player);
            updatePlayer();
        }else if (e.getActionCommand().equals("Help")){
            System.out.println("working");
            //helpGui = new WindowHelpGui();
            helpGui.createForm();
            System.out.println("working");
            //helpController = new ControllerHelp();
            updatePlayer();
        }else if (e.getActionCommand().equals("btnPlow")){
            askGui = new WindowAskGui();
            chosenTile = askGui.getTileNum();
            chosenTileNum = Integer.valueOf(chosenTile);
            System.out.print(chosenTileNum);
            updatePlayer();
        }
         
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
        // TODO Auto-generated method stub
        
    }                                                                                               
    
    
}
