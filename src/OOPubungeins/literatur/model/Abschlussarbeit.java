package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;

public class Abschlussarbeit extends Literatur {
    
    private String typ;
    
    private Autor[] autor;
    
    public Abschlussarbeit(){
        
        autorschleife(autor);
        
    }
}
