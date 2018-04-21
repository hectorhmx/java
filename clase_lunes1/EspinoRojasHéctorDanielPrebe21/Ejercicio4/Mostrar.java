public class Mostrar{
private int ren;

Mostrar(int ren){
  this.ren=ren;
}
/**Recibe tres arreglos (sindo el tercero el que tiene los resultados)
imprime matriz por matriz*/
public void show(int a [][],int b [][],int c [][]){
  System.out.println("Matriz A");
  for(int i=0;i<ren;i++){
    for(int j=0;j<ren;j++){
      System.out.print(a[i][j]+"    ");
    }
    System.out.println("");
  }
  System.out.println("Matriz B");
  for(int i=0;i<ren;i++){
    for(int j=0;j<ren;j++){
      System.out.print(b[i][j]+"    ");
    }
    System.out.println("");
  }
  System.out.println("Matriz C");
  for(int i=0;i<ren;i++){
    for(int j=0;j<ren;j++){
      System.out.print(c[i][j]+"    ");
    }
    System.out.println("");
  }
}

}
