package Exception;

public class DenominadorNoValidoException extends RuntimeException{
	private static final long serialVersionUID = -92334584227506549L;

	public DenominadorNoValidoException() {
        System.out.println("El Denominador no puede ser cero");
    }
}
