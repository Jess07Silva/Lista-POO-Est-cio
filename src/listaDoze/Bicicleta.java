package listaDoze;

public class Bicicleta	extends TransporteTerreste implements Conduzivel {
	private int numRaios;
	
	public boolean estaParado() {
		return true;
	}
	
	public void estacionar() {
		System.out.println("Veiculo estacionado");
	}
	
	public void curvar(float angulo) {
		System.out.println("Curvou " + angulo + " angulos");
	}
	
	public void pedalar () {
		setVelocidadeAtual(getVelocidadeAtual()+1);
		System.out.println("Pedalou " + getVelocidadeAtual() + " metros");
	}
}
