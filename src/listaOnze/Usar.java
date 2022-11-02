package listaOnze;

public class Usar {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Diretor d1 = new Diretor();
		Cliente c1 = new Cliente();

		c1.nome = "Robson";
		c1.saldo = 30;
		c1.deposita(10);

		System.out.println("Cliente " + c1.nome + " possui saldo " + c1.saldo + " reais");
	}
}
