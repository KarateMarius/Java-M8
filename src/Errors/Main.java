package Errors;

public class Main {

    public static void main(String[] args) throws Exception {
        
        
        String meinObjekt = null;
        
        try {

            meinObjekt.length();
        }catch (Exception e){
            
            e.getMessage();
        }
        
        try {

            int zero = 31 / 0;
        } catch (Exception e) {
            e.getMessage();
        }
        
        
        GeraderWert wert1 = new GeraderWert();
        
        wert1.setWert(3);
        
        
        
        // Aufgabe 3
        GeraderWert[] wertearray = new GeraderWert[10];
        
        for(int i = 0; i < 9; i++) {

            wertearray[i] = new GeraderWert();
            try {

                wertearray[i].setWert(i);
            } catch (Exception e) {

                System.out.println(e.getMessage());
                
            }

        }
    }
}
