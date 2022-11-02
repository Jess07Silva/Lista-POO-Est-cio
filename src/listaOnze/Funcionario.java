package listaOnze;

public abstract class Funcionario extends PessoaFisica{
	public double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();
}
