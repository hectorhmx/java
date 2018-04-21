public class Hilo extends Thread{
  public static void main(String[] args) {
    Hilo h = new Hilo("Daniel");
    Hilo h1 = new Hilo("Martin");
    h.start();
    h1.start();

}//Thread esta definido en lang
public Hilo(String nombre){
super(nombre);
}
public void run(){ //sobre escritura del run
  for (int i=0;i<5;i++) {
    System.out.println("Iteracion "+(i+1)+" El nombre del hilo: "+getName());
    try{
    sleep(5000); //es estatico, la excepcion que tira es Interrupted Exception
  }catch(Exception e){
  }
  System.out.println("Termino el hilo: "+getName());
}
}
