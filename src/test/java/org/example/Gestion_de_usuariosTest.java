package org.example;

import GestUsu.Usuario;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Gestion_de_usuariosTest {

    Gestion_de_usuarios gestor = new Gestion_de_usuarios();

    @Test
    void RegistrarUsuario() {
        boolean completo = gestor.registrarUsuarios("Ana", "ana@gmail.com", 1);
        assertTrue(completo);
        assertNotNull(gestor.buscarUsuario("Ana"));
    }


    @Test
    void CambiarPlan() {
        gestor.registrarUsuarios("Ana", "ana@gmail.com", 1);


        boolean cambio = gestor.cambiarPlan("Ana", 2);

        assertTrue(cambio);
        assertEquals("Advance", gestor.buscarUsuario("Ana").getPlan().getNombre());
    }

    @Test
    void ConsultarVelocidad() {
        gestor.registrarUsuarios("Ana", "ana@gmail.com", 3);


        int velocidad = gestor.consultarVelocidad("Ana");

        assertEquals(500, velocidad);
    }



    @Test
    void ListarUsuarios() {

        gestor.registrarUsuarios("Usuario 1", "u1@gmail.com", 1);
        gestor.registrarUsuarios("Usuario 2", "u2@gmail.com", 2);

        ArrayList<Usuario> lista = gestor.listarUsuarios();

        assertNotNull(lista);
        assertEquals(2, lista.size());
        assertEquals("Usuario 1", lista.get(0).getNombre_completo());
    }

    @Test
    void ComprobarPlan() {
        gestor.registrarUsuarios("Alex", "alex@gmail.com", 1);
        assertTrue(gestor.comprobarPlan("Alex"));
        assertEquals(true,gestor.comprobarPlan("Alex"));
        assertFalse(gestor.comprobarPlan("Raul"));
    }
}