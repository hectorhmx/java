public class Perro{
  //public String nombre;
  //public int edad;

  private String nombre;
  private int edad;
  /* constructor por defecto


  */
  //constructor
  Perro()
  {

  }
  Perro(String nombre, int edad )
  {
    this.nombre=nombre;
    this.edad=edad;
    traer();
  }

  //geters y setters
  public void setNombre(String n){
    nombre = n;
  }
  public String getNombre(){
    return nombre;
  }
  public void setEdad(int e)
  {
    if(e > 0)
    {
      edad = e;
    }
  }



  public void traer(){
    System.out.println("Ahh perro traes el ocnitrix");
  }
  public void ladrar(int x){
    for(int i =0;i<x;i++)
    {
      System.out.println("wof wof");
    }
}
  public String omnitrix()
  {
    return "Si lo trae";
  }
  //sobrecarga de operadores 2
  public void traer(int edad){
    System.out.println("x");
  }
}
