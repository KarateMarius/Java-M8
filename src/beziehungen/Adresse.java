package beziehungen;

public class Adresse {
    
    private String straße;
    private int hausnummer;
    
    private Ort ort;
    private final Person bewohner;
    
    public Adresse(Ort ort, Person bewohner){
        
        this.ort = ort;
        this.bewohner = bewohner;
        
        
        
    }
    
}
