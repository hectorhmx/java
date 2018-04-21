import java.io.IOException;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;

public class Servidor{
  public static void main(String[] args) throws IOException {
      //PASO 1 CREAR SOCKET Servidor
      ServerSocket ss=new ServerSocket(9999);


      String cadena="";
      //Paso 2: Espera la conexion
      Socket s=ss.accept();
      System.out.println("Conexion aceptada desde "+s.getInetAddress().getCanonicalHostName());

      //paso 3: obtener los flujos de I/O del socket
      BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));

      //Paso 4: Realizar el procesamiento
      while(!cadena.equals("quit")){
        cadena=br.readLine();
        System.out.println(cadena);
      }

      //paso 5 cerrrar la conexion
      br.close();
      s.close();
      ss.close();
  }
}
