package listaDoze;

public abstract class TransporteAereo extends Transporte {
	private int altitudeAtual;
	
	public abstract void subir(int metros);
	
	public abstract void descer (int metros);
}


