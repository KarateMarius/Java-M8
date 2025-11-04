package übung.f.de;

public class Kennzeichen {
    private String kreis;
    private String buchstabenkombination;
    private int zahl;

    public int setRandomZahl(){

        return 2;
    }

    public String gibKennzeichen(){
        String k = (kreis + " " + buchstabenkombination + " " + zahl);
        return k;
    }

    public Kennzeichen (String kreis, String buchstabenkombination, int zahl) {
        this.kreis = kreis;
        this.buchstabenkombination = buchstabenkombination;
        this.zahl = zahl;
    }
}
