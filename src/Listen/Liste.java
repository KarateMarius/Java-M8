package Listen;

public class Liste {
    private Object[] speicher;


    public void hinzufuegen(Object e) {

        if (!(this.speicher == null)) {
            Object[] tempSpeicher = new Object[speicher.length + 1];
            for (int i = 0; i < this.speicher.length; i++) {
                tempSpeicher[i] = this.speicher[i];

            }
            tempSpeicher[this.speicher.length] = e;
            this.speicher = tempSpeicher;


        } else {

            this.speicher = new Object[1];
            this.speicher[0] = e;


        }

    }

    public boolean entfernen(int pos) {

        if (!posInListe(pos)) {
            return false;
        } else {

            Object[] tempSpeicher = new Object[this.speicher.length - 1];
            for (int i = 0; i < this.speicher.length; i++) {
                if (i != pos) {
                    tempSpeicher[i] = this.speicher[i];
                } else {
                    i++;
                }
            }
            this.speicher = tempSpeicher;
            return true;
        }
    }

    public int leange() {
        return this.speicher.length;
    }

    public Object get(int pos) {
        if(posInListe(pos)){ return this.speicher[pos];}else{return false;}
    }
    
    
    private boolean posInListe(int pos){
        return pos >= 0 && pos < this.speicher.length;
        
    }

}