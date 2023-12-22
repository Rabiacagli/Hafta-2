public class Main {
    public static void main(String[] args) {

        // Employee sınıfında çalışanları oluşturuyoruz, toString methodu ile bilgilerini ekrana yazdırıyoruz.

        Employee emp1 = new Employee("Gülçin",1000,45,2019);
        Employee emp2 = new Employee("Songül", 2500, 60, 2015);
        Employee emp3 = new Employee("Rabia", 2000, 35, 2001);

        emp1.toString();
        emp2.toString();
        emp3.toString();
    }
}

