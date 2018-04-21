public class Estaticos{
  static int contador=0;
//por buenas prácticas, el main debería estar dentro de otra clase.
//podemos omitir public para el constructor CampoEstatico
  Estaticos()
  {
    contador++;
  }
  public static void main(String[] args) {
      System.out.println(Estaticos.contador);
      new Estaticos();//cada new aumentará el contador, ya que aumentará cada vez que se instancie la clase
      System.out.println(Estaticos.contador);
  }
}
