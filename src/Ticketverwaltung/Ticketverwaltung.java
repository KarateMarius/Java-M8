package Ticketverwaltung;

import Ticketverwaltung.model.Ticket;
import Ticketverwaltung.model.Ticket.*;
import Ticketverwaltung.model.Veranstaltung;
import Ticketverwaltung.model.Veranstaltung.*;
import dee.vit.io.Eingabe;

import java.util.Scanner;


public class Ticketverwaltung {

    static private Veranstaltung[] veranstaltungen = new Veranstaltung[100];
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        Ticket[] Vorverkauf = new Ticket[100];
        Veranstaltung[] veranstaltungen = new Veranstaltung[100];

        for (int i = 0; i < Vorverkauf.length; i++) {

            Vorverkauf[i] = new Ticket(false, i);

        }

        int verfuegbar = Veranstaltung.verfTesten(Vorverkauf);

        zeigeMenu();
        

        while (verfuegbar >= 1) {

            
            
            verfuegbar = Veranstaltung.verfTesten(Vorverkauf);

            System.out.println("Es sind noch: " + verfuegbar + " Tickets verfügbar.");
            if (verfuegbar == 0) {
                break;
            }
            int willkaufen = Eingabe.leseZahl();

            int ph = 0, i = 0;

            if (willkaufen <= verfuegbar) {
                while (i < willkaufen) {

                    if (!Vorverkauf[ph].isVerkauft()) {
                        Vorverkauf[ph].setVerkauft(true);
                        i++;


                    }
                    ph++;
                }


                System.out.println(Vorverkauf[0].getPreis() * willkaufen);
            }


        }
    }
    
    public static void veranstaltungErstellen(){
        
        String kuerzel = sc.nextLine();
        String name = sc.nextLine();
        String beschreibung = sc.nextLine();
        int anzahl = sc.nextInt();
        
        Veranstaltung veranstaltungen = new Veranstaltung(kuerzel, name, beschreibung, anzahl);
        
        
    }
    
    public static void zeigeMenu(){
        
        System.out.println("exit");
        System.out.println("neu");
        System.out.println("liste");
        System.out.println("kaufen");
        
        String eingabe = sc.nextLine();
        
        switch(eingabe){
            
            case "exit":
                System.exit(2);
            case "neu":
                veranstaltungErstellen();
            case "liste":
                for(int i = 0; i < veranstaltungen.length; i++){
                    if (!(veranstaltungen[i] == null)) {

                        System.out.println(veranstaltungen[i].getKuerzel()+ " " + veranstaltungen[i].getKuerzel());
                    }
                }
            case "kaufen":
                ticketVerkaufen();
                
        }
        
    
    }
    
    public static void ticketVerkaufen(){
        
        String einKurz = sc.nextLine();
        
        int einAnzahl = sc.nextInt();
        
        for(int i = 0; i < veranstaltungen.length; i++){
            
            if(veranstaltungen[i].getKuerzel().equals(einKurz)){
                
                veranstaltungen[i].verkaufeTickets(einAnzahl);
                break;
            }else{

                System.out.println("Nicht gefunden");
            
        }
            
        }
        
        
    }
}
