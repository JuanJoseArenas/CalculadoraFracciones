package Exception;

public class FraccionNulaException extends RuntimeException{
	public FraccionNulaException() {
		System.out.println("La Fraccion no puede estar vacia");
	}

}
