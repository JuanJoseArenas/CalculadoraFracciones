package Exception;

public class MixtoUnoNuloException extends	RuntimeException{
	private static final long serialVersionUID = -8673312815229828597L;

	public MixtoUnoNuloException(){
		System.out.println("El mixto no puede estar vacio");
	}

}
