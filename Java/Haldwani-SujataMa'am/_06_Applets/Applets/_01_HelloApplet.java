import java.applet.Applet;
import java.awt.Graphics;

public class _01_HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 25);
    }
}
/*
<applet code="_01_HelloApplet.class" height=300 width=200>
</applet>
*/

