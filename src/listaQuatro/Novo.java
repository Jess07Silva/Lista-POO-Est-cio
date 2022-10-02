package listaQuatro;

public class Novo extends Imovel {
	private double precon;
	
	public Novo (double preco, String endereco) {
	super(preco, endereco);
	precon = preco + 20000;
	}
	
	public double getPrecon() {
		return precon;
	}

	public void setPrecon(double precon) {
		this.precon = precon;
	}

	public String toString() {
		return "Preço do Imovel = " + precon + " | Endereço = " + endereco;
	}
}
