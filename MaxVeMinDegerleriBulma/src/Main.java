import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        System.out.println(toStrin);

        int min = list[0];
        int max = list[0];

        System.out.println("Bir Sayı Giriniz: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i : list) {

                if (i <= n){
                min = i;
                }

                if (i >= n){
                max = i;
                }
            }

       // System.out.println("Minimum Değer " + min);
        //System.out.println("Maximum Değer " + max);
        }



    }
