public class CuentaHabiente extends Thread{ //thread ya tiene muchoss métodos implementados
  private Cuenta cuenta;
  private int retiro;

  public CuentaHabiente(String name,Cuenta cuenta,int retiro){
    super(name);
    this.cuenta=cuenta;
    this.retiro=retiro;
  }

@Override
  public void run(){
      while(cuenta.getSaldo()>retiro){
        try{
          cuenta.retirar(retiro);
          System.out.printf("%s retira %d pesos y quedan %d\n",getName(),this.retiro,cuenta.getSaldo());
        }catch (InterruptedException e){

        }
      }
  }
}
