import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.print("Bir Sayı Giriniz: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int[] list = {2,56,9,n,15,302,-7,256};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for(int i = 0; i < list.length; i++){
            if (list[i] == n) {

                int j = i - 1;
                int k = i + 1;
                int yakinKucuk = list[j];
                int yakinBuyuk = list[k];

                System.out.println(" ");
                System.out.println("Girilen Sayıya Yakın Küçük Sayı : " + yakinKucuk);
                System.out.println("Girilen Sayıya Yakın Büyük Sayı : " + yakinBuyuk);

            }
        }
    }
}
