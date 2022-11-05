package Structural.Bridge;

public class Bridge {
    public static void main(String[] args){
        IPhone iPhone = new IPhone(new Instagram());
        Xiaomi xiaomi = new Xiaomi(new Facebook());
        iPhone.start();
        xiaomi.start();
    }
}
