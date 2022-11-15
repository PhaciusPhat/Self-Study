package Behavioral.Observer;

public class Youtube implements ObserverInterface{
    private static Youtube instance = new Youtube();
    public static Youtube getInstance(){
        return instance;
    }
    @Override
    public void showNotification(String message) {
        System.out.println(message);
    }
}
