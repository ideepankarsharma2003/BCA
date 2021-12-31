import java.applet.Applet;
import java.awt.*;

/**
 * _01_AppletsIntro
 */
public class _01_AppletsIntro extends Applet {
    String str;
    public void init(){
        str= getParameter("string");
        if(str==null){
            str="World";
        }
        str="Hello "+ str;
    }


    public void paint(Graphics g){
        g.drawString(str, 100, 100);
    }
    
}
/*
 * <applet code="_01_AppletsIntro.class" height=200 width=400>
 * </applet>
 */
