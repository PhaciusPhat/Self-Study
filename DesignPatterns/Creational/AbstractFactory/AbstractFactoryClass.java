package Creational.AbstractFactory;

public class AbstractFactoryClass {
    public static AbstractFactoryInterface getFactory(FactoryType factoryType){
        switch(factoryType){
            case SCHOOL -> {return new SchoolFactory();}
            case COMPANY -> {return new CompanyFactory();}
            default -> {return null;}
        }
    }
}
