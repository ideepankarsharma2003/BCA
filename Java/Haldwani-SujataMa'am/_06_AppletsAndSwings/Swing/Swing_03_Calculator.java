// package Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_03_Calculator extends JFrame implements ActionListener{
    
    JTextField t1 = new JTextField("0", 15);
    JTextField t2 = new JTextField("0", 15);
    JButton b1 = new JButton("ADD");
    JButton b2 = new JButton("SUBTRACT");
    JButton b3 = new JButton("MULTIPLY");
    JButton b4 = new JButton("DIVIDE");
    JButton b5 = new JButton("MODULUS");
    JLabel l = new JLabel("Result");

    Swing_03_Calculator(){
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l);        

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        double value=0.0;
        double num1= Double.parseDouble(t1.getText());
        double num2= Double.parseDouble(t2.getText());

        if(ae.getSource()==b1){
            value= num1+num2;
        }
        if(ae.getSource()==b2){
            value= num1-num2;
        }
        if(ae.getSource()==b3){
            value= num1*num2;
        }
        if(ae.getSource()==b4){
            value= num1/num2;
        }
        if(ae.getSource()==b5){
            value= num1%num2;
        }

        l.setText(String.valueOf(value));
    }


    public static void main(String[] args) {
        new Swing_03_Calculator();
    }
}
