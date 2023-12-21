import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // kullanıcıcan veri alıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        PatternCreator (number, number,-1);
    }

    // fixedNumber : desen sayısını bulmak için girilen sabit sayıdır.
    // variableNumber : değişken sayıdır, her çağrıda artar veya azalır.
    // sign : desenin ne kadar artacağını veya azalacağını belirler.
    static void PatternCreator(int fixedNumber,int variableNumber,int sign) {

        if (variableNumber > fixedNumber)     // koşul belirliyoruz ve değişken sayı sabit sayıdan büyük olduğunda sona erer.
            return;
            if (variableNumber < 1)sign *= -1;
        System.out.print(" " + variableNumber + " "); // ekrana çıktısını alıyoruz
        PatternCreator(fixedNumber,variableNumber + sign*5,sign); // recursive metot kullanıyoruz

    }
}