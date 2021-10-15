import java.applet.Applet; 
import java.awt.Color; 
import java.awt.Graphics; 
public class CircleApplet extends Applet  

{    
    public void paint(Graphics g) 

   { 
    
     // First circle filled with RED color 

       g.setColor(Color.RED); 

       g.fillOval(50, 50, 50, 50); 

   

    // Second circle filled with GREEN color 

      g.setColor(Color.GREEN); 

      g.fillOval(50, 100, 50, 50); 

    } 

  } 
 

  

/* <applet code="CircleApplet" width=200 height=250> 

   </applet> 

*/ 