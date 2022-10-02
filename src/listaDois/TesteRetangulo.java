package listaDois;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo triangulo = new Retangulo(7.98, 12.12);
		System.out.printf("A area do retangulo é %.2f\n", triangulo.area()); 
		
		System.out.printf("O perimetro do retangulo é %.2f", triangulo.perimetro());
//		apos o ponto apenas dois algaritmos
	}

}
