class Suma{
private int ren;
/**Determina el orden*/
Suma(int ren){
  this.ren = ren;
}
/**Suma de los dos arreglos, retorna un arreglo*/
public int[][] add(int a [][],int b [][]){
  int[][] c= new int[ren][ren];
  for(int i=0;i<ren;i++){
    for(int j=0;j<ren;j++){
      c[i][j]=a[i][j]+b[i][j];
    }
  }
  return c;
}
}
