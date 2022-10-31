package listaOito;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado e1 = new Empregado ("Robson", "Rua lgbt, 24", "2121-1111", 1200, 2);
		
		System.out.println(e1.getNome() + "\n");
		System.out.println(e1.calcularSalario());
		

	}

}
