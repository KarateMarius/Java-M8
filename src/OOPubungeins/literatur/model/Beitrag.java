package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;
import static OOPubungeins.literatur.Literaturverwaltung.beitragschleife;

public class Beitrag extends Literatur {
    
    private Autor[] autor;
    
    public Beitrag(){
        
        autorschleife(autor);
        
    }
    
}
 