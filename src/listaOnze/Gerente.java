package listaOnze;

public class Gerente extends Funcionario implements Autenticavel{
	public int senha;
	public int numFuncionariosGerenciados;
	
	public boolean autentica(int senha){
		if (this.senha == senha) {
			return true;
		}
		else{
			return false;
		}
	}
	public double getBonificacao() {
		return salario * 0.1;
	}
}
