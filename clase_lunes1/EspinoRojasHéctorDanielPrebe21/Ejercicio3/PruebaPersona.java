import java.util.Scanner;
public class PruebaPersona{

  public static void main(String[] args) {
    /**Se instancia una persona, y se llenan los atributos de esta*/
    /**Se devuelven los datos de la persona*/
  Persona personita = new Persona();
  Scanner teclado = new Scanner(System.in);
  System.out.println("Ingrese el nombre de la persona");
  personita.nombre = teclado.next();
  System.out.println("Ingrese la edad de la persona");
  personita.edad = Integer.parseInt(teclado.next());
  System.out.println("Ingrese la estatura de la persona");
  Double i = Double.parseDouble(teclado.next());
  personita.estatura = i;
  System.out.println("Ingrese el peso de la persona");
  personita.peso=Double.parseDouble(teclado.next());

  for(int a=0;a<5;a++)
  {
    System.out.println("");
  }
  System.out.println("Nombre de la persona: "+personita.nombre);
  System.out.println("Edad: "+personita.edad);
  System.out.println("Estatura: "+personita.estatura+"(m)");
  System.out.println("Peso: "+personita.peso+"(kg)");
  }
  }
