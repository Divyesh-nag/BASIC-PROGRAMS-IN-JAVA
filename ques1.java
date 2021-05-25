import java.applet.*;
import java.awt.*;

public class ques1 extends Applet{

String msg1,msg2,msg3;
public void init()
{
setForeground(Color.red);
msg1="NAME - DIVYESH NAG";
msg2="ROLL NO - 1929013";
msg3="BRANCH - CSCE";
}
public void paint(Graphics g){
g.drawString(msg1,150,150);
g.drawString(msg2,150,200);
g.drawString(msg3,150,250);
}
}