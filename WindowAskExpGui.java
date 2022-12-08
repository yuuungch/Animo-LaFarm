import javax.swing.*;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionListener;

import java.text.CollationElementIterator;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WindowAskExpGui extends JFrame {
    // create buttons as we need to use it later on
    private JButton btnConfirm;
    // create textfield
    private JTextField tfUserInput;
    private String strUserInput;
    private int intUserInput;
    private ControllerFarm farmControl;
    private String infoQ;

    public WindowAskExpGui(String infoQString) {
        super("Information");

        // string
        this.infoQ = infoQ;

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
                // strUserInput = getUserInput();
                intUserInput = Integer.valueOf(strUserInput);
                if (intUserInput < 1 || intUserInput > 2) {
                    farmControl.error();
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
        JTextArea taInfoQ = new JTextArea(infoQ);
        taInfoQ.setForeground(Color.BLACK);

        // add label to subpanel
        panelCenter.add(taInfoQ);

        // add textfield
        tfUserInput = new JTextField(10);

        // add textfield to panel
        panelCenter.add(tfUserInput);

        // add namepanel to center panel
        this.add(panelCenter, BorderLayout.CENTER);
    }

    // add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener) {
        btnConfirm.addActionListener(listener);
    }

    // add docs listeners to texts
    public void setDocumentsListener(DocumentListener listener) {
        tfUserInput.getDocument().addDocumentListener(listener);
    }

    public String getUserInput() {
        return tfUserInput.getText();
    }

    public int getChoice() {
        return intUserInput;
    }

}