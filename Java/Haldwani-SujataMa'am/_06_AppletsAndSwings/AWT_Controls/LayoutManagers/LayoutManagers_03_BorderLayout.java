package LayoutManagers;

import java.awt.*;

public class LayoutManagers_03_BorderLayout {

    LayoutManagers_03_BorderLayout(){
        Frame myFrame= new Frame("MyFrame-BorderLayout");
        myFrame.setVisible(true);
        myFrame.setBounds(50, 20, 1100, 500);
        myFrame.setBackground(Color.ORANGE);
        myFrame.setLayout(new BorderLayout()); 

        TextField t1= new TextField("Deepankar Sharma");
        t1.setBackground(Color.CYAN);
        myFrame.add(t1);
        
        TextField tNORTH= new TextField("NORTH");
        tNORTH.setBackground(Color.CYAN);
        myFrame.add(tNORTH, BorderLayout.NORTH);

        TextField tSOUTH= new TextField("SOUTH");
        tSOUTH.setBackground(Color.CYAN);
        myFrame.add(tSOUTH, BorderLayout.SOUTH);

        TextField tEAST= new TextField("EAST");
        tEAST.setBackground(Color.CYAN);
        myFrame.add(tEAST, BorderLayout.EAST);

        TextField tWEST= new TextField("WEST");
        tWEST.setBackground(Color.CYAN);
        myFrame.add(tWEST, BorderLayout.WEST);


    }


    public static void main(String[] args) {
        LayoutManagers_03_BorderLayout obj= new LayoutManagers_03_BorderLayout();
    }
}
