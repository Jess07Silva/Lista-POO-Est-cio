package listaCinco;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Jose", "Manoel");
		Funcionarios f1 = new Funcionarios ("Leandro", "Charles", 2000);
		Professor pf1 = new Professor ("Rita", "Cassia", 500);
		
		System.out.println("Nome = " + p1.getNome() + "\nSobrenome = " + p1.getSobrenome() + "\n \n");
		System.out.println("Nome = " + f1.getNome() + "\nSobrenome = " + f1.getSobrenome()
		+ "\nPrimeira parcela do salario = " + f1.getppsalario() + "\nSegunda parcela do salario = " + f1.getspsalario() + "\n\n");
		System.out.println("Nome = " + pf1.getNome() + "\nSobrenome = " + pf1.getSobrenome() + 
				"\nPrimeira parcela do salario = " + pf1.getppsalario() + "\nSegunda parcela do salario = " + pf1.getspsalario());
	}

}
