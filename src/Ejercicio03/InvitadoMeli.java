package Ejercicio03;

public class InvitadoMeli extends Invitados {

    private int idMeli;

    public InvitadoMeli(String nombre, int id) {
        super(nombre);
        this.idMeli = id;
    }

    public void gritar(){
        System.out.println(this.nombre + " : Viva la Chiqui!");
    }

    @Override
    public void comerTorta() {
        //Comen la torta
        this.gritar();
    }
}
