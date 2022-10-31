package listaTresPontoCinco;

public class Transporte {
	public boolean ligado;
	public int velocidade;
	
	public void liga() {
		ligado = true;
	}
	
	public void desliga () {
		ligado = false;
		velocidade = 0;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade > 0 ) {
		this.velocidade = velocidade;
		}
	}
	
	
	
}
