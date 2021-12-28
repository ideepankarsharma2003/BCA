import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_02_Addition extends JFrame implements ActionListener{
    JTextField t1;
    JTextField t2;
    JButton b1;
    JLabel j1= new JLabel("Result");

    Swing_02_Addition(){
        setSize(1500, 1600);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(3);


        t1= new JTextField("0", 10);
        t2= new JTextField("0", 10);
        b1= new JButton("ADD");

        add(t1);
        add(t1);
        add(b1);
        add(j1);
    }

    public static void main(String[] args) {
        Swing_02_Addition obj= new Swing_02_Addition();
    }    
}
