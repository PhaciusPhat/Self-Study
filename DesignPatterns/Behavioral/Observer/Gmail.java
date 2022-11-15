package Behavioral.Observer;

public class Gmail implements ObserverInterface{
    private static Gmail instance = new Gmail();

    public static Gmail getInstance(){
        return instance;
    }

    @Override
    public void showNotification(String message) {
        System.out.println(message);
    }
}
