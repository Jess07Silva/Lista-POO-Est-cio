package listaDoze;

public class Carro extends TransporteTerreste implements Motorizado, Conduzivel{
	private int numCilindros;
	
	public boolean estaParado() {
		return true;
	}
	
	public void estacionar() {
		System.out.println("Veiculo estacionado");
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
	
	public void embreiar () {
		System.out.println("Embreagem ativada");
	}
}
