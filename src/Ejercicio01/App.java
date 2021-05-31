package Ejercicio01;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Prenda prenda1 = new Prenda("Levis", "vaquero");
        Prenda prenda2 = new Prenda("Tommy", "remera");
        Prenda prenda3 = new Prenda("Red", "blusa");
        Prenda prenda4 = new Prenda("Red", "short");
        Prenda prenda5 = new Prenda("Levis", "corbata");
        Prenda prenda6 = new Prenda("Hol", "remera");
        Prenda prenda7 = new Prenda("Miko", "bufanda");
        Prenda prenda8 = new Prenda("Hol", "campera");
        
        List<Prenda> prendas1 = Arrays.asList(prenda1, prenda2, prenda3);
        List<Prenda> prendas2 = Arrays.asList(prenda4, prenda5);
        List<Prenda> prendas3 = Arrays.asList(prenda6, prenda7);
        List<Prenda> prendas4 = Arrays.asList(prenda8);
        
        GuardaRopa guardaRopa = new GuardaRopa();
        guardaRopa.guardarPrendas(prendas1);
        guardaRopa.guardarPrendas(prendas2);
        guardaRopa.guardarPrendas(prendas3);
        guardaRopa.guardarPrendas(prendas4);

        guardaRopa.mostrarPrendas();

        guardaRopa.devolverPrendas(2);
        // guardaRopa.devolverPrendas(2);
        System.out.println("-----------------");
        guardaRopa.mostrarPrendas();
        guardaRopa.guardarPrendas(prendas2);
        System.out.println("-----------------");
        guardaRopa.mostrarPrendas();
    }
}
