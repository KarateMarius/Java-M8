void main() {
    
    Queue<Integer> warteschlange = new LinkedList<>();
    
    warteschlange.add(7);
    warteschlange.add(3);
    warteschlange.add(5);
    warteschlange.add(2);
    warteschlange.add(4);
    
    
    System.out.println(zusammenrechnen(warteschlange));
    
}


public static int zusammenrechnen(Queue arr){

    int summe = 0;
    
    while(arr.peek() != null){
        int var = (int) arr.poll();
        int var2;
        if(arr.peek() != null){
            var2 = (int) arr.peek();
        }else{var2 = 0;}
        
        summe += var * var2;
        //System.out.println("Summe = " + summe + " " + var + " * " +var2 );
    }
    
    return summe;
}