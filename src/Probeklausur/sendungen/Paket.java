package Probeklausur.sendungen;

public class Paket extends Sendung implements Verfolgbar {

    private double gewicht;

    public Paket(Adresse adresse, double gewicht) {
        super(adresse);
        this.gewicht = gewicht;
    }

    @Override
    public Adresse getPosition() {
        return this.getFahrzeug().getPosition();
    }
}


