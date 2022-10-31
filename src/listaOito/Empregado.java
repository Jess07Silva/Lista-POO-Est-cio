package listaOito;

public class Empregado extends Pessoa {
	public static int codSetor;
	public double salarioBase, imposto;
	
	public double calcularSalario () {
		return salarioBase - (salarioBase * (imposto/100));
	}

	public Empregado (String n, String e, String nu, double salarioBase, double imposto) {
		super(n, e, nu);
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public static int getCodSetor() {
		return codSetor;
	}
	
}
