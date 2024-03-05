package Exception;

public class DenominadorNoValidoException extends RuntimeException{
	public DenominadorNoValidoException() {
        System.out.println("El Denominador no puede ser cero");
    }
}
