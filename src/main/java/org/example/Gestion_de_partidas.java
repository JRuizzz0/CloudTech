package org.example;

import GestUsu.Usuario;
import Suscripcion.Plan;
import gestVideojuegos.Videojuego;
import recursos.InvalidGameException;
import recursos.InvalidCatalogoException;
import recursos.InvalidUsuarioException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestion_de_partidas {
    private Map<String, Integer> numPartidasAct = new HashMap<>();
    private ArrayList<Videojuego> listaJuegos = new ArrayList<>();
    Gestion_de_usuarios gestion_de_usuarios = new Gestion_de_usuarios();

    public boolean añadirAlCatalogo(Videojuego juego) {
        if (juego == null) {
            throw new InvalidCatalogoException("No se puede añadir un juego nulo al catálogo.");
        }
        return listaJuegos.add(juego);
    }
    public boolean comprobarCatalogo(String nombre) {
        Usuario u = gestion_de_usuarios.buscarUsuario(nombre);

        return (u != null && u.getPlan().getCatalogo() != null);
    }

    public boolean iniciarPartida(Usuario usuario) {
        int partidasActivas = 0;
        if (usuario == null) {
            throw new InvalidUsuarioException("No se puede iniciar un partida debido al usuario");
        }else {

            numPartidasAct.put(usuario.getNombre_completo(), partidasActivas++);

        }
        return numPartidasAct.isEmpty();
    }

    public Videojuego buscarJuego(String nombre) throws InvalidGameException {
        for (Videojuego v : listaJuegos) {
            if (v.getNombre().equalsIgnoreCase(nombre)) return v;
        }
        throw new InvalidGameException("El videojuego '" + nombre + "' no existe en CloudTech.");
    }

    public int actualizarPartidas(Usuario usuario) {

        return numPartidasAct.get(usuario);
    }
}