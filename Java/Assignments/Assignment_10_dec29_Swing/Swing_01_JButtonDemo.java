import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Swing_01_JButtonDemo
 */
public class Swing_01_JButtonDemo extends JFrame {
    Swing_01_JButtonDemo(){
        setVisible(true);
        setBounds(new Rectangle(10, 20, 600, 300));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1= new JButton(new ImageIcon("clickMe.jpg"));
        JLabel l1= new JLabel();
        add(b1, BorderLayout.CENTER);
        add(l1);
        
        ActionListener al= new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                l1.setText("Welcome to BCA 3rd Semester !!!!");
            }
        };

        b1.addActionListener(al);
    }

    public static void main(String[] args) {
        Swing_01_JButtonDemo obj= new Swing_01_JButtonDemo();
        System.out.println("Ran Successfully !!!!");
    }    
}