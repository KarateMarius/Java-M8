package Probeklausur.sendungen;

public class Sendung {
    
    private final Adresse adresse;
    private Zustellfahrzeug fahrzeug;
    
    public Sendung(Adresse adresse){
        this.adresse = adresse;
    }
    
    public Zustellfahrzeug getFahrzeug(){
        return this.fahrzeug;
    }
    
    public void setFahrzeug(Zustellfahrzeug fahrzeug){
        this.fahrzeug = fahrzeug;
    }


    public Adresse getAdresse() {
        return this.adresse;
    }
    
}
