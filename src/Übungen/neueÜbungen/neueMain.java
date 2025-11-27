package Übungen.neueÜbungen;

import java.lang.reflect.Array;

public class neueMain {

    static void main() {
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
             if(9-i-j < 0){
                 System.out.print(0);
             }  else {System.out.print(9-i-j); }
                
            }System.out.println();
        }


        int[][] array = {{2,3,4},{6,7,8}};
        
        array = tuWasMitArray(array);
        
        System.out.println(array[array.length-1][array[array.length-1].length-1]);
    }
    
    
    public static int[][] tuWasMitArray(int[][] arr){

        arr[arr.length-1][arr[arr.length-1].length-1]++;
        
        return arr;
    }
}
