package Ejercicio03;

import java.util.List;

public class Evento {

    private int identificador;

    private List<FuegosArtificiales> fuegosArtificialesList;

    private List<Invitados> invitadosList;


    public Evento(int identificador, List<FuegosArtificiales> fuegosArtificialesList, List<Invitados> invitadosList) {
        this.identificador = identificador;
        this.fuegosArtificialesList = fuegosArtificialesList;
        this.invitadosList = invitadosList;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public List<FuegosArtificiales> getFuegosArtificialesList() {
        return fuegosArtificialesList;
    }

    public void setFuegosArtificialesList(List<FuegosArtificiales> fuegosArtificialesList) {
        this.fuegosArtificialesList = fuegosArtificialesList;
    }

    public List<Invitados> getInvitadosList() {
        return invitadosList;
    }

    public void setInvitadosList(List<Invitados> invitadosList) {
        this.invitadosList = invitadosList;
    }

    public void explosionFuegosArtificiales(){
        this.fuegosArtificialesList.forEach(FuegosArtificiales::explotar);
    }

    public void degustacion(){
        this.invitadosList.forEach(Invitados::comerTorta);
    }
}
