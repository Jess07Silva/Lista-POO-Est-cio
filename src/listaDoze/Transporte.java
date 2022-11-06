package listaDoze;

public abstract class Transporte {
	private String nome;
	private int numPassageiro;
	private int velocidadeAtual;
	
	public abstract boolean estaParado();
	
	public void setVelocidadeAtual (int velocidadeAtual) {
		 this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeAtual (){
		return velocidadeAtual;
	}
}
