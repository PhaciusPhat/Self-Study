package Structural.Decorator;

public class Decorator {
    public static void main(String[] args){
        EmployeeComponent employeeComponent = new Employee("Phát");
        employeeComponent.doTask();
        employeeComponent.showName();
        System.out.println("////");

        EmployeeComponent employeeComponent1 = new Employee("Tâm");
        employeeComponent1.doTask();
        employeeComponent1.showName();
        System.out.println("////");

        DevCuli devCuli = new DevCuli(employeeComponent);
        devCuli.doTask();
        devCuli.showName();
        System.out.println("////");

        TeamLead teamLead = new TeamLead(devCuli);
        teamLead.doTask();
        teamLead.showName();
    }
}
