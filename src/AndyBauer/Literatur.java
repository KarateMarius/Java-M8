package AndyBauer;

public class Literatur {

       private String titel = "Andy";
       private int geburtsjahr;
    
    public String gettitel(){
        
        return this.titel;
    }
    
    public void settitel(String titel){
        
        this.titel = titel;
    }
    //public String getInfo(){}
    
    //public String getBeschreibung(){}
    
    //public boolean istAutorinvolviert(Autor autor){}
    
    public int getjahr(){
        
        return this.geburtsjahr;
        
    }
    
    public Literatur(String titel, int jahr){
        
        this.titel = titel;
        this.geburtsjahr = jahr;
    }
}
