package Clases;

public class Cuenta {

    private String nombre;
    private float cantidad;

    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nCantidad: " + cantidad;
    }

    public void ingresar(int input) {
        if (input>0) {
            this.cantidad += input;
        }
    }

    public void retirar(int input) {
        if (this.cantidad-input<0) {
            this.cantidad=0;
        }
        else {
            this.cantidad-=input;
        }
    }
}
