import java.applet.Applet;
import java.awt.*;
public class Graphics_02_drawRectangle  extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        // void java.awt.Graphics.drawRect(int x, int y, int width, int height)
        g.drawRect(5, 5, 10, 20);
        
        g.setColor(Color.RED);
        // void java.awt.Graphics.fillRect(int x, int y, int width, int height)
        g.fillRect(50, 50, 5, 7);
        
        g.setColor(Color.YELLOW);
        // void java.awt.Graphics.fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        g.fillRoundRect(400, 400, 120, 120, 7, 7);
    }
}

/*
 * <applet code="Graphics_02_drawRectangle.class"
 * height=400
 * width=500></applet>
 */
