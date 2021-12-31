import java.awt.*;

import javax.swing.plaf.DimensionUIResource;

public class AWT_Class_01_AWT_heirarchy extends Frame{
    AWT_Class_01_AWT_heirarchy(String str){
        super(str);
    }
    public static void main(String[] args) {

        // Frame using Association 
        Frame f= new Frame();
        
        if(f.isVisible()){
            System.out.println("The frame is visible !!!");
        }else System.out.println("The frame is not visible !!!");
        
        f.setVisible(true);
        
        if(f.isVisible()){
            System.out.println("The frame is visible !!!");
        }else System.out.println("The frame is not visible !!!");
        
        f.setTitle("MyFrame-0");

        f.setBackground(Color.ORANGE);

        int height=200, width= 800;
        int horizMargin=100, vertMargin=20;

        f.setSize(new DimensionUIResource(width, height));
        f.setLocation(new Point(horizMargin, vertMargin));

        Frame f1= new Frame("MyFrame-1");
        f1.setBackground(Color.red);
        f1.setBounds(new Rectangle(horizMargin+300, vertMargin+300, width-10, height-10));
        f1.setVisible(true);
        
        // Frame extending the Frame class 
        AWT_Class_01_AWT_heirarchy f2= new AWT_Class_01_AWT_heirarchy("MyFrame-2");
        f2.setBackground(Color.MAGENTA);
        f2.setBounds(new Rectangle(horizMargin+500, vertMargin+500, width-100, height-100));
        f2.setVisible(true);

        // Text Field
        TextField t= new TextField(); // 1 character
        TextField t1= new TextField(10); // maximum 10 characters
        TextField t2= new TextField("Hello"); // with "Hello"
        TextField t3= new TextField("Detective", 15); // with "Hello"+ 15 characters

        // TextField functions
        if (t.isEditable()) {
            System.out.println("TextField t is editable !!!");
        } else System.out.println("TextField t is not editable !!!");
        
        t.setEditable(false);
        
        if (t.isEditable()) {
            System.out.println("TextField t is editable !!!");
        } else System.out.println("TextField t is not editable !!!");

        System.out.println("The text in t2 + t3 is: "+ (t2.getText()+' '+ t3.getText()));
        
        t1.setText("Lucifer Morningstar");
        System.out.println("The text in t1 is: "+ (t1.getText()));


        // adding textfields
        Frame fnewTxtFeild = new Frame("fnewTxtFeild");
        fnewTxtFeild.setVisible(true);
        fnewTxtFeild.add(t);
        fnewTxtFeild.add(t1);
        fnewTxtFeild.add(t2);
        fnewTxtFeild.add(t3);

        Frame fnewDashTxtFeild = new Frame("fnewDashTxtFeild");
        fnewDashTxtFeild.setLayout(new FlowLayout()); // center allignment
        fnewDashTxtFeild.setVisible(true);
        fnewDashTxtFeild.add(t);
        fnewDashTxtFeild.add(t1);
        fnewDashTxtFeild.add(t2);
        fnewDashTxtFeild.add(t3);
        
        f2.setLayout(new FlowLayout()); // center allignment
        f2.add(t);
        f2.add(t1);
        f2.add(t2);
        f2.add(t3);

        // Button
        Button b= new Button();
        Button b1= new Button("MyButton-1");
        Button b2= new Button();

        // Button-Methods
        b2.setLabel("MyButton-2");

        b1.setBackground(Color.orange);
        b2.setBackground(Color.green);

        b1.setForeground(Color.black);
        b2.setForeground(Color.RED);

        // b.show(); // -----> deprecated from version 1.1
        b.setVisible(true);

        // adding buttons
        Frame fnewButtonFld= new Frame("fnewButtonFld");
        fnewButtonFld.setVisible(true);
        Frame fnewDashButtonFld = new Frame("fnewDashButtonFld");
        fnewDashButtonFld.setVisible(true);

        fnewButtonFld.add(b);
        fnewButtonFld.add(b1);
        fnewButtonFld.add(b2);
        
        fnewDashButtonFld.add(b);
        fnewDashButtonFld.add(b1);
        fnewDashButtonFld.add(b2);
        
        f2.add(b);
        f2.add(b1);
        f2.add(b2);


    }
}
