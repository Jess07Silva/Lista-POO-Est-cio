package listaQuatroPontoCinco;

public class UsarConta {

	public static void main(String[] args) {
		Poupança p1 = new Poupança ();
		p1.setSaldo(50);
		p1.sacar(10);
		
		System.out.println(p1.getSaldo());
	}
}
