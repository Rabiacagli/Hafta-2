import java.util.Scanner;   // kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
public class Main {
    static boolean isPalindrome(String str) {  // true ve false değerini dödürmesi için static metodunu kullanıyoruz

        int i = 0, j = str.length() - 1;   // değişkenleri tanımlıyoruz
        while (i < j) {                    // kelimedeki tüm harfleri gezerek birbirine eşitliği durumunu kontrol edecek

            if (str.charAt(i) != str.charAt(j))
                return false;
            // eşit değilse Palindromik değildir ve ekrana yazdırıyoruz
            i++;
            j--;
        }
        // eşitse Palindromik ve ekrana yazdırıyoruz
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi Giriniz: ");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));
    }
}