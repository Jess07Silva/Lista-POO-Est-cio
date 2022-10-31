package listaUmPontoQuatro;

public class UsarVendas {

	public static void main(String[] args) {
		Vendas v1 = new Vendas ("Robson", 24.90, "01/10");
		Vendas v2 = new Vendas("Bianca", 37.20, "12/09");
		Vendas v3 = new Vendas("Chris", 90, "26/02");
		
		System.out.println(v1.toString() + v2.toString() + v3.toString());
	}

}
