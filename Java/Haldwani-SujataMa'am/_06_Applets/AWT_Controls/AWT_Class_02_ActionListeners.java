import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class AWT_Class_02_ActionListeners extends WindowAdapter implements ActionListener, WindowListener{
    Frame f;
    
    TextField tf1;
    TextField tf2;
    TextField tf3;

    String sTemp;
    Button b, b1, b2, b3, b4;

    // overriding the method of Window Adapter !!!!
    public void windowClosing(WindowEvent w) {
        System.out.println("Closing the Window :(");
        System.exit(0);
    }

    

    AWT_Class_02_ActionListeners(){
        f = new Frame();
        f.setTitle("Sum of two numbers");
        f.setVisible(true);
        f.setBounds(50, 50, 11 00, 100);
        f.setBackground(Color.magenta);
        Label l1 = new Label("First Number");
        f.add(l1);
        tf1 = new TextField(10);
        f.add(tf1);
        Label l2 = new Label("Second Number");
        f.add(l2);
        tf2 = new TextField(10);
        f.add(tf2);
        Label l3 = new Label("Result");
        f.add(l3);
        tf3 = new TextField(10);
        f.add(tf3);

        b = new Button("ADD");
        b.setBackground(Color.YELLOW);
        b.setForeground(Color.RED);
        b.addActionListener(this);
        f.add(b);
        f.addWindowListener(this);

        b1 = new Button("SUBTRACT");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        f.add(b1);
        f.addWindowListener(this);

        b2 = new Button("MULTIPLY");
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        f.add(b2);
        f.addWindowListener(this);

        b3 = new Button("DIVIDE");
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.RED);
        b3.addActionListener(this);
        f.add(b3);
        f.addWindowListener(this);
        
        b4 = new Button("MODULO");
        b4.setBackground(Color.YELLOW);
        b4.setForeground(Color.RED);
        b4.addActionListener(this);
        f.add(b4);
        f.addWindowListener(this);
        
        /* 
        // works fine !!!!! using anonymous class
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                // f.dispose();
                System.exit(0);
            }
        });
        */

        // f.addWindowListener(WindowAdapter);
        // f.addWindowListener(new test());
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(tf1.getText());
        int y = Integer.parseInt(tf2.getText());
        
        if(e.getSource()==b)
        sTemp= String.valueOf(x + y);
        if(e.getSource()==b1)
        sTemp= String.valueOf(x - y);
        if(e.getSource()==b2)
        sTemp= String.valueOf(x * y);
        if(e.getSource()==b3)
        sTemp= String.valueOf(x / y);
        if(e.getSource()==b4)
        sTemp= String.valueOf(x % y);

        tf3.setText(sTemp);

    }

    

    public static void main(String[] args) {
        AWT_Class_02_ActionListeners obj= new AWT_Class_02_ActionListeners();
    }
}
