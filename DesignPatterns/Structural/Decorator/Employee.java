package Structural.Decorator;

public class Employee implements EmployeeComponent{
    private String name;

    Employee(String name){
        this.name = name;
    }

    @Override
    public void doTask() {
        System.out.println("Employee is doing it's tasks");
    }

    @Override
    public void showName() {
        System.out.println("Employee's name: " + this.name);
    }
}
