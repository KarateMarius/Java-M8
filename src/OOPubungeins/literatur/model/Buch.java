package OOPubungeins.literatur.model;

import OOPubungeins.akteure.Autor;

import java.util.Scanner;

public class Buch {
    
    private String titel;
    private int ausgabe;
    
    private Scanner sc = new Scanner(System.in);
    
    private Autor[] autor;
    private Kapitel[] kapitel;
    
    public void kapitelschleife() {
        
        
        System.out.println("Bitte geben sie die gesamt anzahl der Kapitel ein: ");
        int gesKapitel = sc.nextInt();
        kapitel = new Kapitel[gesKapitel];
        
        for(int i = 0; i < gesKapitel; i++){
            System.out.println("Bitte eine Kapitelnummer eingeben: ");
            int kpnrEingabe = sc.nextInt();

            System.out.println("Bitte ein Kapiteltitel eingeben: ");
            String eingabe = sc.nextLine();

            kapitel[i] = new Kapitel(eingabe, kpnrEingabe);
        }
    }
    
    public void autorschleife(){

        System.out.println("Bitte geben sie die gesamt Anzahl der Autoren ein: ");
        int gesautoren = sc.nextInt();
        autor = new Autor[gesautoren];

        for(int i = 0; i < gesautoren; i++){
            System.out.println("Bitte einen Autor ein eingeben: ");
            int idEingabe = sc.nextInt();
            String vornameEingabe = sc.nextLine();
            String nachnameEingabe = sc.nextLine();
            
            autor[i] = new Autor(idEingabe, vornameEingabe, nachnameEingabe);
        }
        
    }
    
    public Buch(String titel, int ausgabe, Autor autor){
    
        this.titel = titel;
        this.ausgabe = ausgabe;
        
        kapitelschleife();
        
        autorschleife();

        this.autor[0] = autor;
        
        
                
    }
}
