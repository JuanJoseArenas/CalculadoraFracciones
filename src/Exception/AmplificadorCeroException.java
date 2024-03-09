package Exception;

public class AmplificadorCeroException extends RuntimeException{
	public AmplificadorCeroException() {
		System.out.println("EL numero amplificador no puede ser cero");
	}

}
