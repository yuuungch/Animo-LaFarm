import javax.swing.*;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionListener;

import java.text.CollationElementIterator;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WindowAskWaterGui extends JFrame {
    // create buttons as we need to use it later on
    private JButton btnConfirm;
    // create textfield
    private JTextField tfTileNum;
    private String chosenTile;
    private int chosenTileNum;
    private ControllerFarm farmControl;
    private WindowErrorGui errorGui;
    private ArrayList<Tile> Land;
    private PlowTool plowTool;
    private Farm farm;
    private WateringCan wateringCan;

    public WindowAskWaterGui(ArrayList<Tile> Land, PlowTool plowTool, Farm farm,
            WateringCan wateringCan) {
        super("Selecting Tile");

        // this
        this.Land = Land;
        this.plowTool = plowTool;
        this.farm = farm;
        this.wateringCan = wateringCan;

        // set layout
        setLayout(new BorderLayout());

        // Set size of our window
        setSize(350, 200);

        // add elements before visible
        init();

        // explicityle set the visibility to true
        setVisible(true);

        // set resizable to false to prevent users from resizing the window
        setResizable(false);

        // set default: hide the frame, don't end the program
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    // we will layout the elements/components here
    private void init() {
        // south panel
        JPanel panelSouth = new JPanel();
        // specify the layout of the panel to make it borderlayout
        panelSouth.setLayout(new FlowLayout());
        panelSouth.setBackground(Color.GRAY);

        // add button to panel
        btnConfirm = new JButton("Confirm");
        btnConfirm.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                chosenTile = getTileNum();
                chosenTileNum = Integer.valueOf(chosenTile);
                farmControl = new ControllerFarm(farm, Land, plowTool);
                if (chosenTileNum < 0 || chosenTileNum >= Land.size()) {
                    tfTileNum.setText(null);
                    farmControl.error();
                } else if (chosenTileNum >= 0 && chosenTileNum < Land.size()) {
                    wateringCan.Water(Land, chosenTileNum);
                }
                dispose();
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
        panelSouth.add(btnConfirm);

        // add panel to frame
        this.add(panelSouth, BorderLayout.SOUTH);

        // north (name) subpanel inside the Center panel
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.LIGHT_GRAY);

        // add label to subpanel
        JLabel lblAsk = new JLabel("Please enter tile number: ");
        lblAsk.setForeground(Color.BLACK);

        // add label to subpanel
        panelCenter.add(lblAsk);

        // add textfield
        tfTileNum = new JTextField(10);

        // add textfield to panel
        panelCenter.add(tfTileNum);

        // add namepanel to center panel
        this.add(panelCenter, BorderLayout.CENTER);
    }

    /**
     * @param listener
     */
    // add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener) {
        btnConfirm.addActionListener(listener);
    }

    /**
     * @param listener
     */
    // add docs listeners to texts
    public void setDocumentsListener(DocumentListener listener) {
        tfTileNum.getDocument().addDocumentListener(listener);
    }

    /**
     * @return String
     */
    public String getTileNum() {
        return tfTileNum.getText();
    }

    // public void setTileNum(JTextField tfTileNum){
    // tfTileNu
    // }
}