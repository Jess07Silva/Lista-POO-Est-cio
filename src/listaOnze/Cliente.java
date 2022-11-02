package listaOnze;

public class Cliente extends PessoaFisica implements Autenticavel {
	public double saldo, limite, chequeEspecial;
	public int senha;

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
