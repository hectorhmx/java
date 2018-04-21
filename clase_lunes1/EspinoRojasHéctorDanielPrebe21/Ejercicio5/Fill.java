import java.util.ArrayList;
import java.util.Scanner;
class Fill{
  Scanner teclado = new Scanner(System.in);
  //re llenan primro los productos y luego los precios.
  public ArrayList llenarob(ArrayList<String> objetos){
      for(int i=0;i<objetos.size();i++){
      System.out.println("Ingrese el nombre del producto");
      objetos.add(teclado.next());
      }
      return objetos;
    }

  public ArrayList llenarpre(ArrayList<Double> precios){
    for(int i=0;i<precios.size();i++){
      System.out.println("Ingrese el precio del producto");
      precios.add((Double)teclado.nextDouble());
    }
    return precios;
  }

}
