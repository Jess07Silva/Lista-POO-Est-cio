package listaOito;

public class Pessoa {
	public String nome, endereco, numero;
	
	public Pessoa (String n, String e, String nu) {
		nome = n;
		endereco = e;
		numero = nu;
	}
	
	public Pessoa (String n, String nu) {
		nome = n;
		numero = nu;
	}
	
	public Pessoa (String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumero () {
		return numero;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
}
