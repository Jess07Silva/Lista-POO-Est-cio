package listaOito;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor ("Carlos", "Rua lgbt, 24", "2121-1111", 1200, 2, 300, 20);
		
		System.out.println(v1.getNome() + "\n");
		System.out.println(v1.calcularSalario());


	}

}
