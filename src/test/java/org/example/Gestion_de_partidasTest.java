package org.example;
//test
import GestUsu.Usuario;
import Suscripcion.Basic;
import gestVideojuegos.Videojuego;
import org.junit.jupiter.api.Test;
import recursos.*;

import static org.junit.jupiter.api.Assertions.*;

class Gestion_de_partidasTest {

    Gestion_de_partidas gestor = new Gestion_de_partidas();

    @Test
    void añadirCatalogo() {

        Videojuego v = new Videojuego("Zelda", 200, Genero.RPG);
        assertTrue(gestor.añadirAlCatalogo(v));


        assertThrows(InvalidCatalogoException.class, () -> {
            gestor.añadirAlCatalogo(null);
        });
    }

    @Test
    void comprobarCatalogo() {
        gestor.gestion_de_usuarios.registrarUsuarios("Ana", "ana@gmail.com", 1);
        assertTrue(gestor.comprobarCatalogo("Ana"));
        assertFalse(gestor.comprobarCatalogo("Raul"));
    }

    @Test
    void buscarJuegos() {
        gestor.añadirAlCatalogo(new Videojuego("Zelda", 200, Genero.RPG));
        assertDoesNotThrow(() -> gestor.buscarJuego("Zelda"));
        assertThrows(InvalidGameException.class, () -> {
            gestor.buscarJuego("Mario");
        });
    }

    @Test
    void iniciarPartida() {
        Usuario u = new Usuario("Lucas", "l@gmail.com", new Basic());

        gestor.iniciarPartida(u);
        assertEquals(1, gestor.actualizarPartidas(u));
        assertThrows(InvalidUsuarioException.class, () -> {
            gestor.iniciarPartida(null);
        });
    }

    @Test
    void actualizarPartidas() {
        Usuario u = new Usuario("Pepe", "p@gmail.com", new Basic());
        assertEquals(0, gestor.actualizarPartidas(u));
        assertThrows(InvalidUsuarioException.class, () -> {
            gestor.actualizarPartidas(null);
        });
    }
}