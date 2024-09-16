package Exception;

public class AmplificadorCeroException extends RuntimeException{
	private static final long serialVersionUID = 2894681281404192134L;

	public AmplificadorCeroException() {
		System.out.println("EL numero amplificador no puede ser cero");
	}

}
