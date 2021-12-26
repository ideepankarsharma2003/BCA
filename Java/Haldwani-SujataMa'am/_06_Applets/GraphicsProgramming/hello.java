import java.applet.Applet;
import java.awt.*;

public class hello extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello", 200, 300);
    }
}

/*
  <APPLET code=hello.class
  height=400
  width=500>
  </APPLET>
 */