package Exception;

public class FraccionUnoNulaException extends RuntimeException{
	public FraccionUnoNulaException() {
		System.out.println("La Fraccion Uno no puede estar vacia");
	}

}
