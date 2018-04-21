import java.util.Scanner;
public class Dados{
public static void main(String[] args) {
  int dad;
  int tiros;

  Scanner teclado = new Scanner(System.in);
  System.out.println("Numero de dados:");
  dad = teclado.nextInt();
  System.out.println("Numero de tiros:");
  tiros = teclado.nextInt();


  int[]arr = new int[(dad*6)];
  Tiros tirito = new Tiros(dad,tiros);
  arr=tirito.llenar();
  System.out.println("=============================================================");
  for (int contador=0;contador<arr.length;contador++ ) {
      System.out.printf("%d:",contador+1);
      for (int asterisco=0;asterisco<arr[contador];asterisco++)
          System.out.printf("*");
        System.out.println("");
    }
    System.out.println("====================================================");
}
}
