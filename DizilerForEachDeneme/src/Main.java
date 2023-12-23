import javax.swing.*;

public class Main {
    public static void main(String[] args) {

int[] list = {1, 2, 3, 4, 5};

       /* for (int i = 0; i < list.length; i++) {
            //System.out.println(list[i]);

        }
        for (int i : list) {
            // System.out.println(i);
        }*/

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
       // System.out.println(sum);
    }

       /* int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++){
               // System.out.println(matris[i][j]);
//            //    System.out.print(matris[i][j] + " ");
//            }
//          //  System.out.println();

        }
       /* for (int[]row : matris) {
            System.out.println(row[0]);
        }*/

      /*  for (int[]row : matris) {
            for (int col :row){
                System.out.print(col + " ");
            }
            System.out.println();
        }*/
}
