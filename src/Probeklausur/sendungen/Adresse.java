package Probeklausur.sendungen;

public class Adresse {
    
    private String strasse;
    private String hausNr;
    
    public Adresse(String strasse, String hausNr){
        
        this.strasse = strasse;
        this.hausNr = hausNr;
    }
    
    public String adresseAusgeben(){
        
        return this.strasse + " " + hausNr;
    }
}
