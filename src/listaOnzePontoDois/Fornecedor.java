package listaOnzePontoDois;

public class Fornecedor implements Dao {
	private String cpnj;
	private String razaoSocial;
	
	public void inserir () {
		System.out.println("Cliente inserido");
	}
	public void excluir() {
		System.out.println("Cliente excluido");
	}
	public void localizar () {
		System.out.println("Cliente localizado");
	}
}
