import java.util.Scanner;
public class Main {
    static boolean isAsal(int n, int divider) {

        if (n <= 1) {          //Asal olma koşulu oluşturulur
            return false;
        }
        if (divider * divider > n) {
            return true;
        }
        if (n % divider == 0) {
            return false;
        }

        return isAsal(n, divider + 1);
    }
    static boolean isAsal(int n) {
        return isAsal(n, 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için bir Scanner nesnesi oluşturulur.
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean asalResult = isAsal(sayi);

        System.out.println(sayi + (asalResult ? " sayısı ASAL sayıdır." : " sayısı ASAL sayı değildir."));
    }
}