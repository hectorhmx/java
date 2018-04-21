// ya que importaremos BigDecimal, el archivo y nuestras clases no pueden tener el mismo nombre.

public class BigDecimalEjemplo{
  double unCentavo=0.01;



  public void saludar(){
    System.out.println("Hola mundo orientado a objetos.");
  }



  public void darEjemploChafa(){
    double suma=unCentavo+unCentavo+unCentavo+unCentavo+unCentavo+unCentavo;
    System.out.println(suma);
    // va arrastrando datos.
  }

  public void darEjemploChido(){

    //BigDecimal es la que hay que usar para moneda
    // decimos dodne esta porque no lo he importado}
    // hay que mandarle el tamaño en comillas para que sea preciso
    java.math.BigDecimal otroCentavo = new java.math.BigDecimal("0.1");
    //.add(otroCentavo es equivalente a sumarle otro centavo, se puede anidar)
    java.math.BigDecimal suma = otroCentavo.add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo);
    System.out.println(suma);
  }

  public static void main(String... hola){
    BigDecimalEjemplo b = new BigDecimalEjemplo();
    b.saludar();
    b.darEjemploChafa();
    b.darEjemploChido();
  }




}
