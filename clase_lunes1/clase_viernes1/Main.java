public class Main{
  public static void main(String[] args) {
    Vehiculo v= new Vehiculo("Carmelita");

    VehiculoAcuatico va = new VehiculoAcuatico("Titanic");

    System.out.println(v.transportar());

    va.navegar();

  }
}
