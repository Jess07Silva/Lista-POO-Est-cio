package listaTress;

public class Vendas {
	private double preco;
	
	public Vendas(double preco) {
		double desconto = 30;
		desconto = desconto/100 * preco;
		this.preco = preco - desconto;
	}
	
	public Vendas (double preco, double desconto) {
	
		if (desconto == 1) {
			desconto = 10;
		}	
		else {
			desconto = 30;
		}
		desconto = desconto/100 * preco;
		this.preco = preco - desconto;
		
	}
	
	public String toString(){
		return "Preço da venda = " + preco;
	}
}
