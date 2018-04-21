public class ManejoExcepcion{
public static void main(String[] args) {
  MetodosExcepcion me = new MetodosExcepcion();
  try{
    me.lanzarExcepcion();
  }catch(MiExcepcion mie){
    System.out.println("mie");
    mie.hola();
    mie.getMessage();
  }
}

}
