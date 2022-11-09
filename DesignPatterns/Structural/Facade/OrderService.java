package Structural.Facade;

public class OrderService {
    public OrderService(){}

    public void createOrder(String cusName, String cusAccountNumber){
        System.out.println("Creating order for " + cusName);
        System.out.println("Receive money from " + cusAccountNumber);
    }
}
