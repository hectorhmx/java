/**
@author Hector Espino
Clase Auto, define los atributos color,velocidad y numero de pasajeros.
Define una serie de setters para modificar estos valores.
Define tres getters para mostrar en consola los datos del objeto.
Tiene dos constructores, uno por default y otro para darle valores iniciales.


*/
public class Auto{
  private  String color;
  private double vel = 0;
  private int pasaje = 0;

  Auto(){ //
    color = "blue";
    vel = 10.5;
    pasaje = 1;
  }
  Auto(String color,int pasaje){
    setColor(color);
    this.pasaje = pasaje;
  }
  /* El método esta en privado porque no quiero que se cambie más de una vez */
  private void setColor(String color){
    this.color = color;
  }
/** Asigna la velocidad, y evita que haya velocidades negativas*/
  public  void acelerar(double vel){
    if (vel<0) //no hay velocidades negativas
    {
      System.out.println("¿Quieres viajar en el tiempo?");
    }
    else if(vel>150) // evitar muertes
    {
      System.out.println("¿Acaso quieres ver a dios?");
    }
    else{
      System.out.println("Run run");
      this.vel = vel; //asignando la velocidad
    }
  }
  public void meterpasaje(){
    if(pasaje+1 > 5)
    {
      System.out.println("Ya no cabe nadie más");
    }
    else{
      pasaje++;
    }

  }
  /** Las siguientes funciones
  muestran en pantalla los valores que tiene nuestro auto*/
  public void getColor(){
    System.out.println("El color del auto es: "+color);
  }
  public void getVel()
  {
    System.out.println("La velocidad del auto es:"+vel);
  }
  public void getPasaje(){
    System.out.println("El número de pasajeros es:" +pasaje);
  }
}
