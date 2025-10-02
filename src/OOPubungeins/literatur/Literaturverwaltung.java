package OOPubungeins.literatur;

import OOPubungeins.akteure.Autor;
import OOPubungeins.literatur.model.Beitrag;
import OOPubungeins.literatur.model.Buch;
import OOPubungeins.literatur.model.Kapitel;

import java.util.Scanner;

public class Literaturverwaltung {

    public static void main(String[] args) {
        
        Buch b = new Buch("Dresbach der Hofnarr", 25);
        Autor a = new Autor(2, "Marius", "Brodauf");
        
        
        
    }

    public static void kapitelschleife(Kapitel[] kapitel) {

        Scanner sc = new Scanner(System.in);
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

    public static void autorschleife(Autor[] autor){

        Scanner sc = new Scanner(System.in);
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
    
    public static void beitragschleife(Beitrag[] beiträge){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie die gesamt Anzahl der Autoren ein: ");
        int gesbeiträge = sc.nextInt();
        beiträge = new Beitrag[gesbeiträge];

        for(int i = 0; i < gesbeiträge; i++){
            System.out.println("Bitte einen Autor ein eingeben: ");
            int idEingabe = sc.nextInt();
            String vornameEingabe = sc.nextLine();
            String nachnameEingabe = sc.nextLine();

            beiträge[i] = new Beitrag();
        }
        
    }
    
}
