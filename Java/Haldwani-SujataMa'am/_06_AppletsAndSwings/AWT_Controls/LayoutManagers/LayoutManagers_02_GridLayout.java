package LayoutManagers;

import java.awt.*;

public class LayoutManagers_02_GridLayout {
    public LayoutManagers_02_GridLayout(){

        Frame myFrame= new Frame("GridLayout");
        myFrame.setVisible(true);
        myFrame.setBounds(100, 100, 1000, 1000);
        myFrame.setBackground(Color.magenta);
        myFrame.setLayout(new GridLayout(4, 5)); // 4 rows , 5 columns
        
        for(int i= 0; i<25; i++){
            Button b= new Button("Button-"+ String.valueOf(i));
            b.setBackground(Color.black);
            b.setForeground(Color.YELLOW);
            myFrame.add(b);
        }
    }


    public static void main(String[] args) {
        LayoutManagers_02_GridLayout obj= new LayoutManagers_02_GridLayout();
    }
}
