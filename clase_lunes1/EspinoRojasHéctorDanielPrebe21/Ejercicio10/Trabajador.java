/**Es una clase abstracta ya que necesito la fima de cierto método,
pero también necesito los atributos y algunos métodos que no sean abstractos*/
public abstract class Trabajador{
/**Protected porque solo quieroque objetos del mismo paquete puedan acceder a dichos datos*/
protected String nombre;
protected int edad;
protected String rfc;
protected int cansancio=0;
Trabajador(String nombre,int edad, String rfc){
this.nombre=nombre;
setEdad(edad);
this.rfc = rfc;
}
/**Abstracto ya que será implementado por las hijas*/
public abstract void trabajar();
/**Comprueba que los datos ingresados son los deseados*/
protected void setEdad(int edad){
  while (true)
  {
      if (edad<=0){
          System.out.println("Eso es imposible compa");
      }
    else if(edad<20 || edad>0){
      System.out.println("Maldita sea Gump, eres un genio");
      this.edad = edad;
      break;
    }
    else{
      this.edad = edad;
      break;
    }
  }
}

public void dormir(){
System.out.println("Zzzzzzz");
}
}
