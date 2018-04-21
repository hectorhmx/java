class Carnivoro implements Animales{
public String comidafav ="";
Carnivoro(String comidafav){
  this.comidafav=comidafav;
}
Carnivoro(){

}
jugar(Animales ){

}

private void atacar(Hervivoro erv){
  System.out.println("He protec, he atac");
  erv.daño();
}


public void comer(){
  System.out.println(this.getclassName+" esta comiendo: "+comidafav);
}
}
