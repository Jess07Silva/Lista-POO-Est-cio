package listaDoze;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel{
	private int numMotores;
	
	public boolean estaParado() {
		return true;
	}
	
	public void subir(int metros) {
		System.out.println("Subiu " + metros + " metros");
	}
	
	public void descer (int metros) {
		System.out.println("Desceu " + metros + " metros");
	}
	
	public void curvar(float angulo) {
		System.out.println("Curvou " + angulo + " angulos");
	}
	
	public void abastecer(int qtdLitros) {
		System.out.println("Abasteceu " + qtdLitros + " litros");
	}
	
	public void ligarMotor () {
		System.out.println("Motor ligado");
	}
}
