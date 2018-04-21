/** Este programa crea una clase llamada pruebaAuto, la cual permite crear autos y modificar sus atributos mediante getters y setters
@author Hector Espino


*/
class PruebaAuto{
  public static void main(String[] args) {
    Auto coche2 = new Auto();
    Auto coche3 = new Auto("negro",2);
    Auto carro = new Auto("gris",2);

    coche3.acelerar(30);

    carro.acelerar(150);
    carro.acelerar(151);
    carro.meterpasaje();
    carro.meterpasaje();

    carro.getColor();
    coche2.getColor();
    carro.getVel();
    carro.getPasaje();
  }

}
