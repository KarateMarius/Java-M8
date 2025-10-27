package Listen;

public class Liste {
    private Object[] speicher;
    
    
    public void hinzufuegen(Object e){
        
        if(!(speicher == null)) {
            Object[] tempSpeicher = new Object[speicher.length + 1];
            for (int i = 0; i < this.speicher.length; i++) {
                tempSpeicher[i] = this.speicher[i];
            
            }
                tempSpeicher[speicher.length] = e;
                this.speicher = tempSpeicher;
                

        }else {
            
            speicher = new Object[1];
            speicher[0] = e;
            
            
        }
    
    }
    
    public boolean entfernen(int pos) {

        Object[] tempSpeicher = new Object[speicher.length - 1];
        for (int i = 0; i < this.speicher.length; i++) {
            if (i != pos) {
                tempSpeicher[i] = this.speicher[i];
            } else {
                i++;
            }
            
        }
        this.speicher = tempSpeicher;
        return true;
    }
    
    public int leange(){
        return this.speicher.length;
    }
    
    public Object get(int pos) {
        
        int i = 0;
        
        if(i == pos){
            
            return this.speicher[i];
        }else{
            
            while(i != pos){
                i++;
                
            }
            return this.speicher[i];
        }
        
    }
}
