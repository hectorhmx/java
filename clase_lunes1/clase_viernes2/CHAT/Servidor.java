import java.io.BufferReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor extends Thread{
  private String nombreCliente;
  private BufferReader entrada;

  public Servidor(Socket s) throws IOException{
    entrada = new BufferReader(new InputStreamReader(s.getInputStream()))
    nombreCliente = s.getInetAddres().getCanonnicalHostName();
    System.out.println("Conexion aceptada dsde"+s.RemoteSocketAdress);

  }
  public String recibir()throws IOException{
    String str = entrada.readLINE();
    retun str;
  }

  public void cerrar() throws IOException{
    entrada.close();
    lo
  }

  Override
  public void(run()){
    try{
      String cadena = "";
  do {
    cadena = rcibir(9)
  } while ();
    }catch
  }
}
