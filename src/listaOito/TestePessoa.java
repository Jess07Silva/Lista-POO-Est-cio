package listaOito;

public class TestePessoa {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor ("Alex", "Rua dos bois 22", "4004-2902", 1000, 200);
		
		System.out.println(f1.getNome() + "\n");
		System.out.println(f1.obterSaldo());
	}
}
