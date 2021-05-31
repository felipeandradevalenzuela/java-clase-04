package Ejercicio02;

public class SocorristaAuto extends Vehiculo{


    public SocorristaAuto(int velocidad, int aceleracion, int ruedas, int peso, float anguloDegiro, String patente) {
        super(velocidad, aceleracion, ruedas, peso, anguloDegiro, patente);
    }

    public void socorrer(Auto unAuto) {
        System.out.println("Socorriendo Auto"+ unAuto.getPatente());
    }
    
}
