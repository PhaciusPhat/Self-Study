package Structural.Facade;

public class ProductService {
    public ProductService(){}

    public void updateProductNumber(String productName){
        System.out.println("Updating " + productName + "'s amount in store");
    }
}
