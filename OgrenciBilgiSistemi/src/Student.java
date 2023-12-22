public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fizik,Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        this.isPass = false;

    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addBulkVivaNote(int matViva, int fizikViva, int kimyaViva) {


        if (matViva >= 0 && matViva <= 100) {
            mat.viva = matViva;
        }

        if (fizikViva >= 0 && fizikViva <= 100) {
            fizik.viva = fizikViva;
        }

        if (kimyaViva >= 0 && kimyaViva <= 100) {
            kimya.viva = kimyaViva;
        }

    }

    void printOpinion() {
        System.out.println(mat.name + "Sözlü Notu:" + mat.viva);
        System.out.println(fizik.name + "Sözlü Notu:" + fizik.viva);
        System.out.println(kimya.name + "Sözlü Notu:" + kimya.viva);
    }

    void isPass() {
        this.avarage = ((((this.mat.note + this.fizik.note + this.kimya.note) * 0.80 ) + ((this.mat.viva + this.fizik.viva + this.kimya.viva) * 0.20)) / 3.0);
        if (this.avarage > 55) {

            System.out.println("Öğrencinin adı: " + this.name);
            System.out.println("Ortalamanız: " + avarage);
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("===========");
            this.isPass = true;
        } else {

            System.out.println("Öğrencinin adı: " + this.name);
            System.out.println("Ortalamanız: " + avarage);
            System.out.println("Sınıfta Kaldınız");
            System.out.println("===========");
            this.isPass = false;
        }

    }
}
