public class MainControl{
  public static void main(String[] args) {
    Controlremoto control = new Controlremoto(new Foco(),new Bomba(),new Computadora(),new Foco());
    control.oprimirBoton1();
    control.oprimirBoton2();
    control.oprimirBoton3();
    control.oprimirBoton4();
  }
}
