package Exception;

public class MixtoDosNuloException extends RuntimeException{
	private static final long serialVersionUID = -8012414754250018896L;

	public MixtoDosNuloException() {
		System.out.println("La Fraccion Dos puede estar vacia");
	}

}
