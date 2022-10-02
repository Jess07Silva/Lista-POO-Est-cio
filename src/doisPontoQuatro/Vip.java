package doisPontoQuatro;

public class Vip extends Ingresso {
	public final static double adicional = 20;
	
	public Vip(double valor) {
		super(valor + adicional);
	}
	
	public double retornaValor() {
		return valor + adicional;
	}
}
