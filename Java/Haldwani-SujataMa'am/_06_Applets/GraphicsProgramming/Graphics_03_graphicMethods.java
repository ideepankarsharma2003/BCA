// <html>
// <body>
// <applet code=Graphics_03_graphicMethods.class
//         height=300
//         width=500>
// </applet>
// </body>
// </html>


// java book, Page No: 292-293
// Program 15.1: Using methods of Graphics Class
import java.applet.*;
import java.awt.*;

public class Graphics_03_graphicMethods extends Applet{
    String s= new String();
    String s1= new String();
    String s2= new String();
    Font f1= new Font("Courier New", Font.BOLD, 17);
    public void paint(Graphics g){
        g.setFont(f1);
        g.setColor(Color.BLUE);
        g.drawString("Illustration of methods of Graphic Class", 200, 520);

        Font f2= g.getFont();
        s= f2.toString();
        g.drawString(s, 5, 540);

        g.setColor(Color.green);
        Color col= g.getColor();
        s2= col.toString();
        g.drawString(s2, 5, 560);

        // void java.awt.Graphics.fillRect(int x, int y, int width, int height)
        g.fillRect(500, 15, 70, 90);
        // void java.awt.Graphics.drawRect(int x, int y, int width, int height)
        g.drawRect(160, 5, 70, 70);

        // void java.awt.Graphics.drawOval(int x, int y, int width, int height)
        // circle or ellipse that fits within the rectangle specified by the x, y
        g.drawOval(500, 15, 70, 90);

        g.setColor(Color.yellow);
        // void java.awt.Graphics.fillOval(int x, int y, int width, int height)
        g.fillOval(700, 140, 70, 90);

        g.setColor(Color.black);
        // void java.awt.Graphics.drawLine(int x1, int y1, int x2, int y2)
        // (x1, y1) and (x2, y2)
        g.drawLine(380, 100, 200, 180);

        // void java.awt.Graphics.drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        // circular or elliptical arc covering the specified rectangle.
        g.drawArc(400, 150, 180, 280, 90, 70);

        int x2[]= {200, 120, 280, 240};
        int y2[]= {260, 370, 370, 270};
        int z2= 4;
        g.setColor(Color.MAGENTA);
        // void java.awt.Graphics.fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
        // Fills a closed polygon defined by arrays of x and y coordinates.
        g.fillPolygon(x2, y2, z2);

        g.setColor(Color.RED);
        g.drawRect(15, 15, 30, 50);
        FontMetrics f3= g.getFontMetrics();
        s1=f3.toString();
        g.drawString(s1, 5, 580);


        g.setColor(Color.gray);
        // void java.awt.Graphics.fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        // Fills the specified rounded corner rectangle with the current color. The left and right edges of the rectangle are at x and x + width - 1, respectively. The top and bottom edges of the rectangle are at y and y + height - 1.
        g.fillRoundRect(510, 400, 90, 80, 20, 20);

    }
}
