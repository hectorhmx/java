class Prebe extends Alumno{
Prebe(String nombre,int edad,int materias){
  super(nombre,edad,materias);
}
public void tarea(){
  System.out.println("Hace tarea.... Muere en tarea");
}
public void dormir(){
  System.out.println("HAH iluso, los prebes no duermen");
}
}
