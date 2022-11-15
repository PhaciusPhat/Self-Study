package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    private final AccountInformation accountInformation;
    private final List<ObserverInterface> observers = new ArrayList<>();

    public Account(String username, String name, int age) {
        accountInformation = new AccountInformation(username, name, age);
    }

    @Override
    public void subscribe(ObserverInterface observerInterface) {
        if (observers.contains(observerInterface)) {
            System.out.println("Already subscribed");
        }
        observers.add(observerInterface);
        observerInterface.showNotification("You're subscribe to " + observerInterface.getClass().getName());
    }

    @Override
    public void unsubscribe(ObserverInterface observerInterface) {
        if (observers.remove(observerInterface)) {
            observerInterface.showNotification("You're usubscribe to " + observerInterface.getClass().getName());
        } else {
            System.out.println("You never subscribe in this " + observerInterface.getClass().getName());
        }
    }

    @Override
    public void notification() {
        for (ObserverInterface observerInterface : observers) {
            observerInterface.showNotification("You have change your information on " + observerInterface.getClass().getName());
        }
    }

    public void changeName(String name) {
        accountInformation.setName(name);
        this.notification();
    }
}
