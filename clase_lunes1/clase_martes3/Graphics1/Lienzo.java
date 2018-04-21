import java.awt.Graphics;
import java.awt.Graphics2D;
import java.swing.JPanel;

public class Lienzo extends JPanel{
  @Override
  public void paintComponent(Graphics2D g){
    super.paintComponent(g); //linea necesaria para pintar en el JPanel

    Graphics2D g2d = new (Graphics2D)g;
    //muestra cadena en coordenadas (10,20)
    g2d.drawString("Hola mundo",10,20);

  }



}
