import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in); // kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        System.out.print("Dizinin boyutu: " );
        int lenght = inp.nextInt();

        System.out.println("Dizinin elemanlarını giriniz: ");

        int[]list = new int[lenght];
        for (int i = 0 ; i < lenght ;i++) {    // dizideki eleman sayısını bulmak için 'i' değeriyle döngü oluşturuyoruz
            System.out.print( i+1 + ". Elemanı : ");
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);      // Array.sort() ile dizideki eleman sayısını küçükten büyüğe sıralıyoruz
        System.out.println("Sıralama: "+ Arrays.toString(list));
    }
}