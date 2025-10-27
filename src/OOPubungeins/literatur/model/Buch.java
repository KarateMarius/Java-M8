package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;

import java.util.Scanner;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;
import static OOPubungeins.literatur.Literaturverwaltung.kapitelschleife;

public class Buch extends Monographie{
    
    private String titel;
    private int ausgabe;
    
    private Scanner sc = new Scanner(System.in);

    private Autor[] autor;
    private Kapitel[] kapitel;
    
    
    public Buch(String titel, int ausgabe){
    
        this.titel = titel;
        this.ausgabe = ausgabe;
        
        kapitel = kapitelschleife();
        
        autor = autorschleife();
        
        
                
    }
}
