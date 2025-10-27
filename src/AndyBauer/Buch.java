package AndyBauer;

public class Buch extends Literatur{

    private String titel;
    private int ausgabe;


    public int getAusgabe() {
        return ausgabe;
    }
    
    public static int addieren(int a , int b){
        
        return a+b;
        
        
    }
    

    public Buch(String titel, int jahr, int ausgabe) {
        super(titel, jahr);
        this.ausgabe = ausgabe;
    }
    
    
}
