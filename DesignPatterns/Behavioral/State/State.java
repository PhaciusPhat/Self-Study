package Behavioral.State;

public class State {
    public static void main(String[] args) {
        for (Status status : Status.values()) {
            Pan pan = new Pan(status);
            System.out.println(pan.Turning());
        }
    }
}
