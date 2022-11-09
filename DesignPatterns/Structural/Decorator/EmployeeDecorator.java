package Structural.Decorator;

public class EmployeeDecorator implements EmployeeComponent{
    private EmployeeComponent employeeComponent;

    EmployeeDecorator(EmployeeComponent employeeComponent){
        this.employeeComponent = employeeComponent;
    }

    @Override
    public void doTask(){
        employeeComponent.doTask();
    }

    @Override
    public void showName(){
        employeeComponent.showName();
    }
}
