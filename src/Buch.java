import java.util.Scanner;

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
    System.out.println("Die enthaltene MwSt beträgt: " + berechneMwSt(gibPreis()) + "€");
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
}


class Buchhaendler {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Buch buch1 = new Buch();
        System.out.print("Bitte den Namen des Autors eingeben: ");
        buch1.setAutor(scanner.nextLine());
        System.out.print("Bitte Titel des Buches eingeben: ");
        buch1.setTitel(scanner.nextLine());
        System.out.print("Bitte den Preis eingeben: ");
        buch1.setPreis(scanner.nextDouble());
        System.out.print("Bitte die Auflage eingeben: ");
        buch1.setAuflage(scanner.nextInt());

        buch1.gibInfo();


    }

}


