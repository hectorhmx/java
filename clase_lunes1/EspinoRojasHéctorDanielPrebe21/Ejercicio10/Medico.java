public class Medico extends Trabajador{

Medico(String nombre,int edad,String rfc){
  super(nombre,edad,rfc);
}
public void trabajar(){
  System.out.println("Estoy salvando gente we, Paracetamol we");
  cansancio++;
  if(cansancio == 3){
    dormir();
  }
}
}
