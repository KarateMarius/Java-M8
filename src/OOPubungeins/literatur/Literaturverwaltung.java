package OOPubungeins.literatur;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.model.Buch;
import OOPubungeins.literatur.model.Kapitel;

public class Literaturverwaltung {

    public static void main(String[] args) {
        
        Buch b = new Buch("Dresbach der Hofnarr", 25, new Autor(1, "Louis", "Dresbach"));
        Autor a = new Autor(2, "Marius", "Brodauf");
        
        
        
    }
}
