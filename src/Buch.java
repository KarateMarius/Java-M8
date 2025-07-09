import java.util.Scanner;

public class Buch {

    private String autor;
    private String titel;
    private double preis;
    private int auflage;

    // nicht Folien relevant
    private Scanner sc = new Scanner(System.in);


    public void gibInfo(){

    System.out.println("Der Autor heißt: " + autor);
    System.out.println("Der Titel lautet: " + titel);
    System.out.println("Es kostet: " + preis + "€");
    System.out.println("Es ist die " + auflage + ". Auflage");
    System.out.printf("Die enthaltene MwSt beträgt: %.2f€\n", berechneMwSt(gibPreis()));
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

        double mwst = 0.07;
        buchpreis = buchpreis * mwst;
        return Math.round(buchpreis * 100.0) / 100.0;
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

        if (preis < 0) preis = 0;
        this.preis = preis;
    }

    // nicht Folien relevant
    public void datenEingabe(){

        System.out.print("Bitte den Namen des Autors eingeben: ");
        setAutor(sc.nextLine());
        System.out.print("Bitte Titel des Buches eingeben: ");
        setTitel(sc.nextLine());
        System.out.print("Bitte den Preis eingeben: ");
        setPreis(sc.nextDouble());
        System.out.print("Bitte die Auflage eingeben: ");
        setAuflage(sc.nextInt());

    }

    public Buch(String autor, String titel, double preis,  int auflage){

        this.autor = autor;
        this.titel = titel;
        this.preis = preis;
        this.auflage = auflage;
    }



}


class Buchhaendler {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Buch buch1 = new Buch("Marius", "VIT", 23, 23);
        buch1.gibInfo();


    }

}


