class Animal implements Interface{
/*+Clase padre de todos los animales, implementa interfaz por lo que sus hijas lo harán tambien
Al igual que sus hijas tendrá un nombre y un método cantar el cual sobreescribirán estas*/
public String name;
Animal(String nombre){
  this.name = nombre;
}
Animal(){

}
public String cantar(){
  return "";
}

}
