import java.applet.*;  
import java.awt.*;  
public class first extends Applet{  
  
public void paint(Graphics g){
int age; 
int num=Integer.parseInt(getParameter("age"));
if(num>18)
g.drawString("eligible to vote",150,150);
else
g.drawString("not eligible to vote",150,150);
}
}  