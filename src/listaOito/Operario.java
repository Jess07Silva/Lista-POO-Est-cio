package listaOito;

public class Operario extends Empregado {
	public double valorProducao, valorComissao;
	
	public double calcularSalario () {
		return salarioBase + valorComissao;
	}
	
	public Operario (String n, String e, String nu, double salarioBase, double imposto, double valorComissao, double valorProducao) {
		super(n, e, nu, salarioBase, imposto);
		this.valorComissao = valorComissao;
		this.valorProducao = valorProducao;
	}
	
}
