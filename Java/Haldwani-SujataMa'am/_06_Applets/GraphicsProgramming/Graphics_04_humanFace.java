// <html>
// <body>
// <applet code= Graphics_04_humanFace
//         height= 400
//         width= 500
//         allign= center>
// </applet>
// </body>
// </html>

import java.applet.*;
import java.awt.*;
// java book, Page No: 297

public class Graphics_04_humanFace extends Applet{
    Font f= new Font("Times New Roman", Font.BOLD, 20);
    public void paint(Graphics g){
        g.setFont(f);        
        g.setColor(Color.black);
        
        g.drawOval(40, 40, 120, 150); // head 
        
        g.drawOval(57, 75, 30, 20); // left eye
        g.drawOval(110, 75, 30, 20); // right eye
        
        g.drawOval(85, 100, 30, 30); // nose
        
        g.fillOval(25, 92, 15, 30); // left ear
        g.fillOval(160, 92, 15, 30); // right ear

        g.setColor(Color.blue);
        g.fillOval(68, 81, 10, 10); // left pupil
        g.fillOval(121, 81, 10, 10); // right pupil
        
        g.setColor(Color.RED);
        g.fillArc(60, 125, 80, 40, 180, 180); // mouth

        g.drawString("Human Face", 200, 200);

    }
    
}
