package listaCinco;

public class Professor extends Funcionarios {
	
	public Professor(double salario) {
		super (salario);
	}
	
	public Professor (String nome, String sobrenome, double salario) {
		super (nome, sobrenome, salario);
	}
	
	public double getppsalario (){
		return this.salario;
	}
	
	public double getspsalario () {
		return 0;
	}
}
