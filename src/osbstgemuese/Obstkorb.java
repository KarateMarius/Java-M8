package osbstgemuese;

public class Obstkorb<Sorte extends Obst> {
    private final Object[] obst;

    public Obstkorb(int platz) {

        obst = new Object[platz];

    }

    public void einpacken(Sorte frucht) {

        for (int i = 0; i < obst.length; i++) {

            if (obst[i] == null) {

                obst[i] = frucht;
                return;
            }
        }
    }
    
    
    public Sorte getItem(int index){
        return (Sorte) obst[index];
    }

    public double getGewicht() {

        double gesamtGewicht = 0;
        for (Object dasObst : obst) {

            gesamtGewicht += ((Obst)dasObst).getGewicht();
        }
        return gesamtGewicht;
    }
}