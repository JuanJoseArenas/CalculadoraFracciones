import Exception.DenominadorNoValidoException;
import Exception.NumeradorNoValidoException;

public class Fraccion {
	
	private long numerador;
	private long denominador;
	
	protected Fraccion(long numerador, long denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
	}
	
	public static Fraccion crear(long numerador, long denominador) {
		return new Fraccion(numerador, denominador);
	}

	public long getNumerador() {
		return numerador;
	}

	protected void setNumerador(long numerador) {
		if(numerador == 0) {
			throw new NumeradorNoValidoException();
		}
		this.numerador = numerador;
	}

	public long getDenominador() {
		return denominador;
	}
	
	protected void setDenominador(long denominador) {
		this.denominador = denominador;
		if (this.denominador == 0 ) {
			throw new DenominadorNoValidoException();
			
		}else if(this.denominador <0) {
			this.denominador = denominador*-1;
			this.numerador = numerador *-1;
		}
	}

	@Override
	public String toString() {
		return getNumerador() + " / " + getDenominador();
	}	

}