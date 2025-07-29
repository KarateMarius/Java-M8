import java.util.Scanner;

public class Beispiel {

    public String name;
    public int alter;
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){

        Beispiel beispiel1 = new Beispiel();
        beispiel1.monate();
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

        int a = 1;
        int b = 4;

        System.out.println((double)(a/b));

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

    public void ichHasseDasBWZ(){

        System.out.println("Das BWZ ist kacke!");

    }

    public void test(){

        int a = 4;
        int b = ++a;
        int c = b++;

        System.out.println(a + " " + b + " " + c);

    }

    public void ifAbfragen(){

        if(alter < 18){

            System.out.println("Dresbach finger weg!");
        }
        else{

            System.out.println("Fahren sie fort");
        }
    }

    public void switchcaseAbfragen(){

        int nummer = sc.nextInt();

        switch(nummer){

            case 1: System.out.println("Das BWZ ist kacke!");break;
            case 2: System.out.println("Fahren sie fort!");break;
            case 3: System.out.println("Andy du Rindvieh");break;
            default: System.out.println("Default");
        }

    }

    public void arraytest(){

        int[][] nummern = new int[1][2];
    }
    public void monate(){

        String[] array = new String[12];

        array[0] = "Januar";
        array[1] = "Februar";
        array[2] = "März";
        array[3] = "April";
        array[4] = "Mai";
        array[5] = "Juni";
        array[6] = "Juli";
        array[7] = "August";
        array[8] = "September";
        array[9] = "Oktober";
        array[10] = "November";
        array[11] = "Dezember";

        for(int i = 0; i < array.length; i++){

            System.out.println(array[i]);

        }

        System.out.println(array[3]);
        array[1] = "Karnevalsmonat";

        for(int i = 0; i < array.length; i++){

            System.out.println(array[i]);

        }

    }
}
