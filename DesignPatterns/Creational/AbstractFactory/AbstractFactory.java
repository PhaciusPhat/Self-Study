package Creational.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        AbstractFactoryInterface factory1 = AbstractFactoryClass.getFactory(FactoryType.SCHOOL);
        AbstractFactoryInterface factory2 = AbstractFactoryClass.getFactory(FactoryType.COMPANY);
        if (factory1 == null || factory2 == null)
            throw new IllegalArgumentException();
        Human human1 = factory1.getHuman();
        Human human2 = factory2.getHuman();
        System.out.println(human1.toString());
        System.out.println(human2.toString());
    }
}
