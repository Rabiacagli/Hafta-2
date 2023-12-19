import java.util.Scanner;   // kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
public class Main {
    static boolean isPalindrom(int number) {
        // palindrom sayı değişkenlerini oluşturuyoruz

        int temp = number, lastNumber, reverseNumber = 0;

        // koşulları oluşturuyoruz
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.print("Bu sayı bir Palindrom sayıdır. ");
            return true;
        } else {
            System.out.print("Bu sayı Palindrom sayı değildir. ");
            return false;
        }
    }
    public static void main(String[] args) {   // kullanıcıdan veri alıp ekrana yazdırıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = inp.nextInt();
        System.out.print(isPalindrom(number));

        }
    }
