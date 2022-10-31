package listaNovePontoDois;

public class AlunoGraduacao extends AlunoEscola{
	public String nomeCurso;
	
	public void Aluno (String nomeAluno, String nomeCurso) {
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		System.out.println(nomeAluno + " é um aluno da graduação do curso " + nomeCurso);
	}
}
