package osbstgemuese;

public class Birne extends Obst implements Vergleichbar {
	private int groesse;
	private String farbe;
	
	@Override
	public int getGroesse() {
		return this.groesse;
	}
	
	@Override
	public int vergleichen(Vergleichbar other) {
		if(other.getGroesse() < 5)
			return 1;
		return -1;
	}
}
