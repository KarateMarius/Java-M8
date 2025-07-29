public class Spielwiese{

    public static void main(String[] args) {

        int[][] matrixM = {

                {2, 8, 20},
                {3, 4, -7}
        };

        int[][] matrixM2;

        matrixM2 = new int[2][3];

        matrixM2[0][0] = 2;
        matrixM2[0][1] = 8;
        matrixM2[0][2] = 20;

        matrixM2[1][0] = 3;
        matrixM2[1][1] = 4;
        matrixM2[1][2] = -7;

        matrixM2[0][2] = 30;

        System.out.println(matrixM2[0][2]);

    }

}
