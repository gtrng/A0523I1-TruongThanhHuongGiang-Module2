package ss5_AM_Static.Student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    protected String setName(String name) {
        this.name = name;
        return name;
    }
    protected String setClasses(String classes) {
        this.classes = classes;
        return classes;
    }
    Student(){
    }
}
