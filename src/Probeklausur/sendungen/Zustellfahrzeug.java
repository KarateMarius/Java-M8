package Probeklausur.sendungen;

public class Zustellfahrzeug implements Verfolgbar{
    
    private Sendung[] sendungen;

    public Zustellfahrzeug(Sendung[] sendungen){
        for(Sendung s : sendungen){
            s.setFahrzeug(this);
        }
        this.sendungen = sendungen;
    }

    @Override
    public Adresse getPosition() {
        return this.sendungen[0].getAdresse();
    }
    
    public Sendung[] getSendungen(){
        return this.sendungen;
    }
}
