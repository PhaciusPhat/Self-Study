package Structural.Facade;

public class ShopFacade {
    private BankService bankService;
    private OrderService orderService;
    private ProductService productService;
    public ShopFacade(){
        bankService = new BankService();
        orderService = new OrderService();
        productService = new ProductService();
    }

    public void buyProduct(String cusName, String bankNumber, String productName){
        bankService.drawOrder(cusName, bankNumber);
        orderService.createOrder(cusName, bankNumber);
        productService.updateProductNumber(productName);
    }
}
