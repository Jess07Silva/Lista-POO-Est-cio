package listaDozePontoDois;

public class TestaApi {

	public static void main(String[] args) {
		LinguagemDeProgramacao lp1 = new LinguagemDeProgramacao ("Empresa Robson", "Java");
		LinguagemDeProgramacao lp2 = new LinguagemDeProgramacao ("Empresa PJO", "C#");
		LinguagemDeProgramacao lp3 = new LinguagemDeProgramacao ("Empresa HDO", "CSS");
		lp1.imprime(true);
		lp2.imprime(true);
		lp3.imprime(true);
	}
}
