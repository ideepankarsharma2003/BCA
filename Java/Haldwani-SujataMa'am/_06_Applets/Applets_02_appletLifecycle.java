// <html>
// <body>
//     <applet code=Applets_02_appletLifecycle
//             height=350
//             width=350>
//     </applet>
// </body>
// </html>

import java.applet.*;
import java.awt.*;


public class Applets_02_appletLifecycle extends Applet{
    public void init() {
        System.out.println("Initializing the Applet !!!");
        showStatus("Initializing the Applet !!!");
        super.init();
    }

    public void start() {
        System.out.println("Applet in Running state !!!");
        showStatus("Applet in Running state !!!");
        super.start();
    }

    public void stop() {
        System.out.println("Applet in Idle state !!!");
        showStatus("Applet in Idle state !!!");
        super.stop();
    }

    public void destroy() {
        System.out.println("Applet in Dead state !!!");
        showStatus("Applet in Dead state !!!");
        super.destroy();
    }

    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        g.setFont(new Font("Times New Roman", Font.ITALIC, 60));
        g.drawString("Hello Detective", 100, 100);
        showStatus("Status Message");
    }
}
