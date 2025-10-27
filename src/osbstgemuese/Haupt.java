package osbstgemuese;

public class Haupt {
	public static void main(String[] args) {
		Apfel boskop = new Apfel(3);
		Apfel pinkLady = new Apfel(5);
		Apfel elster = new Apfel(2);
		
		Birne birne1 = new Birne();
		Birne birne2 = new Birne();
		
        Obstkorb<Apfel> korb = new Obstkorb<Apfel>(5);
        //korb.einpacken(brine);
        korb.einpacken(pinkLady);
        korb.einpacken(boskop);
        
        Obstkorb<Birne> birnen = new Obstkorb<Birne>(3);
        birnen.einpacken(birne1);
        birnen.einpacken(birne2);
        
	}
}
