import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WindowFarmGui extends JFrame {
    // attributes
    private JLabel[] lblTiles;
    private ImageIcon image = new ImageIcon();
    private JButton btnStore;
    private JButton btnHelp;
    private JButton btnPlow;
    private JButton btnPlant;
    private JButton btnWater;
    private JButton btnFertilizer;
    private JButton btnPickaxe;
    private JButton btnShovel;
    private JButton btnHarvest;
    private JButton btnRankUp;
    private JButton btnNextDay;
    private JButton btnPlayerInfo;
    private JTextArea text;
    private WindowAskPlowGui askGui;
    private WindowAskSeedGui askSeedGui;
    private WindowAskWaterGui askWaterGui;
    private WindowAskFertilizerGui fertilizerGui;
    private WindowAskHarvestGui harvestGui;
    private WindowAskWitherGui witherGui;
    private WindowAskPickaxeGui pickaxeGui;
    private WindowHelpGui helpGui;
    private WindowStoreGui storeGui;
    // private WindowTileGui tileGui;
    private String chosenTile;
    private int chosenTileNum;
    private Farm farm;
    private Seeds seedInfo;
    private ArrayList<Tile> Land;
    private Store store;
    private ControllerStore storeController;
    private Player player;
    private PlowTool plowTool;
    private WateringCan wateringCan;
    private Fertilizer fertilizer;
    private ShovelTool shovelTool;
    private Pickaxe pickaxeTool;

    // constructor
    public WindowFarmGui(Farm farm, Seeds seedInfo, ArrayList<Tile> Land,
            Store store, Player player, PlowTool plowTool, WateringCan wateringCan, Fertilizer fertilizer,
            ShovelTool shovelTool, Pickaxe pickaxeTool) {
        // add window title
        super("Animo LaFarm");

        // this
        this.farm = farm;
        this.seedInfo = seedInfo;
        this.Land = Land;
        this.store = store;
        this.player = player;
        this.plowTool = plowTool;
        this.wateringCan = wateringCan;
        this.fertilizer = fertilizer;
        this.shovelTool = shovelTool;
        this.pickaxeTool = pickaxeTool;

        // set window layout
        setLayout(new BorderLayout());

        // set size of window
        setSize(1440, 900);

        // add elementså
        init();

        // set visibility
        setVisible(true);

        // set resizable
        setResizable(false);

        // set dafault close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // elements of the window
    private void init() {
        // south panel
        JPanel panelSouth = new JPanel();

        // specify the layout
        panelSouth.setLayout(new FlowLayout());

        // set bg color
        panelSouth.setBackground(Color.decode("#006400"));

        // add button Store to panel
        btnStore = new JButton("Store");
        btnStore.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                storeGui = new WindowStoreGui(seedInfo, Land, store, farm);
                storeController = new ControllerStore(storeGui, store, player);
                updatePlayer();
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
        panelSouth.add(btnStore);
        // add button Help to panel
        btnHelp = new JButton("Help");
        btnHelp.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                // ended here add window help
                helpGui = new WindowHelpGui();
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
        panelSouth.add(btnHelp);

        // add panel to frame
        this.add(panelSouth, BorderLayout.SOUTH);

        // north panel
        JPanel panelNorth = new JPanel();

        // specify the layout
        panelNorth.setLayout(new FlowLayout());

        // set bg color
        panelNorth.setBackground(Color.decode("#006400"));

        // add text
        // player.CheckSeedInventory();
        // text = new JTextArea(/* player.getOutput() + "\n" + player.getOutput2()+ "\n"
        // + farm.getCurrentPlayerInfo() */);
        // text.setLineWrap(true);
        // text.setBackground(Color.decode("#006400"));
        // text.setForeground(Color.WHITE);
        // text.setSize(1400, 50);

        // add label to panel
        // panelNorth.add(text);

        // add panel to frame
        this.add(panelNorth, BorderLayout.NORTH);

        // west panel
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new FlowLayout());
        panelWest.setBackground(Color.decode("#006400"));
        panelWest.setSize(20, HEIGHT);

        // add panel to frame
        this.add(panelWest, BorderLayout.WEST);

        // east panel
        JPanel panelEast = new JPanel();
        panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
        panelEast.setBackground(Color.decode("#006400"));

        // create buttons
        btnPlow = new JButton("Plow");
        btnPlant = new JButton("Plant");
        btnWater = new JButton("Water");
        btnFertilizer = new JButton("Fertilizer");
        btnPickaxe = new JButton("Pickaxe");
        btnShovel = new JButton("Shovel");
        btnHarvest = new JButton("Harvest");
        btnRankUp = new JButton("Rank Up");
        btnNextDay = new JButton("Next Day");
        btnPlayerInfo = new JButton("Player Information");

        // mouselistener for JButtons
        btnPlow.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                askGui = new WindowAskPlowGui(Land, plowTool, farm);
                updatePlayer();
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

        btnPlant.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                askSeedGui = new WindowAskSeedGui(Land, plowTool, farm);
                updatePlayer();
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

        btnWater.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                askWaterGui = new WindowAskWaterGui(Land, plowTool, farm, wateringCan);
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

        btnFertilizer.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                fertilizerGui = new WindowAskFertilizerGui(Land, plowTool, farm, fertilizer, player);
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

        btnPickaxe.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                pickaxeGui = new WindowAskPickaxeGui(Land, plowTool, farm, pickaxeTool, player);
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

        btnShovel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                witherGui = new WindowAskWitherGui(Land, plowTool, farm, shovelTool, player);
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

        btnHarvest.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                harvestGui = new WindowAskHarvestGui(Land, plowTool, farm, player);
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

        btnRankUp.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.rankUp();
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

        btnNextDay.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.nextDay();
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

        btnPlayerInfo.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                WindowResultGui resultGui = new WindowResultGui(updatePlayer());
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

        // add button to panel
        panelEast.add(btnPlow);
        panelEast.add(btnPlant);
        panelEast.add(btnWater);
        panelEast.add(btnFertilizer);
        panelEast.add(btnPickaxe);
        panelEast.add(btnShovel);
        panelEast.add(btnHarvest);
        panelEast.add(btnRankUp);
        panelEast.add(btnNextDay);
        panelEast.add(btnPlayerInfo);

        // add panel to frame
        this.add(panelEast, BorderLayout.EAST);

        // center panel
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.decode("#006400"));
        panelCenter.setLayout(new GridLayout(5, 10, 5, 5));

        // DEBUG
        lblTiles = new JLabel[51];
        // create tiles
        lblTiles[1] = new JLabel("Tile" + Integer.toString(1));
        lblTiles[1].setBackground(Color.decode("#964800"));
        lblTiles[1].setOpaque(true);
        lblTiles[1].addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(0);
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
        panelCenter.add(lblTiles[1]);
        // 2
        lblTiles[2] = new JLabel("Tile" + Integer.toString(2));
        lblTiles[2].setBackground(Color.decode("#964800"));
        lblTiles[2].setOpaque(true);
        lblTiles[2].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(1);
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
        panelCenter.add(lblTiles[2]);
        // 3
        lblTiles[3] = new JLabel("Tile" + Integer.toString(3));
        lblTiles[3].setBackground(Color.decode("#964800"));
        lblTiles[3].setOpaque(true);
        lblTiles[3].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(2);
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
        panelCenter.add(lblTiles[3]);
        // 4
        lblTiles[4] = new JLabel("Tile" + Integer.toString(4));
        lblTiles[4].setBackground(Color.decode("#964800"));
        lblTiles[4].setOpaque(true);
        lblTiles[4].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(3);
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
        panelCenter.add(lblTiles[4]);
        // 5
        lblTiles[5] = new JLabel("Tile" + Integer.toString(5));
        lblTiles[5].setBackground(Color.decode("#964800"));
        lblTiles[5].setOpaque(true);
        lblTiles[5].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(4);
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
        panelCenter.add(lblTiles[5]);
        // 6
        lblTiles[6] = new JLabel("Tile" + Integer.toString(6));
        lblTiles[6].setBackground(Color.decode("#964800"));
        lblTiles[6].setOpaque(true);
        lblTiles[6].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(5);
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
        panelCenter.add(lblTiles[6]);
        // 7
        lblTiles[7] = new JLabel("Tile" + Integer.toString(7));
        lblTiles[7].setBackground(Color.decode("#964800"));
        lblTiles[7].setOpaque(true);
        lblTiles[7].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(6);
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
        panelCenter.add(lblTiles[7]);
        // 8
        lblTiles[8] = new JLabel("Tile" + Integer.toString(8));
        lblTiles[8].setBackground(Color.decode("#964800"));
        lblTiles[8].setOpaque(true);
        lblTiles[8].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(7);
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
        panelCenter.add(lblTiles[8]);
        // 9
        lblTiles[9] = new JLabel("Tile" + Integer.toString(9));
        lblTiles[9].setBackground(Color.decode("#964800"));
        lblTiles[9].setOpaque(true);
        lblTiles[9].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(8);
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
        panelCenter.add(lblTiles[9]);
        // 10
        lblTiles[10] = new JLabel("Tile" + Integer.toString(10));
        lblTiles[10].setBackground(Color.decode("#964800"));
        lblTiles[10].setOpaque(true);
        lblTiles[10].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

                farm.checkTile(9);
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
        panelCenter.add(lblTiles[10]);
        // 11
        lblTiles[11] = new JLabel("Tile" + Integer.toString(11));
        lblTiles[11].setBackground(Color.decode("#964800"));
        lblTiles[11].setOpaque(true);
        lblTiles[11].addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(10);
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
        panelCenter.add(lblTiles[11]);
        // 12
        lblTiles[12] = new JLabel("Tile" + Integer.toString(12));
        lblTiles[12].setBackground(Color.decode("#964800"));
        lblTiles[12].setOpaque(true);
        lblTiles[12].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(11);
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
        panelCenter.add(lblTiles[12]);
        // 13
        lblTiles[13] = new JLabel("Tile" + Integer.toString(13));
        lblTiles[13].setBackground(Color.decode("#964800"));
        lblTiles[13].setOpaque(true);
        lblTiles[13].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(12);
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
        panelCenter.add(lblTiles[13]);
        // 14
        lblTiles[14] = new JLabel("Tile" + Integer.toString(14));
        lblTiles[14].setBackground(Color.decode("#964800"));
        lblTiles[14].setOpaque(true);
        lblTiles[14].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(13);
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
        panelCenter.add(lblTiles[14]);
        // 15
        lblTiles[15] = new JLabel("Tile" + Integer.toString(15));
        lblTiles[15].setBackground(Color.decode("#964800"));
        lblTiles[15].setOpaque(true);
        lblTiles[15].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(14);
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
        panelCenter.add(lblTiles[15]);
        // 16
        lblTiles[16] = new JLabel("Tile" + Integer.toString(16));
        lblTiles[16].setBackground(Color.decode("#964800"));
        lblTiles[16].setOpaque(true);
        lblTiles[16].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(15);
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
        panelCenter.add(lblTiles[16]);
        // 17
        lblTiles[17] = new JLabel("Tile" + Integer.toString(17));
        lblTiles[17].setBackground(Color.decode("#964800"));
        lblTiles[17].setOpaque(true);
        lblTiles[17].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(16);
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
        panelCenter.add(lblTiles[17]);
        // 18
        lblTiles[18] = new JLabel("Tile" + Integer.toString(18));
        lblTiles[18].setBackground(Color.decode("#964800"));
        lblTiles[18].setOpaque(true);
        lblTiles[18].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(17);
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
        panelCenter.add(lblTiles[18]);
        // 19
        lblTiles[19] = new JLabel("Tile" + Integer.toString(19));
        lblTiles[19].setBackground(Color.decode("#964800"));
        lblTiles[19].setOpaque(true);
        lblTiles[19].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(18);
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
        panelCenter.add(lblTiles[19]);
        // 20
        lblTiles[20] = new JLabel("Tile" + Integer.toString(20));
        lblTiles[20].setBackground(Color.decode("#964800"));
        lblTiles[20].setOpaque(true);
        lblTiles[20].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(19);
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
        panelCenter.add(lblTiles[20]);
        // 21
        lblTiles[21] = new JLabel("Tile" + Integer.toString(21));
        lblTiles[21].setBackground(Color.decode("#964800"));
        lblTiles[21].setOpaque(true);
        lblTiles[21].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(20);
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
        panelCenter.add(lblTiles[21]);
        // 22
        lblTiles[22] = new JLabel("Tile" + Integer.toString(22));
        lblTiles[22].setBackground(Color.decode("#964800"));
        lblTiles[22].setOpaque(true);
        lblTiles[22].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(21);
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
        panelCenter.add(lblTiles[22]);
        // 23
        lblTiles[23] = new JLabel("Tile" + Integer.toString(23));
        lblTiles[23].setBackground(Color.decode("#964800"));
        lblTiles[23].setOpaque(true);
        lblTiles[23].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(22);
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
        panelCenter.add(lblTiles[23]);
        // 24
        lblTiles[24] = new JLabel("Tile" + Integer.toString(24));
        lblTiles[24].setBackground(Color.decode("#964800"));
        lblTiles[24].setOpaque(true);
        lblTiles[24].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(23);
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
        panelCenter.add(lblTiles[24]);
        // 25
        lblTiles[25] = new JLabel("Tile" + Integer.toString(25));
        lblTiles[25].setBackground(Color.decode("#964800"));
        lblTiles[25].setOpaque(true);
        lblTiles[25].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(24);
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
        panelCenter.add(lblTiles[25]);
        // 26
        lblTiles[26] = new JLabel("Tile" + Integer.toString(26));
        lblTiles[26].setBackground(Color.decode("#964800"));
        lblTiles[26].setOpaque(true);
        lblTiles[26].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(25);
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
        panelCenter.add(lblTiles[26]);
        // 27
        lblTiles[27] = new JLabel("Tile" + Integer.toString(27));
        lblTiles[27].setBackground(Color.decode("#964800"));
        lblTiles[27].setOpaque(true);
        lblTiles[27].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(26);
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
        panelCenter.add(lblTiles[27]);
        // 28
        lblTiles[28] = new JLabel("Tile" + Integer.toString(28));
        lblTiles[28].setBackground(Color.decode("#964800"));
        lblTiles[28].setOpaque(true);
        lblTiles[28].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(27);
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
        panelCenter.add(lblTiles[28]);
        // 29
        lblTiles[29] = new JLabel("Tile" + Integer.toString(29));
        lblTiles[29].setBackground(Color.decode("#964800"));
        lblTiles[29].setOpaque(true);
        lblTiles[29].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(28);
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
        panelCenter.add(lblTiles[29]);
        // 30
        lblTiles[30] = new JLabel("Tile" + Integer.toString(30));
        lblTiles[30].setBackground(Color.decode("#964800"));
        lblTiles[30].setOpaque(true);
        lblTiles[30].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(29);
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
        panelCenter.add(lblTiles[30]);
        // 31
        lblTiles[31] = new JLabel("Tile" + Integer.toString(31));
        lblTiles[31].setBackground(Color.decode("#964800"));
        lblTiles[31].setOpaque(true);
        lblTiles[31].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(30);
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
        panelCenter.add(lblTiles[31]);
        // 32
        lblTiles[32] = new JLabel("Tile" + Integer.toString(32));
        lblTiles[32].setBackground(Color.decode("#964800"));
        lblTiles[32].setOpaque(true);
        lblTiles[32].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(31);
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
        panelCenter.add(lblTiles[32]);
        // 33
        lblTiles[33] = new JLabel("Tile" + Integer.toString(33));
        lblTiles[33].setBackground(Color.decode("#964800"));
        lblTiles[33].setOpaque(true);
        lblTiles[33].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(32);
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
        panelCenter.add(lblTiles[33]);
        // 34
        lblTiles[34] = new JLabel("Tile" + Integer.toString(34));
        lblTiles[34].setBackground(Color.decode("#964800"));
        lblTiles[34].setOpaque(true);
        lblTiles[34].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(33);
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
        panelCenter.add(lblTiles[34]);
        // 35
        lblTiles[35] = new JLabel("Tile" + Integer.toString(35));
        lblTiles[35].setBackground(Color.decode("#964800"));
        lblTiles[35].setOpaque(true);
        lblTiles[35].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(34);
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
        panelCenter.add(lblTiles[35]);
        // 36
        lblTiles[36] = new JLabel("Tile" + Integer.toString(36));
        lblTiles[36].setBackground(Color.decode("#964800"));
        lblTiles[36].setOpaque(true);
        lblTiles[36].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(35);
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
        panelCenter.add(lblTiles[36]);
        // 37
        lblTiles[37] = new JLabel("Tile" + Integer.toString(37));
        lblTiles[37].setBackground(Color.decode("#964800"));
        lblTiles[37].setOpaque(true);
        lblTiles[37].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(36);
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
        panelCenter.add(lblTiles[37]);
        // 38
        lblTiles[38] = new JLabel("Tile" + Integer.toString(38));
        lblTiles[38].setBackground(Color.decode("#964800"));
        lblTiles[38].setOpaque(true);
        lblTiles[38].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(37);
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
        panelCenter.add(lblTiles[38]);
        // 39
        lblTiles[39] = new JLabel("Tile" + Integer.toString(39));
        lblTiles[39].setBackground(Color.decode("#964800"));
        lblTiles[39].setOpaque(true);
        lblTiles[39].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(38);
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
        panelCenter.add(lblTiles[39]);
        // 40
        lblTiles[40] = new JLabel("Tile" + Integer.toString(40));
        lblTiles[40].setBackground(Color.decode("#964800"));
        lblTiles[40].setOpaque(true);
        lblTiles[40].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(39);
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
        panelCenter.add(lblTiles[40]);
        // 41
        lblTiles[41] = new JLabel("Tile" + Integer.toString(41));
        lblTiles[41].setBackground(Color.decode("#964800"));
        lblTiles[41].setOpaque(true);
        lblTiles[41].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(40);
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
        panelCenter.add(lblTiles[41]);
        // 42
        lblTiles[42] = new JLabel("Tile" + Integer.toString(42));
        lblTiles[42].setBackground(Color.decode("#964800"));
        lblTiles[42].setOpaque(true);
        lblTiles[42].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(41);
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
        panelCenter.add(lblTiles[42]);
        // 43
        lblTiles[43] = new JLabel("Tile" + Integer.toString(43));
        lblTiles[43].setBackground(Color.decode("#964800"));
        lblTiles[43].setOpaque(true);
        lblTiles[43].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(42);
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
        panelCenter.add(lblTiles[43]);
        // 44
        lblTiles[44] = new JLabel("Tile" + Integer.toString(44));
        lblTiles[44].setBackground(Color.decode("#964800"));
        lblTiles[44].setOpaque(true);
        lblTiles[44].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(43);
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
        panelCenter.add(lblTiles[44]);
        // 45
        lblTiles[45] = new JLabel("Tile" + Integer.toString(45));
        lblTiles[45].setBackground(Color.decode("#964800"));
        lblTiles[45].setOpaque(true);
        lblTiles[45].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(44);
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
        panelCenter.add(lblTiles[45]);
        // 46
        lblTiles[46] = new JLabel("Tile" + Integer.toString(46));
        lblTiles[46].setBackground(Color.decode("#964800"));
        lblTiles[46].setOpaque(true);
        lblTiles[46].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(45);
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
        panelCenter.add(lblTiles[46]);
        // 47
        lblTiles[47] = new JLabel("Tile" + Integer.toString(47));
        lblTiles[47].setBackground(Color.decode("#964800"));
        lblTiles[47].setOpaque(true);
        lblTiles[47].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(46);
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
        panelCenter.add(lblTiles[47]);
        // 48
        lblTiles[48] = new JLabel("Tile" + Integer.toString(48));
        lblTiles[48].setBackground(Color.decode("#964800"));
        lblTiles[48].setOpaque(true);
        lblTiles[48].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(47);
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
        panelCenter.add(lblTiles[48]);
        // 49
        lblTiles[49] = new JLabel("Tile" + Integer.toString(49));
        lblTiles[49].setBackground(Color.decode("#964800"));
        lblTiles[49].setOpaque(true);
        lblTiles[49].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(48);
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
        panelCenter.add(lblTiles[49]);
        // 50
        lblTiles[50] = new JLabel("Tile" + Integer.toString(50));
        lblTiles[50].setBackground(Color.decode("#964800"));
        lblTiles[50].setOpaque(true);
        lblTiles[50].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                farm.checkTile(49);
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
        panelCenter.add(lblTiles[50]);
        // add panel to frame
        this.add(panelCenter, BorderLayout.CENTER);
    }

    // update the player info DEBUG DOES IT UPDATE?
    public String updatePlayer() {
        return setPlayerInfo(farm.getCurrentPlayerInfo());
    }

    // set seed inventory and player info
    public String setPlayerInfo(String playerInfo) {
        String playerINFO = "";
        player.CheckSeedInventory();
        playerINFO = player.getOutput() + "\n" + player.getOutput2() + "\n" + playerInfo;
        return playerINFO;
    }

    // add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener) {
        btnStore.addActionListener(listener);
        btnHelp.addActionListener(listener);
        btnPlow.addActionListener(listener);
        btnPlant.addActionListener(listener);
        btnWater.addActionListener(listener);
        btnFertilizer.addActionListener(listener);
        btnPickaxe.addActionListener(listener);
        btnShovel.addActionListener(listener);
    }

    // add docs listeners to texts
    public void setDocumentsListener(DocumentListener listener) {
        text.getDocument().addDocumentListener(listener);

    }
}
