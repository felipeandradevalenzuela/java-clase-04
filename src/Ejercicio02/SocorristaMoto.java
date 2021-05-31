package Ejercicio02;

public class SocorristaMoto extends Vehiculo {

    public SocorristaMoto(int velocidad, int aceleracion, int ruedas, int peso, float anguloDegiro, String patente) {
        super(velocidad, aceleracion, ruedas, peso, anguloDegiro, patente);
    }

    public void socorrer(Moto unaMoto) {
        System.out.println("Socorriendo Moto"+ unaMoto.getPatente());
    }
    
}
