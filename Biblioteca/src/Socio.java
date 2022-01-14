public class Socio extends Persona{

    int id_socio;
    String dni;

    public void darsedealta() {
        System.out.println("Nuevo socio");
    }

    public void cogerlibro() {
        System.out.println("Libro cogido");
    }

    public void devolverlibro() {
        System.out.println("Libro devuelto");
    }

    public Socio(int id_socio, String nombre, String apellido, String dni) {
        super(nombre, apellido);
        this.id_socio = id_socio;
        this.dni = dni;
    }

}