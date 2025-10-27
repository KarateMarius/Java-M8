package AndyBauer;

import static AndyBauer.Buch.addieren;

public class Literaturverwaltung {
    
    public static void main(String[] args) {

        Literatur l = new Literatur("Bauer", 2001);
        Literatur l2 = new Literatur("Marius", 2004);


        System.out.println(l.gettitel());
        System.out.println(l2.gettitel());

        System.out.println(l.getjahr());
        System.out.println(l2.getjahr());
        
        
        Buch bucheins = new Buch("Der Weg des Bauers", 2001, 25);
        
        System.out.println(bucheins.gettitel());
        System.out.println(bucheins.getjahr());
        System.out.println(bucheins.getAusgabe());
        
        Abschlussarbeit a = new Abschlussarbeit("Diplom eins", 2025);
        
        System.out.println(addieren(5,6));
        
        
        
        
    }
}
