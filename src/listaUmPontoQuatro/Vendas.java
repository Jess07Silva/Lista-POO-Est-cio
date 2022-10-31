package listaUmPontoQuatro;

public class Vendas {
	private String cliente, data;
	private double valor;
	private int np;
	private static int numero;
	
	public Vendas(String nome, double valor, String data){
		cliente = nome;
		this.data = data;
		this.valor = valor;
		numero++;
		np = numero;
	}
	
	public String toString() {
		return "Vendas \n" + "Cliente = " + cliente + " |  data = " + data + 
				" | valor = " + valor + " | numero = " + np + "\n";
	}
	
	
}
