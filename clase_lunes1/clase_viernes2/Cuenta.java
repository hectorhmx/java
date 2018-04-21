public class Cuenta{
  private int saldo;
  public Cuenta(int saldo){
    this.saldo = saldo;
  }

  public synchronized void retirar(int cantidad) throws InterruptedException{
    if(saldo>= cantidad){
      Thread.sleep(new java.util.Random().nextInt(500)+1000); //que se genere una
      saldo -=cantidad;
    }
  }

  public int getSaldo(){
    return saldo;
  }
}
