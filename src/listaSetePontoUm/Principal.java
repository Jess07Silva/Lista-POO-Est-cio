package listaSetePontoUm;

public class Principal {

	public static void main(String[] args) {
		Frota car = new Frota();
		
		car.carro1.modelo = "fusca";
		car.caminhao1.marcha1.qtdMarcha = "2";
		System.out.println(car.carro1.modelo);
		System.out.println(car.caminhao1.marcha1.qtdMarcha);
	}

}
