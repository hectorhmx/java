import java.util.Random;
public class Tiros{
static private int  numerodad;
static private int numtir;

 public Tiros(int numerodad,int numtir)
  {
    if(numerodad<=0||numtir<=0){
      System.out.println("Error perro");
    }
    else{
      this.numerodad=numerodad;
      this.numtir=numtir;
    }
  }

public int[] llenar(){
    int[]arr = new int[(numerodad*6)];
    Random aleatorio = new Random();
    /*int aux,a=numerodad*6;
    a-=numerodad;
    for (int j=0;j<numtir;j++){
      aux=aleatorio.nextInt(a)+numerodad;
        arr[aux]+=1;
      }
      */

    int aux=0;
    for(int i=0;i<numtir;i++)
    {
      aux=0;
      for(int j=0;j<numerodad;j++)
      {
        aux=aux+(aleatorio.nextInt(6)+1);
      }
      arr[aux-1]++;
    }
    return arr;
  }

  }
