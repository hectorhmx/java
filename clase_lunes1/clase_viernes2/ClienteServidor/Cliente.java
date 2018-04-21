import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cliente{
  public static void main(String[] args) throws IOException{
    //paso 1 crear un socket para conectar con el serividor
    Socket s=new Socket("192.168.1.146",9999);
    String cadena="";
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

    //paso 2 obtener flujos de entrada y salida
    PrintStream ps=new PrintStream(s.getOutputStream());

    //paso 3: realizar procesamiento
    while (!cadena.equals("quit")) {
      cadena =teclado.readLine();
      ps.println(cadena);
      ps.flush();
    }

    //paso 4 cerrar la conexion
    ps.close();
    teclado.close();
    s.close();
  }
}
