package Ejercicio03;

import java.util.List;

public class PackFuegosArtificiales implements FuegosArtificiales {

    private List<FuegoArtificial> fuegosArtificiales;

    public PackFuegosArtificiales(List<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public List<FuegoArtificial> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(List<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    @Override
    public void explotar() {
        System.out.println("*** Pack de Fuegos Artificiales  ***");
        this.fuegosArtificiales.forEach(FuegoArtificial::explotar);
    }
}
