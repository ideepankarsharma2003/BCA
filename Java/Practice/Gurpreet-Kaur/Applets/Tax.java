// <html>
// <h1> INCOME TAX CALCULATOR </h>
// <applet code="Tax.class" width=300 height=300>
// <param name="t1" value="Nag">
// <param name="t2" value="150000.50">
// </applet>
// </html>

import java.applet.*;
import java.awt.*;
public class Tax extends Applet
{
	String name,str;
	float sal;
	float tax;
	
	public void init()
	{
		name=getParameter("t1");
		str=getParameter("t2");
		sal=Float.parseFloat(str);
		calculateTax(sal);
	}
	public void calculateTax(float sal)
	{
		if(sal<=100000)
		tax=0.0f;
		else if(sal<=200000)
		tax=sal*0.1f;
		else
		tax=sal*0.2f;
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello "+name,20,100);
		g.drawString("Your Salary: "+sal,20,120);
		g.drawString("Pay the Tax: "+tax,20,140);
	}
}