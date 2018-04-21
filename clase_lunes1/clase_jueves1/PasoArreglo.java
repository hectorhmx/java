public class PasoArreglo{
  public static void main(String[] args) {
    int[] arreglo = {1,2,3,4,5};

    System.out.println("Efecto de pasar una refernecia de un arreglo.");
    for(int i=0;i<arreglo.length;i++)
      System.out.println("arreglo["+i+"]: "+arreglo[i]);


  }
  //aquí estamos haciendo paso por referencia
  public static void modificarArreglo(int[] x){
    int aux=0;
    for (int i=0;i<(x.length)/2 ; i++) {
      aux=x[i] ;
      x[i] = x[x.length-1-i];
      x[x.length-1-i] = aux;
    }
    for (int i=0;i<(x.length)/2 ; i++) {
      System.out.println("Los valores del arreglo modificado["+i+"] son:"+x[i]);
    }

  }
}
