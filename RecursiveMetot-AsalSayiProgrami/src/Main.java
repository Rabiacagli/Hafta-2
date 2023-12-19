import java.util.Scanner;
public class Main {
    static boolean isAsal(int number) {
        int counter = 0;
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                counter++;
            }
        }
        if(counter == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        if(isAsal(number)) {
            System.out.println( number + " Asal sayıdır.");
        }
        else {
            System.out.println( number + " Asal sayı değildir.");
        }
    }
}