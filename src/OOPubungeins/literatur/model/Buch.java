package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;

public class Buch {
    
    private String titel;
    private int ausgabe;
    
    private Autor[] autor = new Autor[10];
    private Kapitel[] kapitel = new Kapitel[10];
    
    public Buch(String titel, int ausgabe, Autor autor, Kapitel kapitel){
    
        this.titel = titel;
        this.ausgabe = ausgabe;
        
        this.kapitel[0] = kapitel;

        this.autor[0] = autor;
        
        
                
    }
}
