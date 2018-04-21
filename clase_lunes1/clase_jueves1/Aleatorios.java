import java.util.Random;
public class Aleatorios{
  public static void main(String[] args) {
    int[]x = new int[5];
    int[]y = new int[5];

    Random aleatorio = new Random();

    for(int i=0;i<x.length;i++)
    {
      // rango de 0 a 5;
      x[i]= aleatorio.nextInt(5);
      y[i]= aleatorio.nextInt(6);
    }
    System.out.println("Arreglo 1:");
    for(int i=0;i<y.length;i++)
    {
      System.out.println(x[i]);
    }
    System.out.println("Arreglo 2:");
    for(int i=0;i<y.length;i++)
    {
      System.out.println(y[i]);
    }
  }
}
