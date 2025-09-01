public class Sternedings {

    public static void main(String[] args){

        AufgabeDrei();
    }
    public static void AufgabeEins(){

        for(int i = 1; i < 6; i++){

            for(int j = 1; j < 6; j++){

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void AufgabeZwei(){

        for(int i = 1; i < 6; i++){

            for(int j = 1; j < 6; j++){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void AufgabeDrei(){

        for(int i = 1; i < 6; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(j + i + " ");
            }
            System.out.println();
        }
    }

}
