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
        //List<Integer> neueZahlen = new ArrayList<>(zahlen); geht auch!!!!!

        List<Integer> neueZahlen = new ArrayList<>(zahlen);
        
        
        Set<Integer> set = new HashSet<>();

        for (int i : neueZahlen) {
            if ((i % 2) == 1) {
                set.add(i);
            }

        }
        
        neueZahlen.removeAll(set);

        for (int i : zahlen) {

            if (neueZahlen.contains(i)) {
                System.out.println(i);
            }

        }

// Aufgabe 3
        
        Queue<Integer> schlange = new LinkedList<>();
        
        for(int i = 0; i < 101; i++){
            
            schlange.add(i);
            
        }
        
        int summe = 0;
        
        while(schlange.peek() != null){ 
            
            summe += schlange.poll();
        }
        System.out.println(summe);
     
        //Aufgabe 4
        
        System.out.println();

        Queue<Integer> queue = new LinkedList<>(zahlen);


        System.out.println(queueAddieren(queue));
        
    }
    // Aufgabe 4
    public static int queueAddieren(Queue<Integer> q) {

       if(q.isEmpty()){return 0;}

       int i = q.poll();
       int rest = queueAddieren(q);

       return i + rest;


        
        
        
        
        
    }
}
