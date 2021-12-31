import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

public class EventHandling_01_ActionListeners extends Frame {

    
    EventHandling_01_ActionListeners(){
        setVisible(true);
        setBounds(50, 20, 1100, 500);
        setBackground(Color.ORANGE);
        setLayout(new FlowLayout());
        // setLayout(new BorderLayout());
        Label l = new Label();

        Button b1= new Button("MyButton");
        b1.setBackground(Color.CYAN);
        add(b1);

       TextField tNORTH = new TextField("NORTH", 100);
        tNORTH.setBackground(Color.CYAN);
        add(tNORTH, BorderLayout.NORTH);

        TextField tSOUTH = new TextField("SOUTH");
        tSOUTH.setBackground(Color.CYAN);
        add(tSOUTH, BorderLayout.SOUTH);

        TextField tEAST = new TextField("EAST");
        tEAST.setBackground(Color.CYAN);
        add(tEAST, BorderLayout.EAST);

        TextField tWEST = new TextField("WEST");
        tWEST.setBackground(Color.CYAN);
        add(tWEST, BorderLayout.WEST);

        WindowListener wl= new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        };
        addWindowListener(wl);

        ActionListener al= new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Font f1= new Font("Algerian", Font.PLAIN, 15);
                tNORTH.setFont(f1);
                tNORTH.setText("Awwww you did press the button hehehe,   (*_*)     How Cute ");
                add(l, BorderLayout.NORTH);
            }
        };
        b1.addActionListener(al);

    }
    
    // overriding the method of Window Adapter !!!!
    public void windowClosing(WindowEvent w) {
        System.out.println("Closing the Window :(");
        System.exit(0);
    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        EventHandling_01_ActionListeners obj= new EventHandling_01_ActionListeners();
    }
}
