public class PruebaPersona {
    public static void main(String[] args) {
        // forma 1 de instancian Persona p1 = new Persona();
        /* forma 2
        Persona per;
        per = new Persona();*/
        Persona p1 = new Persona();
        //Así se corren los métodos
        p1.nombre = "Rodrigo";
        p1.edad = 21;
        p1.peso = 69.5;

        p1.dormir();
        p1.caminar();

        //si pongo Persona p3 = p1; direccion de p1 0x333
        //p1=NULL
        // p3 ahora apuntará a 0x333
    }
}
