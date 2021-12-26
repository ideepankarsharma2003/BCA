/*<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <applet code="AppletParameter.class" width="500" height="500"> 
    
        <param name="msg" value=" Applet via Parameter "> 
    
    </applet> 
</body>
</html>*/

import java.applet.Applet;
import java.awt.*;

public class AppletParameter extends Applet{
    public void paint(Graphics g){
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.setColor(Color.red);
        g.drawString("Hello World in Applets", 100, 100);
        // applet param tag
        g.setColor(Color.orange);
        g.drawString(getParameter("msg"), 200, 200);

        g.setColor(Color.BLACK);
        g.drawOval(300, 300, 100, 100);
        g.fillOval(330, 330, 10, 10);
        g.fillOval(370, 330, 10, 10);
        g.drawArc(310, 350, 80, 30, 180, 180);
    }
    
}
