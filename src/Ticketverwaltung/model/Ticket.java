package Ticketverwaltung.model;

public class Ticket {
    /**
     * @verkauft
     * @nummer
     *Getter und Setter wie in der Aufgabe gefordert
     */
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

    /**
     * 
     * gibt den einzel Ticketpreis zurück
     * @return
     */
    public double getPreis(){
        
        return 5.00;
    }
    
    public Ticket(boolean verkauft, int nummer){
        
        this.verkauft = verkauft;
        this.nummer = nummer;
        
    }
}
