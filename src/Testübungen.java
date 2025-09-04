public class Testübungen {

    public static void main(String[] args){

    whileSchleife();
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


    public static void irgendeineMatrix(){

        int[][] matrix = {{1,2},{3,4},{5,6}};

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void whileSchleife(){


        for (int wert = 5; wert < 10; wert++){

            System.out.println("Wert kleiner als 10.");
            wert += 1;
        }

    }

    public static void MetRandom(){

        double wert = 0.0;
        while (wert < 0.5){

            wert = Math.random();
            System.out.println("Wert : " +wert);

        }

    }
}
