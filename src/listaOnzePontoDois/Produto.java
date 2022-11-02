package listaOnzePontoDois;

public class Produto implements Dao, Estoque{
	private int num;
	private String descricao;
	
	public void inserir () {
		System.out.println("Cliente inserido");
	}
	public void excluir() {
		System.out.println("Cliente excluido");
	}
	public void localizar () {
		System.out.println("Cliente localizado");
	}
	public void baixar () {
		System.out.println("Baixando estoque");
	}
}
