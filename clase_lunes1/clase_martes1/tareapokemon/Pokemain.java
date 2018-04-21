import java.util.Scanner;

public class Pokemain{
  public static void main(String[] args) {
    static int turno = 1;
    Pokemon pokem = new Pokemon(new java.util.Scanner(System.in).next());
    Pokemon poken = new Pokemon(new java.util.Scanner(System.in).next());
    static boolean bull = true;
    Ataques cuerpo = new Ataques("Placaje",10);
    Ataques fuerza = new Ataques("Golpe ciego",30);
    Ataques pisquico = new Ataques("jaqueca",40);
    Ataques fuego = new Ataques("Lanza llamas",40);
    Ataques agua = new Ataques("Salpicar",1000);


    while(bull){
      System.out.println("Po-ke-mon, ser un entrendador, nuestro, destino es:");
      if(turno%2 == 0)
      {
        System.out.println(poken.name+"Es tu turno");
        System.out.println("¿Qué ataque quieres usar?");
        System.out.println("Tus ataques son: \n1)placaje      2)golpe\n3)jaqueca    4)fuego");
        int op = Integer.parseInt(new java.util.Scanner(System.in).next());
        switch (op){

          case 4:{
            pokem.setVida(fuego.dano);
            break;
          }
          case 1:{
              pokem.setVida(cuerpo.dano);
              break;
            }
          case 2:{
                pokem.setVida(fuerza.dano);
                break;
              }
          case 3:{
            pokem.setVida(pisquico.dano);
            break;
          }
          default:
            System.out.println("Error en la matrix");
            break;
        }
      }
      else
      {
        System.out.println(pokem.name+"Es tu turno");
        System.out.println("¿Qué ataque quieres usar?");
        System.out.println("Tus ataques son: \n1)placaje      2)golpe\n3)jaqueca    4)Salpicar");
        op = Integer.parseInt(new java.util.Scanner(System.in).next());
        switch (op){

          case 4:{
            poken.setVida(agua.dano);
            break;
          }
          case 1:{
              poken.setVida(cuerpo.dano);
              break;
            }
          case 2:{
                poken.setVida(fuerza.dano);
                break;
              }
          case 3:{
            poken.setVida(pisquico.dano);
            break;
          }
          default:
            System.out.println("Error en la matrix");
            break;
          }
      }
      turno++;

      System.out.println("");
      System.out.println("");
      System.out.println("");
    }
}
}
