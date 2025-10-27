package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;

public class Monographie implements IVerfasst{

    private Autor[] autor;
    
    private int erscheinungsjahr;


    @Override
    public void getAutoren() {
        for(int i = 0 ; i < autor.length; i++){
            System.out.println(autor[i]);            
        }
    }
}
