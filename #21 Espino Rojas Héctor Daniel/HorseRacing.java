import java.util.Scanner;
import java.util.Random;		/*LINEA AGREGADA*/
class HorseSelected{
	static int selectnum=0;
}
class Score{
	int position=0;
	static boolean winner=false;
}

class Horse implements Runnable {
	Score s=new Score();
	String horsename=null;
	Random rand=new Random();	/* LINEA AGREGADA */
	public Horse(String name){
		horsename=name;
	}
	public void run(){
		System.out.println(horsename+"Esta corriendo");
		try{
			for(int i=0;i<5;i++){

					Thread.currentThread().sleep(rand.nextInt(1000)); /*LINEA MODIFICA*/
					/*LO QUE PASA  ES QUE TODOS LLEGAN POR LA VELOCIDAD DEL PROCESADOR, PARA QUE NO
					 * PASE ESO TENEMOS QUE HACER UNOS DUERMAN MAS Y OTROS MENOS Y SE VEA QUE
					 * ALGUIEN GANO PUES AHORA SI SE EJECUTARIA EL METODO interrupt(), porque no se
					 * estaba ejecutando porque todos los hilos se estaban ejecutando 'al mismo
					 * tiempo'
					 *
					 * otra forma de hacerlo es en lugar de usar sleep() podriamos ir cambiando su
					 * prioridad de manera aleatoria*/
				s.position++;
				if(s.winner==false){
					//System.out.println("posicion "+horsename+":"+s.position);
					System.out.print("*");
				}
				if((s.position==5) && (s.winner==false)){
					System.out.println(horsename+"gano");
					s.winner=true;
					String nombre = "Horse"+HorseSelected.selectnum;
					if(nombre.equals(horsename)){
						System.out.println("Te ganaste un pomo :)");
					}else{
						System.out.println("Me debes un pomo");
					}
					Thread.currentThread().interrupt();
				}
			}
		}catch(Exception e){

		}
	}
}
public class HorseRacing {
	public HorseRacing(){
		System.out.println("¿Cuantos caballos deseas crear?");
		Scanner sc=new Scanner(System.in);
		int opcion=sc.nextInt();
		System.out.println("¿Que caballo quieres elegir?");
		HorseSelected.selectnum = sc.nextInt();
		System.out.println("Comienza la carrera");
		for (int i = 1;i<=opcion;i++ ) {
			new Thread(new Horse("Horse" +i)).start();
		}

	}
	public static void main(String[] args) {
		HorseRacing carrera=new HorseRacing();
	}
}
