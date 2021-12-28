import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Swing_02_Addition
 */
public class Swing_02_Addition extends JFrame implements ActionListener{
    JLabel l1= new JLabel("Result");
    JTextField t1, t2;
    JButton b1= new JButton("ADD");

    Swing_02_Addition(){
        setSize(600, 500);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        t1= new JTextField("0", 10);
        t2= new JTextField("0", 10);

        ActionListener al= new ActionListener(){ // ----> Inner Anonymous Class !!!
            public void actionPerformed(ActionEvent ae){
                double num1= Double.parseDouble(t1.getText());
                double num2= Double.parseDouble(t2.getText());
                double sum= num1+num2;
                l1.setText(String.valueOf(sum));
            }
        }; 
        b1.addActionListener(al); 


        // b1.addActionListener(this); // ActionListener is an interface, and 'this' is an anonymous object !!!!

        add(t1);
        add(t2);
        add(b1);
        add(l1);
    }



    public void actionPerformed(ActionEvent ae){
        double num1= Double.parseDouble(t1.getText());
        double num2= Double.parseDouble(t2.getText());
        double sum= num1+num2;
        l1.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        Swing_02_Addition obj= new Swing_02_Addition();
    
    }
    
}