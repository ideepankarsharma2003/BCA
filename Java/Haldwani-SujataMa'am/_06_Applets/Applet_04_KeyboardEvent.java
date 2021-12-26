// <head>
// <body>
// <applet code=Applet_04_KeyboardEvent
//         height=300
//         width=400>
// </head>
// </body>
// </applet>

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet_04_KeyboardEvent extends Applet implements KeyListener{
    public void init(){
        // addKeyListener(this);
        addKeyListener(this);
    }
    public void keyTyped(KeyEvent KB){}
    
    public void keyReleased(KeyEvent KB){
        showStatus("Key is released !!!");
    }
    
    public void keyPressed(KeyEvent KB){
        showStatus("Key is pressed !!!");
    }


    public void paint(Graphics g){
        g.setFont(new Font("Ariel", Font.BOLD, 20));
        g.setColor(Color.MAGENTA);
        g.drawString("This applet senses up/down motion ", 20, 120);
    }

    

}
