// package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Swing_05_MouseEvent extends JFrame{
    Swing_05_MouseEvent(){
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(400, 500);
        setDefaultCloseOperation(3);
        JLabel l= new JLabel("Hello Detective !!!");
        l.setFont(new Font("Times new roman", Font.BOLD, 30));
        add(l, BorderLayout.CENTER);


        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){


                // int x= me.getClientX();
                // int y= me.getClientY();
                int x= me.getX();
                int y= me.getY();
                String labelValue= "The event occured at coordinates ("+ String.valueOf(x)+ ","+ String.valueOf(y)+")";
                l.setForeground(Color.BLUE);
                l.setText(labelValue);
                System.out.println(labelValue);
            }
        });
    }
    public static void main(String[] args) {
        new Swing_05_MouseEvent();
    }
}
