package org.example;

import gestVideojuegos.Videojuego;
import org.junit.jupiter.api.Test;
import recursos.Genero;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Gestion_de_partidasTest {

    Gestion_de_partidas gestor = new Gestion_de_partidas();
    Gestion_de_usuarios gestor_usuarios = new Gestion_de_usuarios();

    @Test
    void añadirCatalogo() {
        ArrayList<Videojuego> listaJuegos = new ArrayList<>();
        gestor.añadirAlCatalogo(new Videojuego("Zelda",200,Genero.RPG));
        listaJuegos.add(new Videojuego("Zelda",200,Genero.RPG));
        assertEquals(1,listaJuegos.size());
    }

    @Test
    void comprobarCatalogo() {

    }

    @Test
    void buscarJuegos() {
        gestor.añadirAlCatalogo(new Videojuego("Zelda",200,Genero.RPG));
        assertNotNull(gestor.buscarJuego(("Zelda")));
    }

    @Test
    void actualizarPartidas() {
        gestor_usuarios.registrarUsuarios("Ana","ana@gmail.com",2);

    }
}