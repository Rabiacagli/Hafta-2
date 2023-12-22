public class Course {

        Teacher courseTeacher;
        String name;
        String code;
        String prefix;
        int note ;
        int viva ;

        public Course(String name, String code, String prefix) {
            this.courseTeacher = courseTeacher;
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.note = 0;
            this.viva = 0;
        }
    public void addTeacher(Teacher t) {
        if (t.branch.equals(this.prefix)) {
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
    void printTeacher() {
            this.courseTeacher.print();
        }
}

