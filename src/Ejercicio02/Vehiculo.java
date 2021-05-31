package Ejercicio02;

public class Vehiculo {
    private int velocidad,aceleracion,ruedas,peso;
    private float anguloDegiro;
    private String patente;

    public Vehiculo(int velocidad, int aceleracion, int ruedas, int peso, float anguloDegiro, String patente) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.ruedas = ruedas;
        this.peso = peso;
        this.anguloDegiro = anguloDegiro;
        this.patente = patente;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAnguloDeGiro() {
        return anguloDegiro;
    }

    public void setAnguloDeGiro(float anguloDegiro) {
        this.anguloDegiro = anguloDegiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}

