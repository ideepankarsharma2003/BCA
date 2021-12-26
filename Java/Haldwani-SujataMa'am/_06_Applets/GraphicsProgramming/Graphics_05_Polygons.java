import java.applet.*;
import java.awt.*;

// <html>
// <body>
// <applet code=Graphics_05_Polygons.class
//         height= 400
//         width= 500>
// </html>
// </body>
// </applet>




public class Graphics_05_Polygons extends Applet{
    int x1[]=  {20, 120, 220, 20};
    int y1[]= {20, 120, 20, 20};
    int n1=4;
    int x2[]= {120, 220, 220, 120};
    int y2[]= {120, 20, 220, 120};
    int n2=4;

    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.drawPolygon(x1, y1, n1);
        g.fillPolygon(x2, y2, n2);
    }
}
