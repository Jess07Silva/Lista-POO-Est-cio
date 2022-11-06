package listaDozePontoDois;

public class LinguagemDeProgramacao extends Modelo implements Imprimivel {
	private String nomeDaLinguagem;

	public LinguagemDeProgramacao(String nomeDaEmpresa, String nomeDaLinguagem) {
		super(nomeDaEmpresa);
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public void setnomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}

	public void imprime(boolean valor) {
		if (valor == true) {
			System.out.println(toString());
		}
	}
	public String toString(){
		return getNomeDaEmpresa() + ", " + nomeDaLinguagem;
	}
	
}
