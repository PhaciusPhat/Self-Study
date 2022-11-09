package Structural.Facade;

public class Facade {
    public static void main(String[] args){
        ShopFacade shopFacade = new ShopFacade();
        shopFacade.buyProduct("name", "123", "computer");
    }
}
