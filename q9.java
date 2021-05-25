    import java.applet.Applet;
    import java.awt.*;
     
    public class q9 extends Applet {
     
     public void paint(Graphics g) {
      
      g.setColor(Color.yellow);
      g.fillOval(20,20,150,150);   // For face
      g.setColor(Color.black);
      g.fillOval(50,60,15,25);     // Left Eye 
      g.fillOval(120,60,15,25);    // Right Eye
      int x[] = {95,85,106,95};
      int y[] = {85,104,104,85};

      g.drawArc(55,95,78,50,0,-180);  // Smile

     }
    }
     
    