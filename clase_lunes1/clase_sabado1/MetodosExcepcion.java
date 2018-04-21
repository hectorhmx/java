import java.util.Scanner;
public class MetodosExcepcion{
  public void lanzarExcepcion() throws MiExcepcion{// se usa en el método //avisa al compilador que excepcion va a tirar. van separadas por comas
    Scanner sc = new Scanner(System.in);
    System.out.println("Presiona 1 para lanzar la excepcion");
    int i = sc.nextInt();
    if(i ==1)
      throw new MiExcepcion(); //lanzar la excepcio
    }
}
