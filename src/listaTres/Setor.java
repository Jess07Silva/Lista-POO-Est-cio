package listaTres;

public class Setor {
	private int codigo;
	public String nome;
	private static int cont = 0;
	
	
	public Setor (String nomeA) {
		nome = nomeA;
		cont++;
		codigo = cont;
	}
}
