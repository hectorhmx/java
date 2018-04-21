public class MaZo{
  public static void main(String[] args) {
      Zoologico z = new Zoologico();
      z.agregarAnimal(new Jirafa());
      z.agregarAnimal(new Leon());
      for(int i=0;i<z.numero;i++)
      {
        Animal a = z.animales[i];
        a.alimentar(new Carne());
        a.alimentar(new Manzana());

        if(a instanceof Leon){ // ver que el objeto a es de tipo leon
          Leon l = (Leon) a;
        /*downcasting a partir de animal a leon.
        // para upcasting sería Animal obj = new Leon();  // como pasas de un general a uno particular, np requieres parentesis
        //para downcasting Leon obj=(Leon) new Animal(;*/
        l.rugir();
        }
      }
  }
}
