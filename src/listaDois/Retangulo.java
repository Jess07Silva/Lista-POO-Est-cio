package listaDois;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area(){
		double resultado = largura * altura;
		return resultado;
	}
	
	public double perimetro() {
		double resultado = (altura * 2) + (largura * 2);
		return resultado;
	}
	
	
}
