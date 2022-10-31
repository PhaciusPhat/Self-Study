package Creational.AbstractFactory;

public class Student extends Human {
    private String studentCode;

    public Student(String name, int bornYear, String studentCode) {
        super(name, bornYear);
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student " + this.studentCode + " - " + super.toString();
    }
}
