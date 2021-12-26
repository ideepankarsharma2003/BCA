package EventHandling;

import java.awt.*;
import java.awt.event.*;
public class EventHandling_01_ActionListeners extends WindowAdapter implements ActionListener{
    // overriding the method of Window Adapter !!!!
    public void windowClosing(WindowEvent w) {
        System.out.println("Closing the Window :(");
        System.exit(0);
    }
}
