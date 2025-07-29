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

    public double berechnePreisNeu(){

        double prozentSatz = 0.24;
        preis = preis *  prozentSatz;

        return preis;


    }

    public Auto(String name, String hersteller, String farbe, boolean cabriolet, double preis){

        this.name = name;
        this.hersteller = hersteller;
        this.farbe  = farbe;
        this.cabriolet = cabriolet;
        this.preis = preis;
    }

    public static void main(String[] args){

    }
}

