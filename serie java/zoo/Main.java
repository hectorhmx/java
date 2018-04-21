import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hervivoro[2] herv = new Hervivoro();
    Carnivoro[2] carn = new Carnivoro();
    herv[0]=new Zebra("pasto");
    herv[1]=new Mono("bananas");
    carn[0]=new Leon("Zebra");
    carn[1]=new Tigre("Mono");

    
  }
}
