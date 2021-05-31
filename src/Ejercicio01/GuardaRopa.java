package Ejercicio01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    
    private HashMap<Integer, List<Prenda>> diccionario;
    private int identificador;
    
    public GuardaRopa()
    {
        diccionario = new HashMap<>();
        identificador = 1;
    }

    public GuardaRopa(HashMap<Integer, List<Prenda>> diccionario,Integer identificador) {
        this.identificador = identificador;
        this.diccionario = diccionario;
    }

    public HashMap<Integer, List<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<Integer, List<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda)
    {

        diccionario.put(obtenerContador(), listaDePrenda);
        return identificador++;
    }

    public void mostrarPrendas()
    {
        for (Map.Entry<Integer, List<Prenda>> prenda : this.diccionario.entrySet()) 
        {
            int id = prenda.getKey();
            prenda.getValue().forEach(articulo -> 
            {
                System.out.println("Id:"+id+", Articulo: "+articulo);
            });
        }
    }

    public List<Prenda> devolverPrendas(Integer numero)
    {

        if(!diccionario.containsKey(numero))
        {
              throw new RuntimeException("Id Ingresado no existe en el diccionario");
        }

        List<Prenda> prendasDevueltas = diccionario.get(numero);
        diccionario.remove(numero);

        return prendasDevueltas;
    }

    private Integer obtenerContador()
    {
        for (int i = 1; i <= identificador; i++) {
            if(!diccionario.containsKey(i))
            {
                return i;
            }
        }

        return identificador+1;
    }

}
