package recursos;
//excepcion usuario
public class InvalidUsuarioException extends RuntimeException {
    public InvalidUsuarioException(String message) {
        super(message);
    }
}
