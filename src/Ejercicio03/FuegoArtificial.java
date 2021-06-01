package Ejercicio03;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Optional;

public class FuegoArtificial implements FuegosArtificiales{

    private String ruido;

    private Color color;

    public FuegoArtificial(String ruido, Color color) {
        this.ruido = ruido;
        this.color = color;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void explotar() {
        System.out.println("*** *** *** *** *** Fuego Artificial " + colorName(color).get() + " *** *** *** *** ***");
    }

    public static Optional<String> colorName(Color c) {
        for (Field f : Color.class.getDeclaredFields()) {
            if (f.getType().equals(Color.class))
                try {
                    if (f.get(null).equals(c))
                        return Optional.of(f.getName().toLowerCase());
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
        }
        return Optional.empty();
    }
}
