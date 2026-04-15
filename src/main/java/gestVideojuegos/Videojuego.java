package gestVideojuegos;

import recursos.Genero;

import java.util.ArrayList;
import java.util.List;

//Clase videojuego
public class Videojuego {
    private String nombre;
    private int velocidadMin;
    private Genero genero;
    private List<String> catalogo;

    public Videojuego(String nombre, int velocidadMin, Genero genero) {
        this.nombre = nombre;
        this.velocidadMin = velocidadMin;
        this.genero = genero;
        this.catalogo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidadMin() {
        return velocidadMin;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}