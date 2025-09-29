package beziehungen;

public class Person {
    
    private String vorname;
    private String nachname;
    
    private Adresse[] adressen;
    
    public Person(String vorname, String nachname, String straße, int hausnummer, int plz){
        
        this.vorname = vorname;
        this.nachname = nachname;
        
        this.adressen = new Adresse[1];
        Ort ort = new Ort(plz);
        
        this.adressen[0] = new Adresse(ort, this);
        
    }
}
