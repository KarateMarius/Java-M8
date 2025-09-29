package OOPubungeins.akteure;

import OOPubungeins.literatur.model.Buch;

public class Autor {
    
    private int id;
    private String vorname;
    private String nachname;
    
    private Buch[] bücher;
    
    public Autor(int id, String vorname, String nachname){
        
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        
    }
    
}
