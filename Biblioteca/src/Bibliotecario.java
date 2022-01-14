public class Bibliotecario extends Persona{

    int id_bibliotecario;

    public void abrir() {
        System.out.println("Biblioteca abierta");
    }

    public void cerrar() {
        System.out.println("Biblioteca cerrada");
    }

    public void gestionarprestamos() {
        System.out.println("Préstamo solicitado");
    }

    public void ordenarlibros() {
        System.out.println("Libros ordenados");
    }

    public Bibliotecario(int id_bibliotecario, String nombre, String apellido) {
        super(nombre, apellido);
        this.id_bibliotecario = id_bibliotecario;
    }

}