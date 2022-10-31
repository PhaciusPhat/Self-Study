package Creational.AbstractFactory;

public class CompanyFactory extends AbstractFactoryInterface{
    @Override
    public Human getHuman() {
        return new Developer("Phát", 2001, "SD5246");
    }
}
