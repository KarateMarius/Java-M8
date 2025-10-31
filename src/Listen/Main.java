package Listen;

public class Main {

    public static void main(String[] args) {
        
        Liste liste = new Liste();
        
        liste.hinzufuegen(3);
        liste.hinzufuegen(7);
        liste.hinzufuegen("Help");
        
        System.out.println(liste.leange());
        
        System.out.println(liste.getElement(0));
        System.out.println(liste.getElement(1));
        System.out.println(liste.getElement(2));
        
        System.out.println(liste.getIndex("Help"));
        
        System.out.println(liste.indexEntfernen(2));
        
        System.out.println(liste.elementEntfernen(3));
        
        System.out.println();
        
        for(int i = 0; i < liste.leange(); i++){
            System.out.println(liste.getElement(i));
            
        }
        
        
    }
    
}
