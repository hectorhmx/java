public class Pokemon{
  private String name;
  private int vida;
  private int nivel;



  Pokemon(String nombre){
    name = nombre;
    vida = 100;
    nivel = 100;
  }
  public string getName(){
    return name;
  }

  public int setVida(int dano){
    if(vida-dano <= 0)
    {
      Pokemain.bull = false;
      perdedor();
      return -1;
    }
    else{
      vida-=dano;
      return 1;
    }
  }

  Pokemon perdedor(){
    System.out.println(name+"Ha sido derrotado");
  }
}
