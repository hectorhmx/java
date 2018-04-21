import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Lienzo extends JComponent implements Runnable{
  Map<String,Point> palabras;
  List<String> lista = new ArrayList<String>();
  String palabraUsuario;
  int score;

  public Lienzo(){
    setPreferredSize(new Dimension(800,600));
    palabras = HashMap<String,Point>();
    palabraUsuario = "";
    setFocusable(true);//el componente podrá estar en primer plano
    requestFocus(); //coloca el componente en primer plano
  }


}
