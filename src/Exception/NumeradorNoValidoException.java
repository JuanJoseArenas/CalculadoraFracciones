package Exception;

public class NumeradorNoValidoException extends RuntimeException{
	public NumeradorNoValidoException() {
		System.out.println("El Numerador no puede ser cero");
	}

}