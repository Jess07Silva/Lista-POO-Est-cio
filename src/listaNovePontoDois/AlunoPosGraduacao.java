package listaNovePontoDois;

public class AlunoPosGraduacao extends AlunoGraduacao {
	public String nomeCursoPos;
	
	public void Aluno (String nomeAluno, String nomeCursoPos) {
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCursoPos;
		System.out.println(nomeAluno + " é um aluno da pos graduação do curso " + nomeCursoPos);
	}
}
