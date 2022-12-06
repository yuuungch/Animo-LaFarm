
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class WindowAskGui extends JFrame implements ActionListener{
    private JTextField tileInput;
    private JLabel lblSuccess;
    private JLabel lblTile;
    private JButton btnConfirm;
    public WindowAskGui(){
        super();
        //JFrame frame = new JFrame();

        setLayout(new BorderLayout());
        //set size of window
        setSize(350,200);
        
        //add elements
        askUser();

        //set visibility
        setVisible(true);
        
        //set dafault close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void askUser(){
        JPanel panel = new JPanel();

        //set layout
        //panel.setLayout(null);

        //JLabels
        lblTile = new JLabel("Tile");
        lblTile.setBounds(10,20,80,25);
        
        //add label to panel
        panel.add(lblTile);

        //JtextArea
        tileInput = new JTextField(20);
        tileInput.setBounds(100,20,165,25);

        //add text area to panel
        panel.add(tileInput);

        //button
        btnConfirm = new JButton("Confirm");
        btnConfirm.setBounds(10, 80, 80, 25);
        btnConfirm.addActionListener(new WindowAskGui());
        
        //add button to panel
        panel.add(btnConfirm);

        //success
        lblSuccess = new JLabel("");
        lblSuccess.setBounds(10, 110, 300, 25);
        panel.add(lblSuccess);
        this.add(panel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tileChosen = tileInput.getText();
        System.out.println("tile" + tileChosen);
        
    }
}
