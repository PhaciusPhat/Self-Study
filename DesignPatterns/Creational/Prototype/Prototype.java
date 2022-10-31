package Creational.Prototype;

public class Prototype {
    public static void main(String[] args){
        Student student1 = new Student("Phát", 2001);
        Student student2 = (Student) student1.clone();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));
    }
}
