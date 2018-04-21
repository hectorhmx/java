import java.util.ArrayList;
import java.util.Scanner;

public class Calculos{
private double importe;
Scanner teclado = new Scanner(System.in);


/**Saca el valor total sumando todas las posiciones del ArrayList y regresa el importe, siendo el importe una variable global para los métodos */
public double total(ArrayList a){
  importe = 0;
  for(int i=0;i<a.size();i++){
    importe+=(double)a.get(i);
  }
  return importe;
}
public void dejar(ArrayList productos,ArrayList costos){
  /** Mientrass que el importe no sea menor o igual que 500, se eliminan elementos de los productos
  Entonces, se habrán dejado los elementos necesarios, no retorna valor alguno*/
    while(importe>500){
      System.out.println("Costo("+importe+") por encima del maximo. Tendrá que dejar productos");
      System.out.print("[");
      for(int i=0;i<productos.size();i++){
        System.out.print((i+1)+" ,");
      }
      System.out.println("]");
      System.out.println(productos);
      System.out.println("¿Que elemento desea dejar elija el indice?");
      productos.remove(productos.get(teclado.nextInt()));
      costos.remove(costos.get(teclado.nextInt()));
      importe = total(costos);
    }
}
}
