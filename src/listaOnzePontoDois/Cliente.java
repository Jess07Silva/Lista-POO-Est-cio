package listaOnzePontoDois;

public class Cliente implements Dao {
	private int codigo;
	private String nome;
	
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
