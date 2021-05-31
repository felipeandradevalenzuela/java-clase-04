package Ejercicio02;

public class Moto extends Vehiculo {
    
    private final static int PESO = 300;
    private final static int RUEDAS = 2;

    public Moto(int velocidad, int aceleracion,float anguloDegiro, String patente) {
        super(velocidad, aceleracion, RUEDAS, PESO, anguloDegiro, patente);
    }

}
