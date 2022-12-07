import javax.swing.*;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.CollationElementIterator;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowOutputGui extends JFrame {
    //create buttons as we need to use it later on
    private JButton btnTryAgain; 
    private String output;  

    public WindowOutputGui(String output){
        super("Result");

        // this
        this.output = output;

        //layout
        setLayout( new BorderLayout());

        //Set size of our window
        setSize(350, 200);

        //add elements before visible
        init();

        //explicityle set the visibility to true
        setVisible(true);

        //set resizable to false to prevent users from resizing the window
        setResizable(false);

        //set default: hide the frame, don't end the program
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    //we will layout the elements/components here
    private void init(){

        //center panel
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.LIGHT_GRAY);

        //add label to panel
        JLabel lblAsk = new JLabel(output);
        lblAsk.setForeground(Color.BLACK);

        //add label to panel
        panelCenter.add(lblAsk);

        //add namepanel to center panel
        this.add(panelCenter, BorderLayout.CENTER);
    }

    //add listeners to the buttons to know what the buttons are doing
    public void setActionListener(ActionListener listener){
        btnTryAgain.addActionListener(listener);
    }
}