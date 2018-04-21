class Resta{
private int ren;
Resta(int ren){
  this.ren = ren;
}
/**Resta de matrices, regresa el resultado de una resta de matrices*/
public int[][] less(int a [][],int b [][]){ //ya se que no significa restar.
  int[][] c= new int[ren][ren];
  for(int i=0;i<ren;i++){
    for(int j=0;j<ren;j++){
      c[i][j]=a[i][j]-b[i][j];
    }
  }
  return c;
}
}
