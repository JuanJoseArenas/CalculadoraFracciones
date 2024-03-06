import Exception.FraccionNulaException;
import Exception.MixtoNuloException;
import Exception.NumeroAmplificarException;

public class Calculadora {

	private Calculadora() {
		super();
	}

	private static long minimoComunDivisor(Fraccion fraccion) {
		if(fraccion ==  null) {
			throw new FraccionNulaException();
		}

		long numerador = fraccion.getNumerador();
		long denominador = fraccion.getDenominador();
		while (denominador != 0) {
			long aux = denominador;
			denominador = numerador % denominador;
			numerador = aux;
		}
		return numerador;
	}

	private static Fraccion simplificar(Fraccion fraccion) {
		if (fraccion == null) {
			throw new FraccionNulaException();
		}
		long numerador = fraccion.getNumerador() / minimoComunDivisor(fraccion);
		long denominador = fraccion.getDenominador() / minimoComunDivisor(fraccion);
		return Fraccion.crear(numerador, denominador);
	}

	public static Fraccion amplificar(Fraccion fraccion, long factor) {
		if (fraccion == null) {
			throw new FraccionNulaException();
		}
		if (factor == 0) {
			throw new NumeroAmplificarException();
		}

		long nuevoNumerador = fraccion.getNumerador() * factor;
		long nuevoDenominador = fraccion.getDenominador() * factor;
		return simplificar(Fraccion.crear(nuevoNumerador, nuevoDenominador));
	}

	public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos) {
		if (fraccionUno == null || fraccionDos == null) {
			throw new FraccionNulaException();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
				+ fraccionUno.getDenominador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) {
		if (fraccionUno == null || fraccionDos == null) {
			throw new FraccionNulaException();
		}
		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
				- fraccionUno.getDenominador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) {
		if (fraccionUno == null || fraccionDos == null) {
			throw new FraccionNulaException();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) {
		if (fraccionUno == null || fraccionDos == null) {
			throw new FraccionNulaException();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Mixto sumar(Mixto mixtoUno, Mixto mixtoDos) {
		if (fraccionUno == null || fraccionDos == null) {
			throw new FraccionNulaException();
		}
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = sumar(fraccionUno, fraccionDos);

		return convertirAMixto(resultado);
	}

	public static Mixto restar(Mixto mixtoUno, Mixto mixtoDos) {
		if (mixtoUno == null || mixtoDos == null) {
			throw new MixtoNuloException();
		}
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = restar(fraccionUno, fraccionDos);

		return convertirAMixto(resultado);
	}

	public static Mixto multiplicar(Mixto mixtoUno, Mixto mixtoDos) {
		if (mixtoUno == null || mixtoDos == null) {
			throw new MixtoNuloException();
		}
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = multiplicar(fraccionUno, fraccionDos);

		return convertirAMixto(resultado);
	}

	public static Mixto dividir(Mixto mixtoUno, Mixto mixtoDos) {
		if (mixtoUno == null || mixtoDos == null) {
			throw new MixtoNuloException();
		}
		
		Fraccion fraccionUno = convertirAFraccion(mixtoUno);
		Fraccion fraccionDos = convertirAFraccion(mixtoDos);

		Fraccion resultado = dividir(fraccionUno, fraccionDos);

		return convertirAMixto(resultado);
	}

	public static Mixto convertirAMixto(Fraccion fraccionUno) {
		if (fraccionUno == null) {
			throw new FraccionNulaException();
		}
		
		long parteEntera = fraccionUno.getNumerador() / fraccionUno.getDenominador();
		long numerador = fraccionUno.getNumerador() % fraccionUno.getDenominador();
		long denominador = fraccionUno.getDenominador();
		return Mixto.crear(parteEntera, numerador, denominador);
	}

	public static Fraccion convertirAFraccion(Mixto fraccionMixta) {
		if (fraccionMixta == null) {
			throw new MixtoNuloException();
		}
		long numerador = (fraccionMixta.getParteEntera() * fraccionMixta.getDenominador())
				+ fraccionMixta.getNumerador();
		long denominador = fraccionMixta.getDenominador();
		return Fraccion.crear(numerador, denominador);
	}

	public static boolean esPropia(Fraccion fraccionUno) {
		if(fraccionUno.getNumerador() < fraccionUno.getDenominador()) {
			return true;
		}
		return false;
	}

}
