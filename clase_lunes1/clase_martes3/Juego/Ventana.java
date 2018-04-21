import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

  public Ventana(){
    super("Figuras");

    Lienzo lienzo = new Lienzo();
    this.add(lienzo);
    setSize(350,250);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ventana();
  }
}
