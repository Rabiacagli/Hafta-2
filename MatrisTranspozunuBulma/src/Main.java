public class Main {
    public static void main(String[] args) {

        int[][] matris = {{10,12,14,16}, // 3*4'lük bir matris yazıyoruz
                {18,20,22,24},
                {26,28,30,32},
        };
        int row = matris.length;   // matris ile değişken oluşturuyoruz
        int column = matris[0].length;

        int[][] transpoz = new int[column][row]; // bu değişkenleri Transpoz oluşturmak için kullanıyoruz

        for (int i = 0; i < row; i++) {           // transpoz'u matris'in satırları ve sütunları tersi olacak şekilde birbirine eşitliyoruz
            for (int j = 0; j < column; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris:");               // matrisi yazdırıyoruz
        for (int[] inds : matris) {
            for (int j = 0; j < column; j++) {

                System.out.print(inds[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrisin Transpozu:");  //transpozunu yazdırıyoruz
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}