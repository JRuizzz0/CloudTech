package Suscripcion;

import java.util.ArrayList;
import java.util.List;

public abstract class Plan {
    protected int velocidad;
    protected String nombre;
    protected int partidasSimul;
    protected List<String> catalogo;

    public Plan() {
        this.catalogo = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPartidasSimul() {
        return partidasSimul;
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}