import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel{

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
//Key_ANTIALIASING  es un método para reducir los pixelados
    RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    rh.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHints(rh);

    g2d.fillRect(30,20,50,50);
    g2d.setColor(Color.BLUE);
    g2d.fillRect(120,20,90,60);
    g2d.setColor(Color.ORANGE);
    g2d.fillRoundRect(250,20,70,50,25,25);
    g2d.setColor(Color.BLUE);
    g2d.fill(new Ellipse2D.Double(10,100,80,100));



  }
}
