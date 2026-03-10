package org.example;

import gestVideojuegos.Videojuego;
import recursos.InvalidGameException;
import recursos.InvalidCatalogoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestion_de_partidas {
    private Map<String, Integer> numPartidasAct = new HashMap<>();
    private ArrayList<Videojuego> listaJuegos = new ArrayList<>();


    public boolean añadirAlCatalogo(Videojuego juego) {
        if (juego == null) {
            throw new InvalidCatalogoException("No se puede añadir un juego nulo al catálogo.");
        }
        return listaJuegos.add(juego);
    }


    public Videojuego buscarJuego(String nombre) throws InvalidGameException {
        for (Videojuego v : listaJuegos) {
            if (v.getNombre().equalsIgnoreCase(nombre)) return v;
        }
        throw new InvalidGameException("El videojuego '" + nombre + "' no existe en CloudTech.");
    }

    public int getPartidas(String usuario) {
        return numPartidasAct.getOrDefault(usuario, 0);
    }
}