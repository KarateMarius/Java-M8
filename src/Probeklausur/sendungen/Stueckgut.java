package Probeklausur.sendungen;

public class Stueckgut extends Sendung implements Verfolgbar{
    
    private int[] abmessungen;
    
    public Stueckgut(Adresse adresse, int[] abmessungen) {
        super(adresse);
        this.abmessungen = abmessungen;
    }

    @Override
    public Adresse getPosition() {
        return this.getFahrzeug().getPosition();
    }
}
