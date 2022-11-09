package Structural.Decorator;

public class TeamLead extends EmployeeDecorator{

    TeamLead(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void reviewCode(){
        System.out.println("Review code");
    }

    public void supportCuli(){
        System.out.println("Support Culi");
    }

    @Override
    public void doTask(){
        super.doTask();
        reviewCode();
        supportCuli();
    }
}
