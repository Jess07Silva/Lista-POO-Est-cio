package listaUmPontoSeis;

public class Bicicleta extends Veiculo {
	private int nrMarchas;
	
	public Bicicleta () {
	}
	
	public Bicicleta (int nrMarchas, String chassi, double velocidadeMaxima) {
		super(chassi, velocidadeMaxima);
		this.nrMarchas = nrMarchas; 
	}
	
	public void aumentarMacha (int valor) {
		nrMarchas += valor;
		double velocidadetemp = (nrMarchas/super.getVelocidadeMaxima()) * 100;
		super.incrementarVeloc(velocidadetemp);
	}
	
}
