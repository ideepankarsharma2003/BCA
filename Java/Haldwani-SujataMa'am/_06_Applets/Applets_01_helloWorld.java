// <applet code=Applets_01_helloWorld.class
//                     height=700
//                     width=500
//                     allign=CENTER>
                    
//             </applet>


import java.applet.*;
import java.awt.*;
public class Applets_01_helloWorld extends Applet {
    Font f= new Font("Ariel", Font.BOLD, 48);
    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(Color.MAGENTA);
        g.drawString("Hello World", 150, 150);
    }
}
