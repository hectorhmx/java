import java.util.Scanner;

public class Arreglos{
  public static void main(String[] args) {
    System.out.println("Esta es una prueba para arreglos");
    Scanner teclado = new Scanner(System.in);
    int[] arreglo1 = new int[5];
    int arreglo2[]={1,2,3,4,5,6,7};

    for(int i = 0;i<arreglo1.length;i++){
      System.out.println("Ingresa el elemento "+i+": ");
      arreglo1[i] = teclado.nextInt();

    }
    System.out.println("Verificando el contenido del arreglo...");
    for(int i=0;i<arreglo2.length;i++)
    {
      //System.out.println("El contenido en el indice "+i+" es:"+arreglo1[i]);
      System.out.println("El contenido en el indice "+i+" es:"+arreglo2[i]);
    }


  }
}
