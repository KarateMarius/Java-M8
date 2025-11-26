package KITest;

public class Katze extends Tier implements IStreichelbar{
    
    private Spielzeug[] spielzeuge;

    public Katze(String name) {
        super(name);
    }

    public void schnurren(){
        
        System.out.println("Schnurr!");
    }
    
    public Spielzeug[] getSpielzeug(){
        return this.spielzeuge;
    }
    
    public void setSpielzeug(Spielzeug neuesSpielzeug){
        
        if(this.spielzeuge == null){
            this.spielzeuge = new Spielzeug[1];
            this.spielzeuge[0] = neuesSpielzeug;
        }else {
            Spielzeug[] tempSpielzeuge = new Spielzeug[this.spielzeuge.length + 1];
            for(int i = 0; i < this.spielzeuge.length; i++){
                tempSpielzeuge[i] = this.spielzeuge[i];
                
            }
            tempSpielzeuge[tempSpielzeuge.length-1] = neuesSpielzeug;
            this.spielzeuge = tempSpielzeuge;
        }
    }

    @Override
    public void streicheln(int n) {
        
        if(n >= 3){
            this.schnurren();
        }
    }
}
