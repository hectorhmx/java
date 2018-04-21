public class VehiculoAcuatico extends Vehiculo{ // extends significa que esta clase es hija de Vehículo
  //String nombreAcuatico;
  public VehiculoAcuatico(String nombre){
    super(nombre); //super hace referencia a la clase padre, en este modo, hace referencia al constructor de la clase padre
  }
  public void navegar(){
    System.out.println(super.transportar()+"acuatico");
  }

}
