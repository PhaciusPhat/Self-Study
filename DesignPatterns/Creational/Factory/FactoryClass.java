package Creational.Factory;

public class FactoryClass {
    public static Human getObjectInstance(ObjectType objectType) {
        switch (objectType) {
            case STUDENT -> {
                return new Student();
            }
            case TEACHER -> {
                return new Teacher();
            }
            default -> {
                return null;
            }
        }
    }
}
