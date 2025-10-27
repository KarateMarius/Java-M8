package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;

public class Abschlussarbeit extends Monographie{
    private Autor[] autor;
    private String typ;
    
    public Abschlussarbeit(){
        
        this.autor = autorschleife();
        
    }
}
