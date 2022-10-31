package Creational.AbstractFactory;

public class SchoolFactory extends AbstractFactoryInterface{
    @Override
    public Human getHuman() {
        return new Student("Phát", 2001, "1911060921");
    }
}
