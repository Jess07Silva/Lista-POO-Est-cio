package listaTres;

public class UsarFuncionarios {

	public static void main(String[] args) {
		
		Setor s1 = new Setor ("Administração");
		Setor s2 = new Setor ("TI");
		Setor s3 = new Setor("Contabilidade");
		Funcionarios f1 = new Funcionarios("Robson", 28, 4000, s3.nome); 
		Funcionarios f2 = new Funcionarios("Matheus", 33, 3000, s2.nome); 
		Funcionarios f3 = new Funcionarios("Vitoria", 18, 8000, s1.nome); 
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}
}
