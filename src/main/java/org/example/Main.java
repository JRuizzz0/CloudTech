package org.example;

import GestUsu.Usuario;
import Suscripcion.Basic;
import Suscripcion.Plan;
import gestVideojuegos.Videojuego;
import org.example.Gestion_de_partidas;
import org.example.Gestion_de_usuarios;
import recursos.Genero;

public class Main {
    public static void main(String[] args) {

        Gestion_de_usuarios gestionUsuarios = new Gestion_de_usuarios();
        Gestion_de_partidas gestionPartidas = new Gestion_de_partidas();

        System.out.println("--- Sistema CloudPlay Iniciado ---");


        Plan planBasico = new Basic();
        Usuario nuevoUsuario = new Usuario("Juan Perez", "juan@example.com", planBasico);

        Videojuego juego1 = new Videojuego("Hollow Knight", 50, Genero.METROIDVANIA);

        System.out.println("Registrando usuarios...");
        gestionUsuarios.registrarUsuarios();

        System.out.println("Buscando juegos disponibles...");
        String resultadoBusqueda = gestionPartidas.buscarJuegos();

        try {

            if (resultadoBusqueda.isEmpty()) {

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Las gestiones han sido inicializadas correctamente.");
    }
}