package listaQuatro;

public class Usado extends Imovel{
	private double precou;

	public Usado (double preco, String endereco) {
		super(preco, endereco);
		precou = preco - 20000;
		}
	
	public double getPrecou() {
		return precou;
	}

	public void setPrecou(double precou) {
		this.precou = precou;
	}
	
	public String toString() {
		return "Preço do Imovel = " + precou + " | Endereço = " + endereco;
	}
}
