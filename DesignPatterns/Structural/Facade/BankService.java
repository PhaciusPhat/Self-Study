package Structural.Facade;

public class BankService {
    public BankService() {}

    public void drawOrder(String cusName, String cusAccountNumber){
        System.out.println("draw money from " + cusAccountNumber);
        System.out.println("Customer's name: " + cusName);
    }
}
