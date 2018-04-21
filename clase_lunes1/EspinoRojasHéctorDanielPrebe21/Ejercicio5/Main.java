import java.util.ArrayList;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Bienvenido a la prebemart");
    boolean salir = false;
    int opcion;
    /**Se crean dos array list, uno con los productos y otro con los precios, se instancia una calculadora
    y se instancia la classe Fill, con la que se llenarán los array List. Se crea un menú*/
    ArrayList<String> productos = new ArrayList<String>();
    ArrayList<Double> precios = new ArrayList<Double>();
    Calculos calculadora = new Calculos();
    Fill gas = new Fill();
    while(!salir){
      System.out.println("Desea:");
      System.out.println("1)Agregar un nuevo producto");
      System.out.println("2)Pagar");
      opcion = teclado.nextInt();
      switch(opcion){
        case 1:productos = gas.llenarob(productos);
               precios  = gas.llenarpre(precios);
               break;
        case 2:System.out.println(productos);
               System.out.println(precios);
               /** Si se elige la opción pagar, se mostraran los precios y los productos, se dará el total,
               Si el total es mayor a 500, s llama la función dejar, la cual se terminará cuando el monto sea el correcto
                De otra forma dirá gracias por su compra y saldrá*/
               System.out.println("El total es:"+calculadora.total(precios));
               if(calculadora.total(precios)>500){
                 calculadora.dejar(productos,precios);
               }
                System.out.println("Gracias por su compra");
                salir = true;
                break;
       default: System.out.println("opción invalida");
                break;

      }
    }
  }
}
