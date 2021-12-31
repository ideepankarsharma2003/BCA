import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing_01_SwingDemo extends JFrame{ // CardLayout -----> by default one over other !!! Like pack of cards !
    public Swing_01_SwingDemo(){
        setVisible(true);
        this.setBounds(new Rectangle(100, 200, 250, 500));
        JLabel l= new JLabel("Hello Detective !!!");
        JLabel l1= new JLabel("This is Lucifer !!!!");
        add(l);
        add(l1); // CardLayout(null) -----> by default, one Component is placed over another
        setLayout(new FlowLayout(FlowLayout.LEFT)); // null, FlowLayout, GridLayout, BorderLayout

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button to exit normally !!!
        // setDefaultCloseOperation(3); // close button to exit normally !!!
    }

    public static void main(String[] args) {
        Swing_01_SwingDemo obj= new Swing_01_SwingDemo();
        // obj.show(); // ----> deprecated
    }
}
