import java.util.ArrayList;
public class ColeccionArrayList{
  public static void main(String[] args) {
//<Tipo de dato>
    ArrayList<String> elementos = new ArrayList<String>();
      elementos.add("rojo"); //agrega un elemento al ArrayList
      elementos.add(0,"azul"); // agreaga elemento en cierta posición.

      for (int i=0;i<elementos.size();i++) { //obtiene el tamaño del ArrayList
          System.out.println(elementos.get(i)); //obtiene un elemento en cierta posición
      }

      System.out.println("======================================================================================");

      elementos.remove("rojo"); //elminina el rojo. Si borraramos azul y no rojo, rojo volvería a la posición 0
      for (int i=0;i<elementos.size();i++) { //obtiene el tamaño del ArrayList
          System.out.println(elementos.get(i)); //obtiene un elemento en cierta posición
      }
      System.out.println("======================================================================================");
      //parse es un cast de un objeto a un tipo de dato.


}
}
