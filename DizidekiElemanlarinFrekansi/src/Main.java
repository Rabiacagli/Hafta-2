import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {55,40,32,55,10,28,99,55,32,22,10,99,60};
        int[] freq = new int[100];
        Arrays.sort(list);
        System.out.println("Dizideki Elemanlar: "+ Arrays.toString(list));

        for (int value : list) {
            freq[value]++;
        }
        System.out.println("Tekrar sayıları: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println(i + " sayısı "+ freq[i] + " kez tekrar edildi." );
            }
        }
    }
}