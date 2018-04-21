class Carro{
  protected double peso;
  protected double altura;
  protected boolean encendido = false;
/** Se definen los atributos de la clase Carro y su constructor
Se crean métodos para encender y apagar el coche, al igual que para comprobar su estado, los cuales no tienen retorno*/
/** Se crean los get y set de los atributos de Carro*/
  Carro(double peso,double altura){
    this.peso=peso;
    this.altura=altura;

  }


  public void encender(){
    encendido = true;
    System.out.println("Encendiendo...");
  }

  public void apagar(){
    encendido = false;
    System.out.println("Apagando...");
  }

  public void estado(){
    if(encendido)
      System.out.println("Actualmente encendido");
    else{
      System.out.println("Actualmente apagado");
    }
  }

  public double getpeso(){
    return peso;
  }

  public double getaltura(){
    return altura;
  }

  public String toString(){
    return String.format("El peso es: %f\nLa altura es: %f",peso,altura);
  }
}
