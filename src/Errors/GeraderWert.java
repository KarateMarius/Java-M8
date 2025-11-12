package Errors;

public class GeraderWert {
    
    int wert = 0;
    
    public void setWert(int i) throws Exception {
        
        
        if((i % 2) == 0){
            this.wert = i;
            
        }else throw new UngeradeException("Ungerader Wert: " + i);
        
        
    }
    
    
}
