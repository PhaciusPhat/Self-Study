package Creational.Builder.Variable;

public class VariableBuilder {
    public static void main(String[] args){
        Student student = (Student) new ConcreteBuilderClass().studentBornYear(2001).build();
        System.out.println(student.toString());
    }
}
