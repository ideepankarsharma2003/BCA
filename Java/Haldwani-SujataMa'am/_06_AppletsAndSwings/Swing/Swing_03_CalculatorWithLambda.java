// package Swing;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_03_CalculatorWithLambda extends JFrame{

    JTextField t1 = new JTextField("0", 15);
    JTextField t2 = new JTextField("0", 15);
    JButton b1 = new JButton("ADD");
    JButton b2 = new JButton("SUBTRACT");
    JButton b3 = new JButton("MULTIPLY");
    JButton b4 = new JButton("DIVIDE");
    JButton b5 = new JButton("MODULUS");
    JLabel l = new JLabel("Result");

    Swing_03_CalculatorWithLambda() {
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(ae ->{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            l.setText(String.valueOf(num1+num2));
        });

        b2.addActionListener(ae ->{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            l.setText(String.valueOf(num1-num2));
        });

        b3.addActionListener(ae ->{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            l.setText(String.valueOf(num1*num2));
        });

        b4.addActionListener(ae ->{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            l.setText(String.valueOf(num1/num2));
        });

        b5.addActionListener(ae ->{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            l.setText(String.valueOf(num1%num2));
        });


        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l);

    }

    
    public static void main(String[] args) {
        new Swing_03_CalculatorWithLambda();
    }
}
