class Circulo{
  /**No quiero que sea modificado*/
  final double radius;
/**Constructor que revisa que se agrega un valor válido*/
  Circulo(double radius){
    if(radius<=0)
    System.out.println("Valor erroneo");
    else{
      this.radius = radius;
    }
  }
  /**Cálculo de perimetro y de area*/
  public double calPer(){
    return (2*radius*Math.PI);
  }
  public double calAr(){
    return (Math.PI*Math.pow(radius,2));
  }
}
