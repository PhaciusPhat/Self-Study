package Structural.Bridge;

public class Xiaomi extends Phone{
    public Xiaomi(Application application){super(application);}
    @Override
    public void start(){
        System.out.print("Xiaomi: ");
        application.start();
    }
}
