package Creational.Builder.Variable;

public class Student {
    private String name;
    private int bornYear;

    public Student(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bornYear=" + bornYear +
                '}';
    }
}
