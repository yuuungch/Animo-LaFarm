import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowFarmGui extends JFrame{
    private JLabel lblTile;
    private ImageIcon image = new ImageIcon();
    private JButton btnStore;
    private JButton btnHelp;
    private JButton btnPlow;
    private JButton btnPlant;
    private JButton btnWater;
    private JButton btnFertilizer;
    private JButton btnPickaxe;
    private JButton btnShovel;
    private JTextArea text;
    private Farm farm;

    //constructor
    public WindowFarmGui(Farm farm){
        //add window title
        super("Animo LaFarm");

        //Player
        this.farm = farm;

        //set window layout
        setLayout(new BorderLayout());

        //set size of window
        setSize(1440, 900);

        //add elementså
        init();

        //set visibility 
        setVisible(true);

        //set resizable
        setResizable(false);

        //set dafault close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //elements of the window
    private void init(){
        //south panel
        JPanel panelSouth = new JPanel();

        //specify the layout
        panelSouth.setLayout(new FlowLayout());

        //set bg color
        panelSouth.setBackground(Color.decode("#006400"));

        //add button Store to panel
        btnStore = new JButton("Store");
        panelSouth.add(btnStore);
        //add button Help to panel
        btnHelp = new JButton("Clear");
        panelSouth.add(btnHelp);

        //add panel to frame 
        this.add(panelSouth, BorderLayout.SOUTH);

        //north panel
        JPanel panelNorth = new JPanel();
        
        //specify the layout
        panelNorth.setLayout(new FlowLayout());
        
        //set bg color
        panelNorth.setBackground(Color.decode("#006400"));

        //add text 
        // JTextArea text = new JTextArea("---------------------------------"+ "\nObjectcoins Available: "
        // + player.getOcoins() + player.getExpData().CheckStatus()
        // + "\n" + "---------------------------------"+ "\n" );
        text = new JTextArea(farm.getCurrentPlayerInfo());
        text.setLineWrap(true);
        text.setBackground(Color.decode("#006400"));
        text.setForeground(Color.WHITE);
        text.setSize(1400, 50);

        //add label to panel
        panelNorth.add(text);

        //add panel to frame
        this.add(panelNorth, BorderLayout.NORTH);
        
        //west panel
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new FlowLayout());
        panelWest.setBackground(Color.decode("#006400"));
        panelWest.setSize(20, HEIGHT);

        //add panel to frame
        this.add(panelWest, BorderLayout.WEST);

        //east panel
        JPanel panelEast = new JPanel();
        panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
        panelEast.setBackground(Color.decode("#006400"));

        //create buttons
        btnPlow = new JButton("Plow");
        btnPlant = new JButton("Plant");
        btnWater = new JButton("Water");
        btnFertilizer = new JButton("Fertilizer");
        btnPickaxe = new JButton("Pickaxe");
        btnShovel = new JButton("Shovel");

        //add button to panel
        panelEast.add(btnPlow);
        panelEast.add(btnPlant);
        panelEast.add(btnWater);
        panelEast.add(btnFertilizer);
        panelEast.add(btnPickaxe);
        panelEast.add(btnShovel);

        //add panel to frame
        this.add(panelEast, BorderLayout.EAST);

        //center panel
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.decode("#006400"));
        panelCenter.setLayout(new GridLayout(5, 10,5,5));

        //DEBUG
        //create tiles
        for (int i = 1;i <= 50; i++){
            lblTile = new JLabel("Tile" + Integer.toString(i));
            lblTile.setBackground(Color.decode("#964800"));
            lblTile.setOpaque(true);   
            lblTile.addMouseListener(new MouseListener(){

                @Override
                public void mouseClicked(MouseEvent e) {
                    // TODO Auto-generated method stub
                    lblTile.setText("working");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
            });
            panelCenter.add(lblTile);
        }
        
        //add panel to frame
        this.add(panelCenter, BorderLayout.CENTER);
    }
    //set player info
    public void setPlayerInfo(String playerInfo){
       text.setText(playerInfo);
    }

    //add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener){
        btnStore.addActionListener(listener);
        btnHelp.addActionListener(listener);
        btnPlow.addActionListener(listener);
        btnPlant.addActionListener(listener);
        btnWater.addActionListener(listener);
        btnFertilizer.addActionListener(listener);
        btnPickaxe.addActionListener(listener);
        btnShovel.addActionListener(listener);
    }

    //add docs listeners to texts
    public void setDocumentsListener(DocumentListener listener){
        text.getDocument().addDocumentListener(listener);

    }                                                               
}
