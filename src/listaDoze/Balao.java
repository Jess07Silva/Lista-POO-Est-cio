package listaDoze;

public class Balao extends TransporteAereo{
	private int pesoLargad;
	
	public boolean estaParado() {
		return true;
	}
	
	public void subir(int metros) {
		System.out.println("Subiu " + metros + " metros");
	}
	
	public void descer (int metros) {
		System.out.println("Desceu " + metros + " metros");
	}
	
	public void largarPeso (float peso) {
		System.out.println(peso + " kilos largados");
	}
	
	public void aquecerAr (float tempo) {
		System.out.println("Ar aquecido durante " + tempo + " segundos");
	}
}
