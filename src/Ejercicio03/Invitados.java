package Ejercicio03;

public abstract class Invitados {

    String nombre;

    public Invitados(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void comerTorta();

}

