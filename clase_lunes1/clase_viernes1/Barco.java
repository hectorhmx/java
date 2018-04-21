public class Barco extends VehiculoAcuatico{

  public Barco(String nombre){
  super(nombre);
  }

  public void encenderMotores(){
    System.out.println("Estoy encendiendo los motores");
  }
@Override// Decirle al compilador que voy  a sobrecargar algo.
// @Depecrated  cuando un metodo es obsoleto, En la api ya no es correcto utilizarlo pero aún esta en la api
  public void navegar(String rapidez //no es override, es overflow, Polimorfismo chfa){
    System.out.println("Soy un barco y mi nombre es"+nombre);
  }
  // no puedo cambiarle el tipo de dato de forma heredado. a menos que fuera void  
  // puedes heredar classes como Scanner, o cualquier otra hecha.
}
