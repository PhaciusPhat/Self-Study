package Structural.Bridge;

public abstract class Phone {
    protected Application application;
    Phone(Application application){
        this.application = application;
    }

    public abstract void start();

}
