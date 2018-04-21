import java.util.Scanner;
class HorseSelected{
  static String selectname="";
}
class Score{
  int position=0;
  static boolean winner = false;
}
class Horse implements Runnable{
  Score s = new Score();
  String horsename = null;
  public Horse(String name){
    horsename=name;
  }

  public void run(){
    System.out.println(horsename+"Empezó a correr");
    try{
        for(int i =0;i<5;i++)
        {
          Thread.currentThread().sleep(1000);
          s.position++;
          if(s.winner==false)
          {
            System.out.println("Posicion "+horsename+": "+s.position);

          }
          if(s.position==5&&(s.winner==false)){
            System.out.println(horsename+"gano");
            s.winner= true;
            if(HorseSelected.selectname.equals(horsename)){
              System.out.println("Te ganaste un pomo :)");
            }else{
              System.out.println("Atorado");
            }
            Thread.currentThread().interrupt();
          }

        }

    }catch(Exception e){
    }
  }
}


public class HorseRacing{
  public HorseRacing(){
    System.out.println("Escoge un caballo 1.horse1,2,horsesito,3 jorsesito");
    Scanner teclado = new Scanner(System.in);
    String opcion = teclado.nextLine();

    switch(opcion){
        case "1":
                  HorseSelected.selectname="Horse1";
                  break;
        case "2":
                  HorseSelected.selectname="Horse1";
                  break;
        case "3":
                  HorseSelected.selectname="Horse1";
                  break;
        default:
              System.out.println("Etas wey ");
              break;
    }
  }
  public static void main(String[] args) {
    HorseRacing carrera = new HorseRacing();
    Horse c1 = new Horse("Horse 1");
    Horse c2 = new Horse("Horse 1");
    Horse c3 = new Horse("Horse 1");
    new Thread(c1).start();
    new Thread(c2).start();
    new Thread(c3).start();
  }
}
