package Structural.Bridge;

public class IPhone extends Phone{

    public IPhone(Application application){super(application);}

    @Override
    public void start() {
        System.out.print("Iphone: ");
        application.start();
    }
}
