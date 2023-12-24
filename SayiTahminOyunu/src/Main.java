import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random guess = new Random();           // rastgele bir sayı oluşturmak için Random sınıfını kullanıyoruz
        // ve 0-100 arasında olması için 100'le çarpıyoruz.
        int number = (int) (Math.random() * 100);

        Scanner inp = new Scanner(System.in);   // kullanıcıdan veri alabilmek için Scanner sınıfını kullanıyoruz

        // değişkenlerimizi oluşturuyoruz
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {                           // tahmin hakkını 5 tanımlıyoruz
            System.out.print("Tahmininizi Giriniz: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {           // 0-100 arasında bir sayı girmesini bekliyoruz, eğer girmezse kalan hakkından eksiltiyoruz.
                System.out.println("Lütfen 0 ve 100 arasında bir sayı giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {                  // doğru tahmin yapıldıysa ekrana yazdırıyoruz
                System.out.println("Doğru tahmin! **KAZANDINIZ**");
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");    // eğer yapılmadıysa uyarıyor ve
                // girilen sayının gizli sayıdan büyük veya küçük olması durumuna göre kullanıcıya ipucu veriyoruz
                // her yanlış tahminde hakkından eksiltiyoruz
                if (selected < number) {
                    System.out.println(selected + " tahmininiz gizli sayıdan küçüktür. ");
                } else {
                    System.out.println(selected + " tahmininiz gizli sayıdan büyüktür. ");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }
        if (!isWin) {       // tüm haklarının bittiğini, (Array sınıfını kullanarak) yanlış tahminlerini  ve kaybettiğini kullanıcıya belirtiyoruz.
            System.out.println("Kaybettiniz ::( ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                System.out.println("Gizli Sayımız: " + number);   // son çıktı olarak gizli sayımızı ekrana yazdırıyoruz
            }
        }
    }
}