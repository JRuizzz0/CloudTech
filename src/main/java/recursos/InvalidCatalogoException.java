package recursos;
//excepcion partidas
public class InvalidCatalogoException extends RuntimeException {
    public InvalidCatalogoException(String message) {
        super(message);
    }
}
