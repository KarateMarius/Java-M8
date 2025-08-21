import java.util.List;

public class Autocontainer {

    private String zielOrt;
    private int zaehlerAutos;
    private int anzahlAutos;
    private List<Object> Auto;


    public void addAuto(Auto auto) {


        if (zaehlerAutos < anzahlAutos) {

            Auto.add(auto);
            zaehlerAutos++;
        }
    }

    public void printAutoliste(Auto auto, Autocontainer container) {

        System.out.println(container.zielOrt);

        System.out.println(auto.toString());
    }

}

class Auto {

    private String name;
    private String hersteller;
    private String farbe;
    private boolean cabriolet;
    private double preis;


    public void gibInfos(){

        System.out.println("Name: " + name);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Farbe: " + farbe);
        System.out.println("Cabriolet: " + cabriolet);
        System.out.println("Preis: " + preis);

    }

    public double berechnePreisNeu(double prozentSatz){

        preis = preis *  prozentSatz/100;

        return preis;


    }

    public Auto(String name, String hersteller, String farbe, boolean cabriolet, double preis){

        this.name = name;
        this.hersteller = hersteller;
        this.farbe  = farbe;
        this.cabriolet = cabriolet;
        this.preis = preis;
    }

}
class Autoverladung {

    public static void Main() {

        Auto auto1 = new Auto("A2", "Audi", "champagner", true, 36999.99);
        Auto auto2 = new Auto("Golf", "VW", "schwarz", true, 28800.00);
        Auto auto3 = new Auto("Escape", "Renault", "crimson", false, 38800.00);
        Auto auto4 = new Auto("A8", "Audi", "nachtblau", false, 84160.00);

        auto1.gibInfos();
        auto1.berechnePreisNeu(0.14);
        auto1.gibInfos();

    }
}



