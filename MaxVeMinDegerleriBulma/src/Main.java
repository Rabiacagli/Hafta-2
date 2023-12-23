import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.print("Bir Sayı Giriniz: "); // kullanıcıdan veri alabilmek için Scanner sınıfını kullanıyoruz
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int[] list = {2,56,9,n,15,302,-7,256};   // dizinin içine 'n' sayısını yazıyoruz kullanıcıdan alacağız
        Arrays.sort(list);                       // ve Arrays sınıfıyla tüm sayıları sıralıyoruz
        System.out.println(Arrays.toString(list));

        for(int i = 0; i < list.length; i++){    // dizide 'n' sayısıyla bağlantılı küçük ve büyük olma koşulunu yazıyoruz.
            if (list[i] == n) {

                int j = i - 1;
                int k = i + 1;
                int yakinKucuk = list[j];
                int yakinBuyuk = list[k];

                System.out.println(" ");             // ve sonuçları ekrana yazdırıyoruz
                System.out.println("Girilen Sayıya Yakın Küçük Sayı : " + yakinKucuk);
                System.out.println("Girilen Sayıya Yakın Büyük Sayı : " + yakinBuyuk);

            }
        }
    }
}
