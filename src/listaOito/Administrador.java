package listaOito;

public class Administrador extends Empregado {
	public double ajudaDeCusto;
	
	public double calcularSalario () {
		return salarioBase + ajudaDeCusto;
	}
	
	public Administrador (String n, String e, String nu, double salarioBase, double imposto, double ajudaDeCusto) {
		super(n, e, nu, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}	
