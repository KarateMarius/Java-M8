package KITest;

public class Main {

    public static void main() {
        
        Katze lucky = new Katze("Lucky");
        
        for(int i = 0; i < 123; i++){
            lucky.setSpielzeug(new Spielzeug(lucky));
        }
        
        
        lucky.streicheln(1);
        
        lucky.streicheln(5);
        
        byte zahl = (int) 4.0;
        
        
    }
}
