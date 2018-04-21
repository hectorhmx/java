public class Main{
  public static void main(String[] args) {
  /**Se crea una instancia de carro,se le asigna altura y peso.
  En las instancias de las clases hijas además, se le asgina un modelo, y se llaman sus métodos*/
  Carro c = new Carro(5,3);
  System.out.println("Carro:");
  System.out.println(c);
  System.out.println("");
  Bmw b = new Bmw(5,4,"1");
  System.out.println("BMW:");
  b.estado();
  b.encender();
  System.out.println(b);
  System.out.println("");
  System.out.println("Ferrari:");
  Ferrari f = new Ferrari(1.3,1.70,"250 GTK");
  f.encender();
  f.estado();
  f.apagar();
  f.chocar();
  System.out.println(f);


  }

}
