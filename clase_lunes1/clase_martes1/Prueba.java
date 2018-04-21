import java.util.Scanner;
public class Prueba{
  //PI será una variable de instancia
  float PI=3.1416F;
  static double PI2=3.15;
  //public modificador de acceso
  //static modificador de estado
public static void main(String... hola)
  {
    System.out.println(new Prueba().PI);
    // new prueba es un objeto desreferenciado.
    System.out.println(PI2);
    //float f = Float.parseFloat(new java.util.Scanner(System.in).next()); // scaner es una clase llamada
    //por java.util.scanner // pero ahorita la hicimos desreferenciada
    //de otra forma sería importarla
    //en la cabecera poner import java.util.Scanner;
    //luego es instanciarlo (cuerpo de la clase)
    Scanner teclado = new Scanner(System.in);
    String salida = teclado.next(); //leyendo de la consola
    float f1 = Float.parseFloat(salida);

    System.out.println("Este es un float: "+f1);
    //parseDouble cambia de el objeto de entrada(String) a un primitivo Double
    // parse esta dentro de la clase grapper.
    double d = Double.parseDouble(new java.util.Scanner(System.in).next());
    //demostrar que luego se atonta el compilador.
    System.out.println("Este es el double:"+d);
  }
}
