package Probeklausur.sendungen;

import java.util.HashSet;
import java.util.Set;

public class Paketzentrum {

    public static void main(String[] args) {
        
        
        Brief brief = new Brief(new Adresse("Aaseeweg", "1"), "A4");
        Paket paket = new Paket(new Adresse("Breite Gasse", "2"), 4.00);
        Sendung[] sendungen = new Sendung[2];
        sendungen[0] = brief;
        sendungen[1] = paket;
        Zustellfahrzeug dhl = new Zustellfahrzeug(sendungen);

        Brief brief2 = new Brief(new Adresse("Clemensstraße", "3"), "A5");
        Stueckgut stueckgut = new Stueckgut(new Adresse("Domplatz", "4"), new int[]{40,180,60});
        Sendung[] sendungen2 = new Sendung[2];
        sendungen2[0] = brief2;
        sendungen2[1] = stueckgut;
        Zustellfahrzeug dpd = new Zustellfahrzeug(sendungen2);
        
        
        Set<Verfolgbar> set = new HashSet<>();
        
        Sendung[] arr = dhl.getSendungen();
        
        for(Sendung s : arr){
            set.add(s.getFahrzeug());
        }
        ausgabe(set);
        set.clear();
        Sendung[] arr2 = dpd.getSendungen();
        for(Sendung s : arr2){
            set.add(s.getFahrzeug());
        }
        ausgabe(set);
        
        ausgabe(paket);
        ausgabe(stueckgut);
    }
    
    public static void ausgabe(Set<Verfolgbar> items){
        for(Verfolgbar j : items){
            System.out.println(j.getPosition().adresseAusgeben());
        }
        
    }
    
    public static void ausgabe(Verfolgbar item){
        
        System.out.println(item.getPosition().adresseAusgeben());
    }
    
}
