package AD;

public class Kontrollstrukturübung {
    
    public static void main(String[] args){
        
        AufgabeB(1);
    }
    
    public static void AufgabeB(int wert){

        int n = 10;
        int i = 3;
        
        
        switch(wert){
            
            case 1:
                while(i < 2*n){
                    i += 2;
                    System.out.println((double) i /2*i+1);
                    
                }
                break;
                
            case 2:
                for(i = 3; i < 2*n; i+=2){
                    
                    System.out.println((double) i /2*i+1);
                    
                }
                break;
                
            case 3:
                do{
                    i += 2;
                    System.out.println((double) i /2*i+1);
                    
                }while(i < 2*n);
        }
        
        
    }
    
    public static void AufgabeC(){
        
        for(int i = 1; i < 9; i++) {
            for(int j = 0; j < 8; j++){
                
                System.out.print(j+i + "   ");
            }
            System.out.println();
            
        }
        
    }
}
