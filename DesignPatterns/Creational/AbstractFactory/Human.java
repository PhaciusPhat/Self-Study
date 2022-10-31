package Creational.AbstractFactory;

public class Human {
    private String name;
    private int bornYear;

    public Human(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", bornYear=" + bornYear +
                '}';
    }
}
