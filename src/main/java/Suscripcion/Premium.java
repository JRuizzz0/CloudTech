package Suscripcion;


import java.util.ArrayList;

public class Premium extends Plan {

    public Premium() {
        super();

        nombre = "Premium";
        partidasSimul = 4;
        catalogo = new ArrayList<>();
        velocidad = 500;

    }

}