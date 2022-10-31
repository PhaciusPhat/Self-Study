package Creational.Prototype;

public class Student implements Clonable{
    private String name;
    private int bornYear;

    public Student(Student student) {
        this.name = student.name;
        this.bornYear = student.bornYear;
    }

    public Student(String name, int bornYear) {
        super();
        this.name = name;
        this.bornYear = bornYear;
    }

    @Override
    public Object clone() {
        try {
            return new Student(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bornYear=" + bornYear +
                '}';
    }
}
