import java.util.Random;
public class Ring {
        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;

        public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }
    public void run() {
        if (isCheck()) {

            Random random = new Random();
            boolean isFirstAttackerf1 = random.nextBoolean();

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-----New Round-----");

                if (isFirstAttackerf1) {
                    this.f2.health = this.f1.hit(this.f2);
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                }

                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }

                isFirstAttackerf1 = !isFirstAttackerf1;

                System.out.println(this.f1.name + "'ın" + " Canı: " + this.f1.health);
                System.out.println(this.f2.name + "'ın" + " Canı: " + this.f2.health);

            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }
        return false;
    }
}


