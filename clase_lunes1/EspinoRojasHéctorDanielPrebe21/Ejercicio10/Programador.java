public class Programador extends Trabajador{

Programador(String nombre,int edad,String rfc){
  super(nombre,edad,rfc);
}
public void trabajar(){
  System.out.println("Estoy programando we, Hola mundo we");
  cansancio++;
  if(cansancio == 3){
    dormir();
  }
}
}
