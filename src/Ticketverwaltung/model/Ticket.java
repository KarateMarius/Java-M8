package Ticketverwaltung.model;

public class Ticket {

    private boolean verkauft = false;
    private int nummer;
    
    
    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    

    public boolean isVerkauft() {
        return verkauft;
    }

    public void setVerkauft(boolean verkauft) {
        this.verkauft = verkauft;
    }

    public double getPreis(){
        
        return 5.00;
    }
    
    public Ticket(boolean verkauft, int nummer){
        
        this.verkauft = verkauft;
        this.nummer = nummer;
        
    }
}
