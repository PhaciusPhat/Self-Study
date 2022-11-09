package Structural.Decorator;

public class DevCuli extends EmployeeDecorator{

    DevCuli(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void coding(){
        System.out.println("coding");
    }

    public void sendPullRequest(){
        System.out.println("sending pull request");
    }

    @Override
    public void doTask() {
        super.doTask();
        coding();
        sendPullRequest();
    }
}
