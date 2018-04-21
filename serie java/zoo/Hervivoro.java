class Hervivoro implements Animales{
public String comidafav="";
public int vida=3;
Hervivoro(String comidafav){
  this.comidafav=comidafav;
}
public void jugar(Animales an){
  if(vida==0){
    System.out.println("No puelo, estoy muerto");
    return;
  }
  if(an instanceof(Hervivor)){
    System.out.println(this.getclassName()+" esta jugando con:" an.getclassName());
  }
  else{
    System.out.println(this.getclassName()+" está huyendo de :" an.getclassName());
    daño();
  }
}

public void daño(){
  vida--;
  if(vida==0){
    System.out.println(this.getclassName()+" se murió:'c'");
  }
}

public void comer(){
  System.out.println(this.getclassName+" esta comiendo: "+comidafav);
}
}
