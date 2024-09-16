package Exception;

public class NumeradorNoValidoException extends RuntimeException{
	private static final long serialVersionUID = 1217732311591175382L;

	public NumeradorNoValidoException() {
		System.out.println("El Numerador no puede ser cero");
	}

}