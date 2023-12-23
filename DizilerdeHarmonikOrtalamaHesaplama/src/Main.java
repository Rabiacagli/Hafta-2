public class Main {
    public static void main(String[] args) {
        int[] list1 = {3,8,15,60,75}; //dizi elemanlarını belirliyoruz

        // değişkenleri belirliyoruz
        double harmonikOrt;
        double harmonikSeri = 0;

        // dizideki harmonik seriyi bulmak için döngüyü yazıyoruz
        for (int i : list1) {
            harmonikSeri += 1.0/i;
        }
        harmonikOrt = list1.length/harmonikSeri; // harmonik ortalama için formülü yazıyoruz

        // tüm sonuçları ekrana yazdırıyoruz
        System.out.println("Harmonik Seri: " + harmonikSeri);
        System.out.println("Harmonik Ortalama: " + harmonikOrt);
    }
}