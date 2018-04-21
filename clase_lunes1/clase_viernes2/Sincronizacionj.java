public class Sincronizacionj{
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta(1000);
    CuentaHabiente persona1 = new CuentaHabiente("Erick",cuenta,100);
    CuentaHabiente persona2 = new CuentaHabiente("Serj",cuenta,50);
    CuentaHabiente persona3 = new CuentaHabiente("Patish",cuenta,200);
    persona1.start();
    persona2.start();
    persona3.start();
  }
}
