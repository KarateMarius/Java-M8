package OOPubungeins.literatur;

import OOPubungeins.akteure.Autor;

public abstract class Literatur {

    private String titel;
    
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    
    
    public String getinfo(){
        
        return null;
        
    }
    public String getBeschreibung(){
        
        
        return null;
    }
    
    public boolean istAutorInvolviert(Autor autor, Autor[] autoren){
        
        for(int i = 0; i < autoren.length; i++){
            
            if(autoren[i].equals(autor)){
                
                return true;
            }else {
                
                return false;
            }
            
        }
        return false;
    }  
}
