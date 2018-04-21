class Foreach{
public static void main(String[] args) {
  int[]x = {1,2,3,4,5};
  int total = 0;
  // for mejorado(Foreach)
  for(int i : x){
    total+=i;
  }
  System.out.println("El total de la suma del arreglo es: "+total);

}
}
