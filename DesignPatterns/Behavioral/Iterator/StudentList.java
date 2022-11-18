package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>();

    StudentList(){}

    public void addStudent(Student student){students.add(student);}

    public void printStudents(){
        ConcreteIterator concreteIterator = new ConcreteIterator(Collections.singletonList(students));
        while (concreteIterator.hasNext()){
            System.out.println(concreteIterator.show().toString());
            concreteIterator.next();
        }
    };
}
