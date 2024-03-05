package Exception;

public class NumeroAmplificarException extends RuntimeException{
	public NumeroAmplificarException() {
		System.out.println("EL numero amplificador no puede ser cero");
	}

}
