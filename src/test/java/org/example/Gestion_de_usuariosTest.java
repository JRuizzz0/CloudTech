package org.example;

import GestUsu.Usuario;
import org.junit.jupiter.api.Test;
import recursos.InvalidUsuarioException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Gestion_de_usuariosTest {

    Gestion_de_usuarios gestor = new Gestion_de_usuarios();

    @Test
    void RegistrarUsuario() {

        assertTrue(gestor.registrarUsuarios("Ana", "ana@gmail.com", 1));
        assertFalse(gestor.registrarUsuarios("Ana", "ana2@mail.com", 1));
        assertFalse(gestor.registrarUsuarios("Luis", "l@gmal.com", 99));
    }

    @Test
    void CambiarPlan() {
        gestor.registrarUsuarios("Ana", "ana@gmail.com", 1);
        assertTrue(gestor.cambiarPlan("Ana", 2));
        assertFalse(gestor.cambiarPlan("Tarok", 2));
    }

    @Test
    void ConsultarVelocidad() throws InvalidUsuarioException {
        gestor.registrarUsuarios("Ana", "ana@gmail.com", 3);
        assertEquals(500, gestor.consultarVelocidad("Ana"));
        assertThrows(InvalidUsuarioException.class, () -> {
            gestor.consultarVelocidad("Raul");
        });
    }

    @Test
    void ListarUsuarios() {
        gestor.registrarUsuarios("U1", "u1@gmqqail.com", 1);
        ArrayList<Usuario> lista = gestor.listarUsuarios();
        assertEquals(1, lista.size());
    }

    @Test
    void ComprobarPlan() {
        gestor.registrarUsuarios("Alex", "alex@gmail.com", 1);
        assertTrue(gestor.comprobarPlan("Alex"));
        assertFalse(gestor.comprobarPlan("Raul"));
    }
}