class Bmw extends Carro{
private String modelo;
/** Se llama al constructor de la clase padre y se asigna a la variable local modelo un String*/
  Bmw(double peso,double altura,String modelo){
    super(peso,altura);
    this.modelo=modelo;
  }
  
  public String toString(){
    return String.format("El peso es: %f\nLa altura es: %f\nEl modelo es: %s",peso,altura,modelo);
  }

}
