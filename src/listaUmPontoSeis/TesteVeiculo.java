package listaUmPontoSeis;

public class TesteVeiculo {

	public static void main(String[] args) {
		
	Bicicleta b1 = new Bicicleta (10, "Robson", 50);
	Bicicleta b2 = new Bicicleta (11, "Fusca", 20);
	Bicicleta b3 = new Bicicleta (20, "Ferrari", 30);
	Carro c1 = new Carro ("Lucas", 35, 20);
	Carro c2 = new Carro ("Fiu", 40, 15);

	b1.ajustar();
	b1.limpar();
	b2.ajustar();
	b2.limpar();
	b3.ajustar();
	b3.limpar();
	c1.limpar();
	c1.ajustar();
	c2.limpar();
	c2.ajustar();
	b1.aumentarMacha(5);
	b2.aumentarMacha(7);
	b3.aumentarMacha(10);
	c1.incrementarVeloc(3);
	c2.incrementarVeloc(5);
	c1.trocarOleo();
	c2.trocarOleo();
	System.out.println(Veiculo.getCont());
	}
}
