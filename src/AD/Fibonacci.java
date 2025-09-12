package AD;

public class Fibonacci {

    public static void main(String[] args) {

        int ges = 0;
        int sum1 = 1;
        int sum2 = 0;
        for(int i = 0; i < 10; i++){


            ges = sum1 + sum2;
            sum2 = sum1;
            sum1 = ges;


            System.out.println(ges);




        }

    }
}
