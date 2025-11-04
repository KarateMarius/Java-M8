package Listen;

import java.util.*;

public class AufgabenMain {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();

        for (int i = 0; i < 101; i++) {

            zahlen.add(i);
        }
        
        int ges = 0;
        
        for(int i = 0; i < zahlen.size(); i++) {

            ges += zahlen.get(i);
        }
        
        System.out.println(ges);
        
        // Aufgabe 2
        List<Integer> neueZahlen = new ArrayList<>();
        //List<Integer> neueZahlen = new ArrayList<>(zahlen); geht auch!!!!!
        
        neueZahlen.addAll(zahlen);
        
        
        Set<Integer> set = new HashSet<>(); 
        
        for(int i = 0; i < neueZahlen.size(); i++){
            if(!((neueZahlen.get(i) % 2) == 0)){
            set.add(neueZahlen.get(i));}
            
        }
        
        neueZahlen.removeAll(set);
        
        for(int i = 0; i < zahlen.size(); i++){
            
            if(neueZahlen.contains(zahlen.get(i))){System.out.println(zahlen.get(i));}  
            
        }

// Aufgabe 3
        
        Queue<Integer> schlange = new LinkedList<>();
        
        for(int i = 0; i < 101; i++){
            
            schlange.add(i);
            
        }
        Queue<Integer> queue = new LinkedList<>();
        queue = schlange;
        
        int summe = 0;
        
        while(schlange.peek() != null){ 
            
            summe += schlange.poll();
        }
        System.out.println(summe);
     
        //Aufgabe 4
        
        System.out.println();
        
        System.out.println(queuerechner(queue));
        
    }

    public static int queuerechner(Queue<Integer> q) {

       
        
        
        
        
        
    }
}
