package listaOnze;

public abstract class PessoaFisica extends Pessoa {
	public String cpf;
	
	public String getCpf () {
		return cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
}
