package Behavioral.Observer;

public interface Subject {
    void subscribe(ObserverInterface observerInterface);
    void unsubscribe(ObserverInterface observerInterface);
    void notification();
}
