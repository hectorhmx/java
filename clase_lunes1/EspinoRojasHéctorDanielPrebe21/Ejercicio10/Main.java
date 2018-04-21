import java.util.ArrayList;
import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    /**En este ejemplo se comprueba la abstracción debido a que se crean plantillas con métodos y atributos generales
    Ejemplo de esto es la clase trabajador, ya que se sabe que cada trabajador tendrá nombre,rfc y edad;
    String nombre;

    Scanner teclado = new Scanner(System.in);
    /**Creamos un arreglo de trabajadores, asignamos tres trabajadores(cada uno siento una instancia de una clase hija de trabajadores)
    Donde se comprueba la herencia, la cual también se comprueba al no haber declarado los atributos y metodos heredados de la clase padre.Y al llamar al constructor de la misma.
    Dentro de estas clases mediante métodos get, set y restricciones de acceso
    a los métodos y atributos se logra el polimorfimo*/
    Trabajador[] trabajadores = new Trabajador[3];

    trabajadores[0] = new Civil("Francisco",23,"GHUOIP13HIP");
    trabajadores[1] = new Programador("Rodrigo",22,"HPJIOBH3234");
    System.out.println("Ingrese el nombre del medico");
    trabajadores[2] =new Medico(teclado.next(),15,"HOPIHIHOB23");
    /**En este ciclo se comprueba el polimorfismo, ya que objetos similares reaccionan de formas distintas a un
    mismo estímulo.*/
    for (int j = 0;j<3 ;j++ ) {
      for(Trabajador i:trabajadores){
          System.out.println("");
          System.out.println(i.nombre);
          i.trabajar();
        }
    }
    }
  }
