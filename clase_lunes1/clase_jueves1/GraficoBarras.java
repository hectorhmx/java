/*
Rango de califs
00-09
10-19
20-29

90-99
*/

public class GraficoBarras{

  public static void main(String[] args) {
    int[] arreglo = {20,5,7,9,4,5,21,15,3,15,10};
    System.out.println("Distribución");


    //para cada elemento del arreglo imprimir una barra del gráfico
    for (int contador=0;contador<arreglo.length;contador++ ) {
      if(contador == 10)
        System.out.printf("%5d",100);
      else
        System.out.printf("%02d-%02d:",contador*10,contador*10+9);

      //imprimir los asteriscos
      for (int asterisco=0;asterisco<arreglo[contador];asterisco++) {
        System.out.printf("*");
      }
      System.out.println("");
    }




  }
}
