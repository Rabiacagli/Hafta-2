public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Kaya" , 20 , 85, 90, 0);
        Fighter f2 = new Fighter("Mert" , 10 , 95, 100, 0);

        Ring r = new Ring(f1, f2, 90 , 100);
        r.run();
    }
}