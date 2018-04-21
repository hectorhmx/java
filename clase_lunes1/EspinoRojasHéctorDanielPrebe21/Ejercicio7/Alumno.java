/**Al ser alumno una clase padre, todas las clases hijas de esta, implementarán Inter también*/
class Alumno implements Inter{
protected String nombre;
protected int edad;
protected int materias;

Alumno(String nombre,int edad,int materias){
  this.nombre=nombre;
  this.edad=edad;
  this.materias=materias;
}
/**Define los métodos generales de los alumnos, los cuales pueden ser sobreescritos en las clases hijas*/
public void tarea(){
    System.out.println("Hago tarea we");
  }
  public void dormir(){
    System.out.println("ZZzzzzz");
  }
}
