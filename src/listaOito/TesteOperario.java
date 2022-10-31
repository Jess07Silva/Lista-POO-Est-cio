package listaOito;

public class TesteOperario {

	public static void main(String[] args) {
		Operario o1 = new Operario ("Carlos", "Rua lgbt, 24", "2121-1111", 1200, 2, 300, 20);
		
		System.out.println(o1.getNome() + "\n");
		System.out.println(o1.calcularSalario());

	}

}
