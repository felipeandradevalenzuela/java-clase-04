package Ejercicio02;

public class Auto extends Vehiculo {
    
    private final static int PESO = 1000;
    private final static int RUEDAS = 4;

    public Auto(int velocidad, int aceleracion, float anguloDegiro, String patente) {
        super(velocidad, aceleracion, RUEDAS, PESO, anguloDegiro, patente);
    }

}
