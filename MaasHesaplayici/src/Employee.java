public class Employee {
    // Nitelikleri ve Kurucu methodu oluşturuyoruz
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax;                // GENEL NOT: Readme dosyasında oluşturulan koşulların detaylarını bulabilirsiniz.
    void tax(){                 // tax() metodunu kullanıyoruz ve vergi koşullarını belirliyoruz.
        if (this.salary > 100) {
            tax = this.salary * 0.03;
            System.out.println("Vergi miktarı : " + tax);
        } else {
            System.out.println("Vergi miktarı : 0 ");
        }
    }
    double bonus;
    void bonus(){              // bonus() metodunu kullanıyoruz ve bonus koşullarını belirliyoruz.
        if (workHours > 40) {
            int overtime = (this.workHours - 40);
            bonus = (overtime * 30);
            System.out.println("Bonus Miktarı: " + bonus);
        }

    }
    double raiseSalary;
    int now = 2021;
    void raiseSalary() {          // raiseSalary() metodunu kullanıyoruz ve maaş artışı koşullarını belirliyoruz.
        int year = (now - this.hireYear);
        if (year < 10) {
            raiseSalary = (this.salary * 0.05);
            System.out.println("Maaş Artışı: " + raiseSalary);

        } else if (10 >= year && year < 20) {
            raiseSalary = (this.salary * 0.1);
            System.out.println("Maaş Artışı: " + raiseSalary);

        } else {
            raiseSalary= (this.salary * 0.15);
            System.out.println("Maaş Artışı: " + raiseSalary);
        }
    }
    void totalSalary() {                    //totalSalary() metodunu kullanıyoruz
        double taxBonus = salary + bonus - tax;      // vergi ve bonuslar ile maaşı belirliyoruz
        double totalSalary = salary + raiseSalary + bonus - tax;    // toplam maaşı belirliyoruz
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + taxBonus);
        System.out.println("Toplam Maaş: " + totalSalary);

    }
    public String toString() {                //Bu methot ile tüm bilgileri ekrana yazdırıyoruz.
        System.out.println("-----------------------");
        System.out.println("---ÇALIŞAN BİLGİLERİ---");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        totalSalary();
        System.out.println("-----------------------");

        return null;
    }

}


