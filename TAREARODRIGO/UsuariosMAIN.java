
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class UsuariosMAIN {

        public static void main(String[] args) {
             String usr;
             String psw;
             int opcion;
             Boolean salir=false;
            Scanner teclado = new Scanner(System.in);
            ArrayList obj = new ArrayList();

            while (!salir){
            System.out.println("¿Desea ingresar o registrarse?");
            System.out.println("1)Ingresar");
            System.out.println("2)Registrarse");
            opcion = teclado.nextInt();
            teclado.next();

            if(opcion == 1){
                System.out.println("Ingresar usuario");
                usr = sc.next();
                System.out.println("Ingresar contraseña");
                psw = sc.next();
                try{
                    ObjectInputStream ent = new ObjectInputStream(new FileInputStream(new File("/home/hector/proteco"+usr)));
                    File f = new File("/home/hector/usuarios"+user);
                    if(f.exists()){
                        System.out.println("Existe el usuario");
                    Usuario pk = (Usuario)ent.readObject();

                    if(password.equals(pk.psw()){
                      System.out.println("INGRESADO");
                    }
                      else{
                        System.out.println("Ingreso incorrecto");}

                      else{
                        System.out.println("Error usuario");
                     }

                   }
                catch(Exception e){}

            }
            else if (opcion == 2){
                System.out.println("Ingrese su nombre de Usuario:");
                usr = teclado.next();
                System.out.println("Ingrese su contraseña");
                pasw = teclado.next()

                obj.add(new Usuario(user,password,nombre,edad,altura));
                try{
                        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File("/home/nbrandons11/Documentos/"+user)));
                        salida.writeObject(obj.get(obj.size()-1));
                         salida.close();
                         }
                  catch(IOException ioe){

                  }
            }

        }



    }
}
