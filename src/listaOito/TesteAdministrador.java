package listaOito;

public class TesteAdministrador {

	public static void main(String[] args) {
		Administrador ad1 = new Administrador ("Carlos", "Rua lgbt, 24", "2121-1111", 1200, 2, 200);
		
		System.out.println(ad1.getNome() + "\n");
		System.out.println(ad1.calcularSalario());

	}

}
