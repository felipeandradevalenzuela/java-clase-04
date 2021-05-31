package Ejercicio02;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class Carrera {

    private int distancia;

    private double premioEnDolares;

    private String nombre;

    private int cantidadDeVehiculosPermitidos;

    private List<Vehiculo> listaDeVehiculos;

    private SocorristaAuto socorristaAuto;

    private SocorristaMoto socorristaMoto;

    public Carrera(int distancia,
                   double premioEnDolares,
                   String nombre,
                   int cantidadDeVehiculosPermitidos,
                   List<Vehiculo> listaDeVehiculos,
                   SocorristaAuto socorristaAuto,
                   SocorristaMoto socorristaMoto) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
        this.socorristaAuto = socorristaAuto;
        this.socorristaMoto = socorristaMoto;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public SocorristaAuto getSocorristaAuto() {
        return socorristaAuto;
    }

    public void setSocorristaAuto(SocorristaAuto socorristaAuto) {
        this.socorristaAuto = socorristaAuto;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void darDeAltaAuto(int velocidad, int aceleracion,
            float anguloDeGiro, String patente) {
        if (cantidadDeVehiculosPermitidos >= this.listaDeVehiculos.size()) {
            this.listaDeVehiculos.add(new Auto(
                    velocidad,
                    aceleracion,
                    anguloDeGiro,
                    patente));
        } else {
            throw new RuntimeException("No hay cupos para la carrera");
        }
    }

    public void darDeAltaMoto(int velocidad, int aceleracion,
            float anguloDeGiro, String patente) {
        if (cantidadDeVehiculosPermitidos >= this.listaDeVehiculos.size()) {
            this.listaDeVehiculos.add(new Moto(
                    velocidad,
                    aceleracion,
                    anguloDeGiro,
                    patente));
        } else {
            throw new RuntimeException("No hay cupos para la carrera");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String unaPatente) {
        Optional<Vehiculo> vehiculoOptional = this.getVehiculo(unaPatente);
        if(vehiculoOptional.isPresent()){
            this.listaDeVehiculos.remove(vehiculoOptional);
        }else{
            throw new RuntimeException("El vehiculo ingresado no existe en la carrera");
        }
    }

    public Vehiculo obtenerGanador() {
        Vehiculo ganador = null;
        float puntosGanador = 0;
        for (int j = 0; j < listaDeVehiculos.size(); j++) {

            float puntos = this.listaDeVehiculos.get(j).getVelocidad() * (this.listaDeVehiculos.get(j).getAceleracion() / 2) /
                    (this.listaDeVehiculos.get(j).getAnguloDeGiro() * ((this.listaDeVehiculos.get(j).getPeso() - this.listaDeVehiculos.get(j).getRuedas()) * 100));
            if (puntosGanador < puntos) {
                ganador = this.listaDeVehiculos.get(j);
            }
        };
        return ganador;
    }

    public void socorrerAuto(String patente) {
        Optional<Vehiculo> vehiculoOptional = getVehiculo(patente);
        if(vehiculoOptional.isPresent()){
            Vehiculo v = vehiculoOptional.get();
            if(v instanceof Auto){
                this.socorristaAuto.socorrer((Auto) v);
            }else{
                throw new RuntimeException("La patente ingresada no pertenece a un Auto");
            }
        }
    }

    public void socorrerMoto(String patente) {
        Optional<Vehiculo> vehiculoOptional = getVehiculo(patente);
        if(vehiculoOptional.isPresent()){
            Vehiculo v = vehiculoOptional.get();
            if(v instanceof Moto){
                this.socorristaMoto.socorrer((Moto) v);
            }else{
                throw new RuntimeException("La patente ingresada no pertenece a una Moto");
            }
        }
    }

    private Optional<Vehiculo> getVehiculo(String patente) {
        return this.listaDeVehiculos
                .stream()
                .filter(vehiculo -> vehiculo.getPatente().equals(patente))
                .findFirst();
    }
}