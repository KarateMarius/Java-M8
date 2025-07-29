class Fahrzeug {

    private String fahrzeugTyp;
    private int alter;
    private String besitzer;
    private double preis;

    public void getInfos(){

        System.out.println("Fahrzeug Typ:" + fahrzeugTyp);
        System.out.println("Alter:" + alter);
        System.out.println("Besitzer:" + besitzer);
        System.out.println("Preis:" + preis);

    }

    public void setFahrzeugTyp(String fahrzeugTyp){

        this.fahrzeugTyp = fahrzeugTyp;

    }

    public void setAlter(int alter){
        this.alter = alter;
    }

    public void setBesitzer(String besitzer){
        this.besitzer = besitzer;
    }

    public void setPreis(double preis){
        this.preis = preis;
    }

    public Fahrzeug(String fahrzeugTyp, int alter, String besitzer, double preis){

        this.fahrzeugTyp = fahrzeugTyp;
        this.alter = alter;
        this.besitzer = besitzer;
        this.preis = preis;
    }

}

class Hangar {

    public static void main(String[] args){

        Fahrzeug fahrzeug1 = new Fahrzeug("Boot", 12, "Fabse", 10000);


        fahrzeug1.getInfos();

    }
}