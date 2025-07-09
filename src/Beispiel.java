import java.util.Scanner;

public class Beispiel {

    public String name;
    public int alter;
    public static Scanner sc = new Scanner(System.in);


    public void main(){

    geburtstagWuensch();

    }

    public void geburtstagWuensch(){

    Beispiel b = new Beispiel();
    Scanner sc = new Scanner(System.in);
    System.out.print("Wer hat Geburtstag?: ");
    String gbName = sc.nextLine();
    System.out.print("Wie alt wird das Geburtstagskind?: ");
    int gbAlter = sc.nextInt();

    b.gratulation(gbName, gbAlter);

    }

    public void gratulation(String name, int alter){


    System.out.println("Herzlichen Glückwunsch zum " + alter + ". Geburtstag, " + name + "!");

    }

    public void rechner(){

        int a = 3;
        int b = 4;

        System.out.println((double)a/b);

    }

    public static int multiplizieren(){


        System.out.print("Bitte Faktor a eingeben: ");
        int a = sc.nextInt();
        System.out.print("Bitte Faktor b eingeben: ");
        int b = sc.nextInt();


        return a*b;
    }

    public double addieren(){

        System.out.print("Bitte Summand a eingeben: ");
        int a = sc.nextInt();
        System.out.print("Bitte Summand b eingeben: ");
        int b = sc.nextInt();


        return a+b;
    }

}
