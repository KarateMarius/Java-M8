package Ticketverwaltung.model;

public class Veranstaltung {
    /**
     * 
     * Initialisieren + Getter und Setter
     * @name
     * @beschreibung
     * @tickets
     * @kuerzel
     */
    private String name;
    private String beschreibung;
    private Ticket[] tickets;
    private String kuerzel;
    
    public String getKuerzel() {
        return kuerzel;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * 
     * verkauft eine Menge an Tickets die eingegeben werden
     * @param anzTicket
     * @return
     */
    public boolean verkaufeTickets(int anzTicket){
        
        if(verfTesten(tickets) >= anzTicket) {

            int i = 0, ph = 0;

            while (i < anzTicket) {

                if (!tickets[ph].isVerkauft()) {
                    tickets[ph].setVerkauft(true);
                    i++;


                }
                ph++;

            }return true;

        }else 
            return false;
    }

    public static int verfTesten(Ticket[] ticket) {

        int count = 0;

        for (int i = 0; i < ticket.length; i++) {

            if (!ticket[i].isVerkauft()) {
                count++;

            }

        }
        return count;
    }
    
    public Veranstaltung(String kuerzel, String name, String beschreibung, int anzTicket){
        
        this.kuerzel = kuerzel;
        this.name = name;
        this.beschreibung = beschreibung;
        this.tickets = new Ticket[anzTicket];

        for(int i = 0; i < tickets.length; i++) {

            tickets[i] = new Ticket(false, i);

        }
        
    }
        
}

