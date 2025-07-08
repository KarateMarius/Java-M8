public class Buch {

    private String autor;
    private String titel;
    private double preis;
    private int auflage;

    public void gibInfo(){

    System.out.println("Der Autor heißt: " + autor);
    System.out.println("Der Titel lautet: " + titel);
    System.out.println("Es kostet: " + preis + "€");
    System.out.println("Es ist die " + auflage + ". Auflage");
    System.out.println("Der Preis mit MwSt ist: " + berechneMwSt(gibPreis()) + "€");
    }

    public String gibAutor(){

        return autor;

    }

    public String gibTitel(){

        return titel;
    }

    public double gibPreis(){

        return preis;
    }

    public int gibAuflage(){

        return auflage;
    }

    public double berechneMwSt(double buchpreis){

        double mwst = 1.07;
        buchpreis = buchpreis * mwst;

        return buchpreis;
    }

    public void setAuflage(int auflage){

        this.auflage = auflage;
    }

    public void setAutor(String autor){

        this.autor = autor;

    }

    public void setTitel(String titel){

        this.titel = titel;
    }


    public void setPreis(double preis){

        this.preis = preis;
    }
}


class Buchhaendler {

    public static void main (String[] args){

        Buch buch1 = new Buch();

        buch1.setAutor("Marius");
        buch1.setTitel("Was geht hier ab");
        buch1.setPreis(25);
        buch1.setAuflage(3);

        buch1.gibInfo();


    }

}


