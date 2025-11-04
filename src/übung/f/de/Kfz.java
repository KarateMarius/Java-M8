package übung.f.de;

public class Kfz {
    private String farbe;
    private int gewicht;
    private String marke;
    private Kennzeichen kennzeichen;
    private int anzahlRaeder;

    public int gibAchslastDurchschnitt (){


        return 5;
    }

    public void gibInfos(){

        System.out.println(farbe + " " + gewicht + " " + marke  + " " + kennzeichen.gibKennzeichen() + " " + anzahlRaeder );


    }

    public Kfz (String farbe, int gewicht, String marke, String a, String b, int c, int anzahlRaeder){
        this.farbe = farbe;
        this.gewicht = gewicht;
        this.marke = marke;
        this.kennzeichen = new Kennzeichen(a, b, c);
        this.anzahlRaeder = anzahlRaeder;

    }
}
