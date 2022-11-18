package Behavioral.Iterator;

public class Iterator {
    public static void main(String[] args){
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("Phát", 20));
        studentList.addStudent(new Student("Chánh", 22));
        studentList.addStudent(new Student("Đoán xem", 20));
        studentList.printStudents();
    }
}
