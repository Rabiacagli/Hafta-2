public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Hakan Hoca","MAT","555");
        Teacher t2 = new Teacher("Sibel Hoca","FZK","777");
        Teacher t3 = new Teacher("Ali Hoca","KMY","888");

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student("Bilge","111","2",mat,fizik,kimya);
        s1.addBulkExamNote(85,45,85);
        s1.addBulkVivaNote(85,70,100);
        s1.isPass();

        Student s2 = new Student("Gamze","222","2",mat,fizik,kimya);
        s2.addBulkExamNote(50,45,55);
        s2.addBulkVivaNote(70,50,40);
        s2.isPass();

        Student s3 = new Student("Mert","444","2",mat,fizik,kimya);
        s3.addBulkExamNote(100,85,90);
        s3.addBulkVivaNote(50,70,85);
        s3.isPass();

    }
}