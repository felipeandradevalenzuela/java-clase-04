package Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Moto moto1 = new Moto(120, 95, 20, "M1");
        Moto moto2 = new Moto(110, 90, 30, "M2");
        Moto moto3 = new Moto(100, 100, 40, "M3");
        Moto moto4 = new Moto(110, 80, 30, "M4");

        Auto auto1 = new Auto(100, 40, 60, "A1");
        Auto auto2 = new Auto(120, 40, 70, "A2");
        Auto auto3 = new Auto(110, 35, 70, "A3");
        Auto auto4 = new Auto(90, 80, 90, "A4");
        Auto auto5 = new Auto(140, 20, 20, "A5");

        SocorristaAuto socorristaAuto = new SocorristaAuto(120, 30, 4, 1000, 3, "AUXCAR");
        SocorristaMoto socorristaMoto = new SocorristaMoto(160, 60, 2, 300, 6,"AUXMOTO");

        //List<Vehiculo> listaVehiculos = Arrays.asList(auto1, auto2, moto1, moto2);
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(auto1);
        listaVehiculos.add(auto2);
        listaVehiculos.add(moto1);
        listaVehiculos.add(moto2);


        Carrera carrera1 = new Carrera(10000, 10000, "500 de Indianapolis",
                6, listaVehiculos, socorristaAuto, socorristaMoto
                );

        listaVehiculos = carrera1.getListaDeVehiculos();
        listaVehiculos.forEach(vehiculo -> {
            System.out.println("VEHICULO : " + vehiculo.getPatente());
        });

        carrera1.darDeAltaAuto(100, 50, 60, "A6");
        carrera1.darDeAltaMoto(90, 70, 30, "M5");

        System.out.println("--------------");
        listaVehiculos = carrera1.getListaDeVehiculos();
        listaVehiculos.forEach(vehiculo -> {
            System.out.println("VEHICULO : " + vehiculo.getPatente() + " TIPO: " + vehiculo.getClass());
        });

        carrera1.eliminarVehiculo(auto2);

        System.out.println("--------------");
        listaVehiculos = carrera1.getListaDeVehiculos();
        listaVehiculos.forEach(vehiculo -> {
            System.out.println("VEHICULO : " + vehiculo.getPatente() + " TIPO: " + vehiculo.getClass());
        });

        carrera1.darDeAltaAuto(120, 40, 70, "A2");
        carrera1.eliminarVehiculoConPatente("M1");

        System.out.println("--------------");
        listaVehiculos = carrera1.getListaDeVehiculos();
        listaVehiculos.forEach(vehiculo -> {
            System.out.println("VEHICULO : " + vehiculo.getPatente() + " TIPO: " + vehiculo.getClass());
        });

        Vehiculo ganador = carrera1.obtenerGanador();
        System.out.println("\nEl ganador es : " + ganador.getPatente() + " TIPO: " + ganador.getClass());

        carrera1.socorrerMoto("M2");
        carrera1.socorrerAuto("A2");

    }
}