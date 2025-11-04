package übung.f.de;

public class Übung_Arrays{

    public static void main(String[] args){}

    public void test1(String[]args){

      int [][] dreieck = new int[3][];

      dreieck[0] = new int[] {1,2,3};
      dreieck[1] = new int[] {4,5};
      dreieck[2] = new int[] {};

      dreieck[2] = new int[]{6};

      for( int i = 0; i < dreieck.length; i++ ){
          for( int j = 0; j<dreieck[i].length; j++) {
              System.out.print(dreieck[i][j]);
              System.out.print(" ");
          }
          System.out.println();
      }







    }

}
