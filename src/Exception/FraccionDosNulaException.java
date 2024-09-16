package Exception;

public class FraccionDosNulaException extends RuntimeException{
	private static final long serialVersionUID = 1199067996687738158L;

	public FraccionDosNulaException() {
		System.out.println("La Fraccion Dos puede estar vacia");
	}

}
