package listaQuatroPontoCinco;

public class Conta {
	public double saldo;
	
	public void depositar (double valor) {
		saldo += valor;
	}
	
	public void sacar (double valor) {
		saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
