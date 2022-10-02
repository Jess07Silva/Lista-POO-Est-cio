package doisPontoCinco;

public class EquipamentoSonoro extends Equipamento {
	public short volume;
	public boolean stereo;
	
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		this.volume = volume;
	}
	
	public void mono (){
		stereo = true;
	}
	
	public void stereo (){
		stereo = false;
	}
	
	public void liga() {
		ligado = true;
		volume = 5;
	}
	
}
