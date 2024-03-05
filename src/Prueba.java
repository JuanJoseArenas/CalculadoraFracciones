
public class Prueba {

	public static void main(String[] args) {
		Fraccion fraccionUno = Fraccion.crear(0,2);
		Fraccion fraccionDos = Fraccion.crear(2, 2);
		Fraccion sumaUna= Calculadora.sumar(fraccionUno,fraccionDos);
		System.out.println(sumaUna);
		System.out.println(Calculadora.amplificar(sumaUna, 3));
		
		Mixto mixtoUno = Mixto.crear(45, 1, 3);
		Mixto mixtoDos = Mixto.crear(3, 2, 5);
		
		Mixto sumaMixto=Calculadora.sumar(mixtoUno, mixtoDos);
		System.out.println(sumaMixto);
		System.out.println(Calculadora.amplificar(sumaMixto, 3));
		System.out.println(Calculadora.restar(mixtoUno, mixtoDos));
		System.out.println(Calculadora.multiplicar(mixtoUno, mixtoDos));
		System.out.println(Calculadora.dividir(mixtoUno, mixtoDos));
		
		Fraccion mixtoAFraccion = Calculadora.convertirAFraccion(mixtoUno);
		System.out.println("El numero Mixto : "+ mixtoUno+" convertido a fraccion da: "+mixtoAFraccion);
		Mixto fraccionAMixto = Calculadora.convertirAMixto(fraccionUno);
		System.out.println("La fraccion : "+ fraccionUno+" convertido a Mixto da: "+fraccionAMixto);
        System.out.println("Fraccion Propia: " + mixtoAFraccion.toString());
        System.out.println("Fraccion Mixta: " + fraccionAMixto.toString());
        System.out.println(Calculadora.esPropia(fraccionUno));
		System.out.println(fraccionAMixto.toString());
	}
}