package listaOito;

public class Vendedor extends Empregado{
	public double valorVendas, comissao;
	
	public double calcularSalario () {
		return salarioBase + comissao;
	}
	
	public Vendedor (String n, String e, String nu, double salarioBase, double imposto, double comissao, double valorVendas) {
		super(n, e, nu, salarioBase, imposto);
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}
}
