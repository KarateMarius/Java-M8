package Ticketverwaltung.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Eingabe{
    
    static Scanner sc = new Scanner(System.in);
    
    public static String leseZeile(){
        
        String eingegeben;
   
        do {eingegeben  = sc.nextLine();
            if(eingegeben.trim().length() > 1){
                
                break;
            }
            
        } while(true);
        
        return eingegeben;
    }
    
    public static int leseZahl(){

        int eingegeben = 0;
        eingegeben  = sc.nextInt();
        
        return eingegeben;
    }
}
