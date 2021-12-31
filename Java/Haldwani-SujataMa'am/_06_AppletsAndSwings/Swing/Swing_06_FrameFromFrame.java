import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JProgressBar;

public class Swing_06_FrameFromFrame extends JFrame implements ActionListener{
    int i = 0;
    JProgressBar pb;
    

    Swing_06_FrameFromFrame(){
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * ProgressBar in Java Swings
         */
        pb= new JProgressBar(0, 20);
        Timer t= new Timer(250, this);
        
        JButton b= new JButton("Click Me");
        b.addActionListener(ae->{
            // new Swing_03_CalculatorWithLambda();
            // dispose();
            t.start();
        });

        add(b);
        add(pb);
    }

    public void actionPerformed(ActionEvent ae){
                if(i==20){
                    new Swing_04_JRadioButton_JCheckBox();
                    dispose();
                }
                i++;
                pb.setValue(i);
                    
    }

    public static void main(String[] args) {
        new Swing_06_FrameFromFrame();
    }
    
}
