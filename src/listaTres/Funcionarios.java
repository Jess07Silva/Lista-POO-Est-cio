package listaTres;

public class Funcionarios {
	private String nome;
	private static int matricula = 0;
	private int idade;
	private double salario;
	private int mpropria;
	private String setor;
	
	public Funcionarios(String nome, int idade, double salario, String setor) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setor;
		
		matricula++;
		mpropria = matricula;
		
	}
	
	public String toString() {
		return "Matricula :  " +  mpropria + " | " + "Nome = " + nome + " | " +  "Idade = " + idade + " | " + "Salario = " + salario + 
				" | " + "Setor : " + setor ;
	} 
	
}
