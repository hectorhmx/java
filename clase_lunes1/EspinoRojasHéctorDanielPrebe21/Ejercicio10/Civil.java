public class Civil extends Trabajador{

Civil(String nombre,int edad,String rfc){
  super(nombre,edad,rfc);
}
public void trabajar(){
  System.out.println("Estoy creando edificios we, Cemento we");
  cansancio++;
  if(cansancio == 3){
    dormir();
  }
}
}
