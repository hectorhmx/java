import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
  public static void main(String[] args) {
    /**Se crean Bigdecimal con los que trabajaremos y el boolean que permitirá
    que continue el menú hasta que se ponga salir*/
    BigDecimal a = new BigDecimal("0");
    BigDecimal b = new BigDecimal("0");
    boolean hola = true;
    int opcion;

    Scanner teclado = new Scanner(System.in);
    Valor val = new Valor();

    while(hola){
      System.out.println("Bienvenido a la calculadora");
      System.out.println("¿Que operación desea realizar?");
      System.out.println("1)Suma");
      System.out.println("2)Resta");
      System.out.println("3)Multiplicación");
      System.out.println("4)Division");
      System.out.println("5)Salir");
      while(true){
        try{
            System.out.println("Ingrese opcion");
            opcion = teclado.nextInt();
        }catch(java.util.InputMismatchException ex){ //evita que los valores de la opción sean muy grandes o no validos
          System.out.println("Valor incertado no es valido");
          teclado.next();
          continue;
        }
        break;
      }
      switch (opcion){
        case 1:a = val.obtener(1);
               b = val.obtener(2);
               a = a.add(b); /**se le suma a a  el valor de b y se imprime el valor de a*/
               System.out.println("Resultado:"+a);
               break;
        case 2:a = val.obtener(1);
               b = val.obtener(2);
               a = a.subtract(b);/**se le resta a a  el valor de b y se imprime el valor de a*/
               System.out.println("Resultado:"+a);
               break;
        case 3:a = val.obtener(1);
               b = val.obtener(2);
               a = a.multiply(b);/**se multiplica a a por el valor de b y se imprime el valor de a*/
               System.out.println("Resultado:"+a);
               break;
        case 4:a = val.obtener(1);
               b = val.obtener(2);
               try{
               a = a.divide(b);/**se divide a a entre el valor de b y se imprime el valor de a*/
               }
               catch(ArithmeticException e){
                 System.out.println("No se puede dividir entre 0"); /**Se impide la división entre 0*/
                 break;
               }
               System.out.println("Resultado:"+a);
               break;
        case 5:
               hola = false;
               System.out.println("bai");
               break;
      }
      a = new BigDecimal("0");
      b = new BigDecimal("0");
      System.out.println("");
    }
  }
}
