import java.applet.*;
import java.awt.*;

public class Graphics_01_drawLine  extends Applet{
    public void paint(Graphics g){
        // void java.awt.Graphics.drawLine(int x1, int y1, int x2, int y2)
        // (x1, y1) and (x2, y2)
        g.drawLine(10, 10, 50, 50);
    }
}

/*
 * <applet code="Graphics_01_drawLine.class" height=300 width=200>
 * </applet>
 */
