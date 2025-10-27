package osbstgemuese;

public class Apfel extends Obst implements Vergleichbar, Essbar {
	private final int groesse;
	private int phWert;
	
	public Apfel(int groesse) {
		this.groesse = groesse;
	}
	
	@Override
	public int vergleichen(Vergleichbar other) {
		if(this.groesse > other.getGroesse()) {
			return -1;
		}
		if(this.groesse == other.getGroesse()) {
			return 0;
		}
		return 1;
	}
	
	@Override
	public int getGroesse() {
		return this.groesse;
	}

	@Override
	public void reinbeissen() {
		System.out.println("Lecker!");
	}
}
