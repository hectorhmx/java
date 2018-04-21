import java.util.Scanner;
class Agua{
public static void main(String[] args) {
    int arr[] = new int[10];
    int resultado;
    Scanner teclado = new Scanner(System.in);

    for (i=0;i<10 ;i++ ) {
      System.out.println("Dame el valor en la posición"i+":");
      arr[i]=teclado.nextInt();
    }

    Volumen vol = new Volumen();
    resultado=vol.calcular(arr);
    for(int j=0;j<vol.max;j++)
    {
      for(int i =0;i<arr.lenght;i++)
      {
        if(arr[i]>=1){
          arr[i]--;
          System.out.print("*");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
    System.out.println("El numero de espacios es: "+resultado );
}


}
