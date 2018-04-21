public class PruebaPerro{
  public static void main(String[] args) {
    // se instancia
    Perro perrito = new Perro("Firus",15);
    Perro perrron = new Perro();
    perrito.ladrar(5);
  //  String a = perrito.omnitrix()
    //System.out.println(a);
    perrito.setNombre("Firulais");
    System.out.println("El nombre de perro es "+perrito.getNombre());
    System.out.println(perrito.omnitrix());
    perrito.traer(1);
    //
    //new perro(); Desrefenciado, hará todo lo que tiene el constructor y luego se va a perder.
    //Perro perraso  -- es una referencia, no se instancia todavía.


  }
}
