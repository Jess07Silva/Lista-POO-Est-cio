package listaUmPontoSeis;

public class Carro extends Veiculo {
	private double combustivel;
	
	public Carro () {
	}
	
	public Carro (String chassi, double velocidadeMaxima , double combustivel){
		super(chassi, velocidadeMaxima);
		this.combustivel = combustivel;
	}
	
	public void trocarOleo (){
		System.out.println("O veiculo TIPO_DO_VEICULO " + getChassi() + " trocou o oleo");
	}
}	
