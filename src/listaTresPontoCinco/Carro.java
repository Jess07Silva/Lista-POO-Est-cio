package listaTresPontoCinco;

public class Carro extends Transporte {
	public int quilometragem;

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		if (quilometragem > 0 && quilometragem < 999999) 
		this.quilometragem = quilometragem;
	}
	
	public void setVelocidade(int velocidade) {
		if (velocidade <=200) {
			this.velocidade = velocidade;
		}
	}
	
	
	
}
