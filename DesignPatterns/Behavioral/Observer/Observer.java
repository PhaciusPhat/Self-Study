package Behavioral.Observer;

public class Observer {
    public static void main(String[] args){
        Account account1 = new Account("yusuki", "phat", 20);
        Account account2 = new Account("yusuki", "phat", 20);
        account1.subscribe(Gmail.getInstance());
        account1.changeName("hello world");
        account1.unsubscribe(Gmail.getInstance());

        System.out.println("/////////////////");

        account2.subscribe(Gmail.getInstance());
        account2.subscribe(Youtube.getInstance());
        account2.changeName("hello world");
        account2.unsubscribe(Gmail.getInstance());

    }
}
