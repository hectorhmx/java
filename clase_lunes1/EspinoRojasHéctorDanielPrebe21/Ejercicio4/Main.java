import java.util.Scanner;
class Main{
public static void  main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int ren;
  int opcion;
  System.out.println("Ingrese el orden de la matriz"); /**Orden de la matriz no cambia dentro del programa*/
  ren = teclado.nextInt();
  boolean seguir =true;
  Llenar gas = new Llenar(ren); /**Instancia de llenar, y arreglos que se usaran*/
  int[][] a = new int[ren][ren];
  int[][] b = new int[ren][ren];
  int[][] c = new int[ren][ren];
  Mostrar most = new Mostrar(ren);
  Mult multaman = new Mult(ren);
  Suma superman = new Suma(ren);
  Resta restaman = new Resta(ren);
  /**Menú de opciones
  Se llenan las matrices y luego se realizan las operaciones*/
  while(seguir){
    System.out.println("Bienvenido a la calculadora de Matrices");
    System.out.println("¿Qué opción quiere?");
    System.out.println("1)Suma");
    System.out.println("2)Resta");
    System.out.println("3)Multiplicación");
    System.out.println("Salir");
    opcion = teclado.nextInt();
    switch (opcion)
    {
      case 1: System.out.println("");
              System.out.println("A+B");
              a=gas.fill("A");
              b=gas.fill("B");
              c=superman.add(a,b);
              most.show(a,b,c);
              break;
      case 2:System.out.println("");
              System.out.println("A-B");
              a=gas.fill("A");
              b=gas.fill("B");
              c=restaman.less(a,b);
              most.show(a,b,c);
              break;
    case 3:System.out.println("");
              System.out.println("AXB");
              a=gas.fill("A");
              b=gas.fill("B");
              c=multaman.mp(a,b);
              most.show(a,b,c);
              break;
    case 4:
              seguir = false;
              break;
    default:
              System.out.println("Opción no valida");
    }
}
}
}
