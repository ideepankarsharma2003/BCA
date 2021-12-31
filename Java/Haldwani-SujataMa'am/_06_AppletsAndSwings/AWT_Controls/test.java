import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class test implements ActionListener 
{
    TextField tf1;
    TextField tf2;
    TextField tf3;
        test(){
        Frame f=new Frame();
        f.setTitle("Sum of two numbers");
        f.setVisible(true);
        f.setBounds(50,50,600,400);
        f.setBackground(Color.CYAN);
        Label l1=new Label("First Number");
        f.add(l1);
        tf1=new TextField(10);
        f.add(tf1);
        Label l2=new Label("Second Number");
        f.add(l2);
        tf2=new TextField(10);
        f.add(tf2);
        Label l3=new Label("Result");
        f.add(l3);
        tf3=new TextField(10);
        f.add(tf3);
        Button b=new Button("ADD");
        b.setBackground(Color.YELLOW);
        b.setForeground(Color.RED);
        b.addActionListener(this);
        f.add(b);
        // f.addWindowListener(new WindowAdapter());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               f.dispose();
         }        
      });  
        // f.addWindowListener(WindowAdapter);
        // f.addWindowListener(new test());
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        }
    
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());
        String c= String.valueOf(a+b); 
          
        tf3.setText(c)  ;

        
    }
    public void windowClosing(WindowEvent w)
    {
        System.exit(0);
    }
    public static void main(String[] args)
    {
        test t=new test();
        
    }
}