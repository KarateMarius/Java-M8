package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;
import static OOPubungeins.literatur.Literaturverwaltung.beitragschleife;

public class Sammelband extends Literatur {
    
    private Autor[] herausgeber;
    private int erscheinungsjahr;
    
    private Beitrag[] beiträge;
    
    public Sammelband(int erscheinungsjahr){
        
        this.erscheinungsjahr = erscheinungsjahr;
        
        autorschleife(herausgeber);
        
        beitragschleife(beiträge);
        
    }
    
    
}
