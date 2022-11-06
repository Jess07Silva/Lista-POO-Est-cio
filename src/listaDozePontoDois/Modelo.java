package listaDozePontoDois;

public abstract class Modelo{
	private String nomeDaEmpresa;
	
	public Modelo(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
		
	}
	
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	
	public abstract String toString();
	
	
}
