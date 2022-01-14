public class Main {

    public static void main(String[] args) {
        Socio Ana = new Socio(1,"Ana","Martín","76051556D");
        Bibliotecario Manuel = new Bibliotecario(1,"Manuel","Núñez");

        Ana.darsedealta();
        Ana.cogerlibro();
        Ana.devolverlibro();

        Manuel.abrir();
        Manuel.ordenarlibros();
        Manuel.gestionarprestamos();
        Manuel.cerrar();
    }
}