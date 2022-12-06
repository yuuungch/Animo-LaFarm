import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class WindowStoreGui extends JFrame{
    //create buttons
    private JButton btnBuy;
    private JButton btnPrev;
    private JButton btnNext;
    //create textarea
    private JTextArea taName;
    private JTextArea taDesc;
    //create label
    private JLabel lblStore;
    // contains information regarding which seed
    private Seeds seedInfo;
    // land tile
    private ArrayList<Tile> Land;
    private Store store;

    //constructor
    public WindowStoreGui(Seeds seedInfo, ArrayList<Tile> Land, Store store){
        //title of the window
        super("Store");

        //seed info
        this.seedInfo = seedInfo;

        // land tile
        this.Land = Land;

        //store
        this.store = store;

        //set Layout
        setLayout(new BorderLayout());

        //set size of window
        setSize(450,500);

        //elements
        storeElements(Land, store.getCurrent());

        //set visibility
        setVisible(true);

        //set resizable
        setResizable(false);

        //set default close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //store elements
    private void storeElements(ArrayList<Tile> array, int x){
        //south panel
        JPanel panelSouth = new JPanel();
        //specify the layout of the panel to make it borderlayout
        panelSouth.setLayout(new FlowLayout());
        panelSouth.setBackground(Color.decode("#3d251e"));
        //add button to panel
        btnBuy = new JButton("BUY");
        panelSouth.add(btnBuy);
        //add panel to frame
        this.add(panelSouth, BorderLayout.SOUTH);
       
        //north panel
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        panelNorth.setBackground(Color.decode("#3d251e"));
        //add label
        lblStore = new JLabel("Seed Store");
        //change foreground
        lblStore.setForeground(Color.WHITE);
        //change font, style, and size
        lblStore.setFont(new Font("Verdana", Font.BOLD, 20));
        //add label to panel
        panelNorth.add(lblStore);
        //add panel to frame
        this.add(panelNorth, BorderLayout.NORTH);

        //West panel
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new GridBagLayout());
        panelWest.setBackground(Color.decode("#3d251e"));
        //create button for the panel
        btnPrev = new JButton("<");
        //add buton to panel
        panelWest.add(btnPrev);
        this.add(panelWest, BorderLayout.WEST);

        //East panel
        JPanel panelEast = new JPanel();
        panelEast.setLayout(new GridBagLayout());
        panelEast.setBackground(Color.decode("#3d251e"));
        //create button for the panel
        btnNext= new JButton(">");
        //add buton to panel    
        panelEast.add(btnNext);
        //add panel to frame
        this.add(panelEast, BorderLayout.EAST);
        
        //center panel
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.decode("#8b6c5c"));
        panelCenter.setLayout(new BorderLayout());
        //north (name) subpanel inside the Center panel
        JPanel panelName = new JPanel();
        panelName.setBackground(Color.decode("#8b6c5c"));
        //add label to subpanel
        JLabel lblName = new JLabel("Seed name: ");
        lblName.setForeground(Color.BLACK);
        //add label to subpanel
        panelName.add(lblName);

        //generate info
        seedInfo.Generate(store.getCurrent());
        //add textfield 
        taName = new JTextArea(seedInfo.getName());
        //add textfield to panel 
        panelName.add(taName);
        //add subpanel to center panel
        panelCenter.add(panelName, BorderLayout.NORTH);
        // Center(dec)subpanel inside the center Panel 
        //taDesc = new JTextArea(seedInfo.getDesc()); 
        taDesc = new JTextArea(); 
        //add jtextarea to scrollpane to make it scroll
        JScrollPane scroll = new JScrollPane(taDesc, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);     
        //add scroll pane to panel center
        panelCenter.add(scroll, BorderLayout.CENTER);  
        //add panel to frame
        this.add(panelCenter, BorderLayout.CENTER);                
    }

    //add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener){
        btnBuy.addActionListener(listener);
        btnPrev.addActionListener(listener);
        btnNext.addActionListener(listener);
    }

    //add docs listeners to texts
    public void setDocumentsListener(DocumentListener listener){
        taName.getDocument().addDocumentListener(listener);
        taDesc.getDocument().addDocumentListener(listener);
    }                                                               

    //create method to show x of x
    public void setSeedNum(int currNum, int numSeeds){
        lblStore.setText("Seed (Seed " + currNum + " of  " + numSeeds + ")");
    }

    public String getSeedName(){
        return taName.getText();
    }

    public String getSeedDesc(){
        return taDesc.getText();
    }

    //set seed name
    public void setSeedName(String name){
        taName.setText(name);
    }

    //set seed desc
    public void setSeedDesc(String desc){
        taDesc.setText(desc);
    }
}
