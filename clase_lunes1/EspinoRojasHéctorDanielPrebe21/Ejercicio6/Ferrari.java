class Ferrari extends Carro{
  private String modelo;
  /**Recibe peso, altura y modelo que tendrá el carro*/
    Ferrari(double peso,double altura,String modelo){
      super(peso,altura);
      this.modelo=modelo;
    }
    @Override
    /**Devuelve un string con los valores de los atributos del objeto*/
    public String toString(){
      return String.format("El peso es: %f\nLa altura es: %f\nEl modelo es: %s",peso,altura,modelo);
    }
    public void chocar(){
      System.out.println("Ah no ma, choqué  -100000 de oro");
    }
}
