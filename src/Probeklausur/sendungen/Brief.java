package Probeklausur.sendungen;

public class Brief extends Sendung{
    
    private String format;

    public Brief(Adresse adresse, String format) {
        super(adresse);
        this.format = format;
    }
}
