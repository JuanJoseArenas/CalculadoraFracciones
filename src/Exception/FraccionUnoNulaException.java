package Exception;

public class FraccionUnoNulaException extends RuntimeException{
	private static final long serialVersionUID = -16586851388163711L;

	public FraccionUnoNulaException() {
		System.out.println("La Fraccion Uno no puede estar vacia");
	}

}
