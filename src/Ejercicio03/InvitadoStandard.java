package Ejercicio03;

public class InvitadoStandard extends Invitados {

    private int id;

    public InvitadoStandard(String nombre, int id) {
        super(nombre);
        this.id = id;
    }

    @Override
    public void comerTorta() {
        //Comen la torta
    }
}
