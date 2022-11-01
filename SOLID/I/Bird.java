package I;

public class Bird implements Animals{
    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void swim() {
        throw new IllegalStateException("Bird can't swim");
        // -> break interface segregation principle
        // because we implement a redundant method in this class
        // -> we can refactor Animals interface by remove redundant method
        // and put it in another interface that we can use it later
        // -> like UnderwaterAnimals interface can swim
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
