class Mult{
  private int ren;
  Mult(int ren){
    this.ren = ren;
  }
  /**Multiplicación, recibe dos matrices y regresa el resultado de la Multiplicación,
  siguiendo un algoritmo de multiplicación de matrices. */
  public int[][] mp(int a [][],int b [][]){
    int[][] c= new int[ren][ren];
    int aux=0;
    for(int i=0;i<ren;i++){
      for(int j=0;j<ren;j++){
        for (int z=0;z<ren;z++) {
          aux = a[i][z]*b[j][z];
        }
        c[i][j]=aux;
      }
    }
    return c;
  }
}
