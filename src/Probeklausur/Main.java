package Probeklausur;

public class Main {

    public static void main(String[] args) {


        for(int i = 1; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(i + " ");
            }System.out.println();
        }
        
        int[] arr = {1,2,3,4};
        arr = plus_1(arr);

        for (int j : arr) {
            System.out.println(j);
        }
        
        
    }
    
    public static int[] plus_1(int[] arr){
        arr[arr.length - 1] = arr[arr.length - 1] + 1;
        return arr;
    }
}
