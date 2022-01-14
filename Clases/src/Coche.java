public class Coche {
    String matricula;
    int velocidad;
    String modelo;
    String marca;
    float capacidad;
    String color;
    int año;
    int autonomia;
    String tipo;
    int marcha;

    public void arrancar() {
        System.out.println("Hemos arrancado el coche");
    }

    public void acelerar() {
        this.velocidad+=10;
        System.out.println("Coche acelerando ("+velocidad+" km/h)");
    }

    public void frenar() {
        System.out.println("Coche frenado");
    }

    public void puertas() {
        System.out.println("Hemos abierto las puertas");
    }

    public void marcha() {
        System.out.println("Cambiando marcha");
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Coche() {
    }

    public Coche(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Coche(String matricula, int velocidad, String modelo, String marca, float capacidad, String color, int año, int autonomia, String tipo, int marcha) {
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.color = color;
        this.año = año;
        this.autonomia = autonomia;
        this.tipo = tipo;
        this.marcha = marcha;
    }
}
