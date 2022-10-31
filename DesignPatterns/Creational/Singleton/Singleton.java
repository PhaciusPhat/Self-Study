package Creational.Singleton;

public class Singleton {
    public static void main(String[] args){
        Student student1 = Student.getStudentInstance();
        Student student2 = Student.getStudentInstance();
        //this will always true because both of them are using the same instance
        System.out.println(student2.equals(student1));
    }
}
