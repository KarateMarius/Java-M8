package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.Literatur;

import static OOPubungeins.literatur.Literaturverwaltung.autorschleife;


public class Beitrag extends Literatur implements IVerfasst{
    
    private Autor[] autor;
    
    public Beitrag(){
        
        this.autor = autorschleife();
        
    }

    @Override
    public void getAutoren() {
        for(int i = 0; i < autor.length;i++){
            System.out.println(autor[i]);            
        }
    }
}
 