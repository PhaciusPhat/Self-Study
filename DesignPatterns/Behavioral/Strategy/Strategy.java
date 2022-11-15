package Behavioral.Strategy;

public class Strategy {
    public static void main(String[] args){
        ProductService.searchProductsWithPrice(new BinarySearch());
        ProductService.searchProductsWithPrice(new LinearSearch());
    }
}
