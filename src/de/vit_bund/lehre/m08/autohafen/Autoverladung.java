package de.vit_bund.lehre.m08.autohafen;

class Autoverladung {

    public static void main(String[] args) {

        Auto auto1 = new Auto("A2", "Audi", "champagner", true, 36999.99);
        Auto auto2 = new Auto("Golf", "VW", "schwarz", true, 28800.00);
        Auto auto3 = new Auto("Escape", "Renault", "crimson", false, 38800.00);
        Auto auto4 = new Auto("A8", "Audi", "nachtblau", false, 84160.00);

        Autocontainer ac = new Autocontainer("Sydney", 3);
        ac.addAuto(auto1);
        ac.addAuto(auto2);
        ac.addAuto(auto3);
        ac.printAutoliste();

        ac.kategorisiereContainer();

        ac.berechnePreisMax();

    }
}