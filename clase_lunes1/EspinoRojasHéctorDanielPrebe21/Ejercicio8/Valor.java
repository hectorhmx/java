import java.util.Scanner;
import java.math.BigDecimal;
class Valor{
  /*Si el valor es BigDecimal, evitamos el error de números muy grandes*/
private  BigDecimal val = new BigDecimal(0);

Scanner teclado = new Scanner(System.in);
/**Se obtiene un valor,y se recibe si es el primer o segundo operando
Se Retorna un BigDecimal, el cual mediante un bloque try y catch evita que se agregen valores
que puedan generar error (Strings)*/
  public BigDecimal obtener(int num){
    val = new BigDecimal("0");
    while(true){
      try{
          System.out.println("Ingrese el valor numero "+num);
          val = teclado.nextBigDecimal();
      }catch(java.util.InputMismatchException ex){
        System.out.println("Valor incertado no corresponde a un número");
        teclado.next(); /**Borra el buffer*/
        continue;
      }
      break;/**Si llega a este paso, es porque no tiene InputMismatchException, por lo que debe salir*/
    }
    return val;
  }
}
