import java.util.Scanner;
public class Llenar{
  private int ren;
  /**Orden de la matriz, que es privado porque no quiero que ninguna clase pueda modificarlo
  directamente */
  Llenar(int ren){
    this.ren = ren;
  }
  /**Se llena el arreglo asignandole valores en las posiciones, primero llenando
  las columnas de cada renglón. Retorna el arreglo*/
  public int[][] fill(String nombre){
      Scanner teclado = new Scanner(System.in);
      int[][]a = new int[ren][ren];
      for(int i=0;i<ren;i++){
        for (int j=0;j<ren;j++){
            System.out.println("Dame el valor de la matriz "+nombre+" la posición ["+i+"]["+j+"]");
            a[i][j] = teclado.nextInt();
        }
      }
      return a;
  }

}
