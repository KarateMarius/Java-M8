package Test;

public class Konto {
    
    private String kontoname;
    private double kontostand;


    public double getKontostand() {
        return kontostand;
    }

    public String getKontoname() {
        return kontoname;
    }

    public Konto(String kontoname, double Kontostand){
        
        this.kontoname = kontoname;
        this.kontostand = Kontostand;
    }
    
    public double abbuchen(double betrag){
        
        if((this.kontostand - betrag) < -1000.00){
            System.out.println("Das ist nicht möglich!");
        }else {this.kontostand -= betrag;}
        
        return this.kontostand;
    }

    public void verzinse(double zinssatz, int laufzeit) {
        kontostand = kontostand * Math.pow(1 + zinssatz, laufzeit);
    }

}
