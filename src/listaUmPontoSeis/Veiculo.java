package listaUmPontoSeis;

public class Veiculo {
	private String chassi;
	private double velocidadeMaxima;
	private static int cont;
	
	public Veiculo () {	
	}
	
	public Veiculo (String chassi, double velocidadeMaxima) {
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		cont ++;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static int getCont() {
		return cont;
	}
	
	public void limpar(){
		System.out.println("O veiculo TIPO_DO_VEICULO " + chassi + " está sendo limpo");
	}
	
	public void ajustar() {
		System.out.println("O veiculo TIPO_DO_VEICULO " + chassi + " está sendo ajustado");
	}
		
	public void incrementarVeloc (double valor) {
		velocidadeMaxima += valor;
		System.out.println("O veiculo TIPO_DO_VEICULO " + chassi + " agora tem " +
		velocidadeMaxima + " km/h de velocidade");
	} 
	
}
