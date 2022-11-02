package listaOnze;

public class Diretor extends Funcionario implements Autenticavel {
	public int senha;

	public double getBonificacao() {
		return salario * 0.25;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
