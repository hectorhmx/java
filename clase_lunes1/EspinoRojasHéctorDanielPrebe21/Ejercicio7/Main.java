public class Main{
  public static void main(String[] args) {
    /** Se declara un alumno, un prebe y un nini,
    siendo Alumno la clase padre de prebe y nini
    */
    Alumno al = new Alumno("Jimmy",19,6);
    Prebe pr = new Prebe("Hector",20,5);
    Nini ni = new Nini("Jaime",19,0);
    /**Se crea un arreglo de alumnos, los cuales
    almacenaran los objetos anteriormente creados(bueno, tendrán los mismos valores)*/
    Alumno[] alumnos = new Alumno[3];
    alumnos[0]=al;
    alumnos[1]=pr;
    alumnos[2]=ni;
    for(int i=0;i<3;i++){
      /**Esto me ayuda a imprimir que clase hace que, ya que me interesa saber que tipo de alumno es, más que el nombre*/
      System.out.println(alumnos[i].getClass().getSimpleName());
      /**Dia normal enla vida de alumnos (hacer tarea)*/
      dia(alumnos[i]);
      System.out.println("");
    }
  }
  /**Mediante la interfaz implementada, permite que objetos distintos sean tratados
  por su método tarea*/
  public static void dia(Inter i){
    i.tarea();
    i.tarea();
    i.tarea();
    i.dormir();
  }
}
