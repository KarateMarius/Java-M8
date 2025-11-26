package deeee.vit_bund.lehre.m08.autohafen;

public class Auto {

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

        return Math.round(preis * 100.0) / 100.0;


    }

    public double gibPreis(){

        return this.preis;
    }

    public Auto(String name, String hersteller, String farbe, boolean cabriolet, double preis){

        this.name = name;
        this.hersteller = hersteller;
        this.farbe  = farbe;
        this.cabriolet = cabriolet;
        if(preis < 0.0){

            this.preis = 0;
            System.out.println("Der angegebene Preis wird nicht unterstützt (negativer Preis)!");
        }else {
            this.preis = preis;
        }
        }
    }