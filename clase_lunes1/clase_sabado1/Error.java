import java.util.Scanner;
import java.util.InputMismatchException; // Atrapa
public class Error{
  public static void main(String[] args){
  /*  try{
      int[] numeros = {1,2,3,4};
      System.out.println(""+numeros[8]);
      System.out.println("Todo bien");
      }
    catch(ArrayIndexOutOfBoundsException aioobe){ //atrapa este error
      System.out.println("Te excediste en el rango del arreglo");
    }*/

    Scanner teclado = new Scanner(System.in);
    int x,y;

    System.out.println("Ingresa un numero");

    try{
      x= teclado.nextInt();
    }catch(InputMismatchException ime){
      System.out.println("No se ingreso un numero");
    }finally{
      System.out.println("Siempre se ejecuta");
      x=4;
    }
    String cadena;

    System.out.println("Ingresa un numero para ser el divisor");

    try{
      teclado.nextLine();
      cadena=teclado.nextLine();
      y = Integer.parseInt(cadena);
      System.out.println("El resultado es: "+(x/y));
    }catch(NumberFormatException nfe){
      System.out.println("No se ingreso");
    }catch(ArithmeticException ae){
      System.out.println("No se puede divir entre 0s");
    }


  }

}
