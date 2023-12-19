import java.util.Scanner; // kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz

public class Main {
    static int power(int base, int pow) {  // recursive metotla üs alma koşulunu oluşturuyoruz
        if (pow == 0) {
            return 1;
        } else if (base == 1) {
            return 1;
        } else {
            int result = base * power(base, pow - 1);
            return result;
        }
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);         // kullanıcıdan verileri alıyoruz
        System.out.print("Taban değerini giriniz : ");
        int base = scan.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int pow = scan.nextInt();

        System.out.println("Sonuç : " + power(base,pow)); // sonucu ekrana yazdırıyoruz
    }
}