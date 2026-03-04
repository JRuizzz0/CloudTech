package org.example;

import java.util.HashMap;
import java.util.Map;

public class Gestion_de_partidas {
    private Map<String, Integer> numPartidasAct;

    public void actualizarPartidas() {
        if (numPartidasAct.isEmpty()) {
            System.out.println("No se encontraron partidas activas");
        }else{
            for (Map.Entry<String, Integer> entry : numPartidasAct.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());

            }
        }

    }

    public void añadirCatalogo() {


    }

    public String buscarJuegos() {

        return "";
    }

    public void comprobarCatalogo() {

    }
}

