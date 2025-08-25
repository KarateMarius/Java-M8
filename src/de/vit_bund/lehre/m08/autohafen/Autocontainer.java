package de.vit_bund.lehre.m08.autohafen;

public class Autocontainer {

    private String zielOrt;
    private int zaehlerAutos;
    private int anzahlAutos;
    private Auto[] inhalt;
    private String gewicht;

    public void addAuto(Auto auto) {


        if (zaehlerAutos < anzahlAutos) {

            inhalt[zaehlerAutos] = auto;
            zaehlerAutos += 1;
        }else {

            System.out.println("Der Container ist voll.");
        }
    }

    public void printAutoliste() {

        System.out.println(zielOrt);

        for(int i = 0; i < anzahlAutos; i++){
            if(inhalt[i] != null){
            inhalt[i].gibInfos();
            System.out.println();
            }
        }
    }

    public Autocontainer(String zielOrt, int anzahlAutos) {
        this.zielOrt = zielOrt;
        this.anzahlAutos = anzahlAutos;
        zaehlerAutos = 0;
        inhalt = new Auto[anzahlAutos];
    }

    public void kategorisiereContainer(){

        switch(zaehlerAutos){

            case 1, 2, 3:
                gewicht = "leicht";
                break;
            case 4, 5, 6, 7:
                gewicht = "mittel";
                break;
            default:
                gewicht = "schwer";


        }
        System.out.println(gewicht);
    }

    public void berechnePreisMax(){

        double zwPreis;
        double maxPreis = 0;

        for(int i = 0; i < anzahlAutos; i++) {
            if (inhalt[i] != null) {
                zwPreis = inhalt[i].gibPreis();

                if(zwPreis > maxPreis){maxPreis = zwPreis;}
            }
        }

        System.out.println(maxPreis + "€ ist der höchste Preis");
    }
}