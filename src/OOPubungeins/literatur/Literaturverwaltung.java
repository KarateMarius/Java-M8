package OOPubungeins.literatur;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.model.Beitrag;
import OOPubungeins.literatur.model.Buch;
import OOPubungeins.literatur.model.Kapitel;
import OOPubungeins.literatur.model.Sammelband;

import java.util.Scanner;

import static dee.vit.io.Eingabe.leseZeile;

public class Literaturverwaltung {

    public static void main(String[] args) {
        
        Buch b = new Buch("Dresbach der Hofnarr", 25);
        Autor a = new Autor(2, "Marius", "Brodauf");
        
        Sammelband s = new Sammelband(2025);
        s.setTitel("Der Weg des Dresbach");
        
        System.out.println(s.getTitel());
        
        
    }

    public static Kapitel[] kapitelschleife() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die gesamt anzahl der Kapitel ein: ");
        int gesKapitel = sc.nextInt();
        Kapitel[] kapitel = new Kapitel[gesKapitel];
        
        for(int i = 0; i < gesKapitel; i++){
            System.out.println("Bitte eine Kapitelnummer eingeben: ");
            int kpnrEingabe = sc.nextInt();

            System.out.println("Bitte ein Kapiteltitel eingeben: ");
            String eingabe = leseZeile();

            kapitel[i] = new Kapitel(eingabe, kpnrEingabe);
            
        }
        return kapitel;
    }

    public static Autor[] autorschleife(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die gesamt Anzahl der Autoren ein: ");
        int gesautoren = sc.nextInt();
        Autor[] autor = new Autor[gesautoren];

        for(int i = 0; i < gesautoren; i++){
            System.out.println("Bitte einen Autor ein eingeben: ");
            
            System.out.println("id: ");
            int idEingabe = sc.nextInt();
            
            System.out.println("Bitte den Vornamen des Autors eingeben: ");
            String vornameEingabe = leseZeile();
            
            System.out.println("Bitte den Nachnamen des Autors eingeben: ");
            String nachnameEingabe = leseZeile();

            autor[i] = new Autor(idEingabe, vornameEingabe, nachnameEingabe);
        }

        return autor;
    }
    
    public static Beitrag[] beitragschleife(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die gesamt Anzahl der Autoren ein im Beitrag ein: ");
        int gesbeiträge = sc.nextInt();
        Beitrag[] beiträge = new Beitrag[gesbeiträge];

        for(int i = 0; i < gesbeiträge; i++){
            System.out.println("Bitte einen Beitragsautor ein eingeben: ");
            int idEingabe = sc.nextInt();
            String vornameEingabe = leseZeile();
            String nachnameEingabe = leseZeile();

            beiträge[i] = new Beitrag();
        }
     
        return beiträge;
    }
    
    
}
