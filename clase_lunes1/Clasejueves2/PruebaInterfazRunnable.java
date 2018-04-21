public class PruebaInterfazRunnable implements Runnable{
    public void run throws Exception(){
      for (int i =0;i<5;i++)
      {
          System.out.println("Iteracion "+(i+1)+"de "+Thread.currentThread().getName()); //obtiene el nombre del thread que esta siendo usado es
      saludar();}

      System.out.println(Thread.currentThread().getName()+" TERMINO");
    }

    public void saludar(){ //el hilo puede usarlo aquí, o usarlo en el run()
      System.out.println("Hola");
    }


    public static void main(String[] args) {
      //new Thread(new PruebaInterfazRunnable(),"Hector").start(); OTRA FORMA DE HACERLO
      PruebaInterfazRunnable Hector = new PruebaInterfazRunnable(); // ES PARA NO HACER OTRA CLASE
      Thread t = new Thread(Hector,"Hector"); // hace que el objeto se convierta en un hilo. todo lo que quiero que haga el hilo, lo puedo usar, pero es buena practica llamarlo en el run.
      t.start();

      PruebaInterfazRunnable Daniel = new PruebaInterfazRunnable(); // ES PARA NO HACER OTRA CLASE
      Thread t1 = new Thread(Daniel,"Daniel"); // hace que el objeto se convierta en un hilo. todo lo que quiero que haga el hilo, lo puedo usar, pero es buena practica llamarlo en el run.
      t1.start();
    }
}
