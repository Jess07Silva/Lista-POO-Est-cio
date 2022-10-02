package aulas;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoas pessoas1 = new Pessoas("Robin", 22);
		Pessoas pessoas2 = new Pessoas ("Perseu", 17);
		Pessoas pessoas3 = new Pessoas ("Gaia", 50);
		
//		set modifica a informação, get puxa a informação
		pessoas1.setNome("Maya");
		pessoas3.setIdade(100);
		
		System.out.println(pessoas1.toString());
		System.out.println(pessoas2.toString());
		System.out.println(pessoas3.toString());
	}
}
