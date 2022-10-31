package Creational.Singleton;
public class Student {
    private final String name;
    private final int bornYear;

    private static final Student instance = new Student("Phát", 2001);

    private Student(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    public static Student getStudentInstance(){
        return instance;
    }
}
