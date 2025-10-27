package Listen;

public class Main {

    public static void main(String[] args) {
        
        Liste liste = new Liste();
        
        liste.hinzufuegen(3);
        liste.hinzufuegen(7);
        liste.hinzufuegen("Help");
        
        System.out.println(liste.leange());
        
        System.out.println(liste.get(0));
        System.out.println(liste.get(1));
        System.out.println(liste.get(2));
        
        System.out.println(liste.entfernen(2));
        
        System.out.println("");
        
        for(int i = 0; i < liste.leange(); i++){
            System.out.println(liste.get(i));
            
        }
        
        
    }
    
}
