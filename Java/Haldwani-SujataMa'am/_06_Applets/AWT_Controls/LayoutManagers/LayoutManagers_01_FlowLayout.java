package LayoutManagers;
import java.awt.*;

public class LayoutManagers_01_FlowLayout {
    public LayoutManagers_01_FlowLayout(){
        Label l1= new Label("Label-1");
        Label l2= new Label("Label-2");
        Label l3= new Label("Label-3");
        Label l4= new Label("Label-4");

        Frame fCenter= new Frame("MyFrame-Center");
        fCenter.setBackground(Color.pink);
        fCenter.setBounds(new Rectangle(0, 0, 100, 100));
        fCenter.setVisible(true);
        fCenter.add(l1);
        fCenter.add(l2);
        fCenter.add(l3);
        fCenter.add(l4);
        fCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Frame fLeft= new Frame("MyFrame-Left");
        fLeft.setBackground(Color.pink);
        fLeft.setBounds(new Rectangle(100, 100, 100, 100));
        fLeft.setVisible(true);
        fLeft.add(l1);
        fLeft.add(l2);
        fLeft.add(l3);
        fLeft.add(l4);
        fLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        
        Frame fRight= new Frame("MyFrame-Right");
        fRight.setBackground(Color.pink);
        fRight.setBounds(new Rectangle(200, 200, 100, 100));
        fRight.setVisible(true);
        fRight.add(l1);
        fRight.add(l2);
        fRight.add(l3);
        fRight.add(l4);
        fRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        
        Frame fLeading= new Frame("MyFrame-Leading");
        fLeading.setBackground(Color.pink);
        fLeading.setBounds(new Rectangle(300, 300, 100, 100));
        fLeading.setVisible(true);
        fLeading.add(l1);
        fLeading.add(l2);
        fLeading.add(l3);
        fLeading.add(l4);
        fLeading.setLayout(new FlowLayout(FlowLayout.LEADING));
        
        
        Frame fTrailing= new Frame("MyFrame-Trailing");
        fTrailing.setBackground(Color.pink);
        fTrailing.setBounds(new Rectangle(500, 100, 100, 100));
        fTrailing.setVisible(true);
        fTrailing.add(l1);
        fTrailing.add(l2);
        fTrailing.add(l3);
        fTrailing.add(l4);
        fTrailing.setLayout(new FlowLayout(FlowLayout.TRAILING));
        


        // fCenter.setLayout(new FlowLayout());

    }

    public static void main(String[] args) {
        LayoutManagers_01_FlowLayout obj= new LayoutManagers_01_FlowLayout();
    }
}
