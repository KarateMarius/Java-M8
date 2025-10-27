package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;
import static OOPubungeins.literatur.Literaturverwaltung.beitragschleife;

public class Sammelband extends Literatur implements IHerausgegeben {
    
    private Autor[] herausgeber;
    private int erscheinungsjahr;
    
    private Beitrag[] beiträge;
    
    public Sammelband(int erscheinungsjahr){
        
        this.erscheinungsjahr = erscheinungsjahr;
        
        this. herausgeber = autorschleife();
        
        this.beiträge = beitragschleife();
        
        this.herausgeber = autorschleife();
    }


    @Override
    public void getHerausgeber() {
        
        for(int i = 0; i < herausgeber.length; i++){
            System.out.println(herausgeber[i]);
        }
        
    }
}
