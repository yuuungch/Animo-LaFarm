import javax.swing.*;
import java.awt.*;

public class WindowTileGui extends JFrame{
    private String output;

    //constructor
    public WindowTileGui(String output){
        //add window title
        super("Tile Info");
        
        //output
        this.output = output;

        //set window layout
        setLayout(new BorderLayout());

        //set size of window
        setSize(420,420);

        //add elements
        tileElements();

        //set visibility
        setVisible(true);

        //set resizable 
        setResizable(false);

        //set default close
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    //elements of window
    private void tileElements(){
        //center panel
        JPanel panelCenter = new JPanel();

        //specify the layout
        panelCenter.setLayout(new FlowLayout());

        //set bg color
        panelCenter.setBackground(Color.decode("#C4A484"));

        //add text
        JTextArea tileInfo = new JTextArea(output);

        //add label to panel
        panelCenter.add(tileInfo);

        //add namepanel to center panel
        this.add(panelCenter, BorderLayout.CENTER);
    }
}
