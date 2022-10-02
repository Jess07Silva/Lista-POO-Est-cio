package listaCinco;

public class Funcionarios extends Pessoa {
	public int matricula;
	public double salario;

	public Funcionarios (double salario) {
		if (salario > 0) {
			this.salario = salario;
		}
		else {
			System.out.println("Salario invalido");
		}
	}
	
	public Funcionarios (String nome, String sobrenome, double salario) {
		super (nome, sobrenome);
		if (salario > 0) {
			this.salario = salario;
		}
		else {
			System.out.println("Salario invalido");
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double getppsalario () {
		return this.salario * 0.6;
	}
	
	public double getspsalario (){
		return this.salario * 0.4;
	}
}
