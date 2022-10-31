package Creational.Factory;

public class Factory {
    public static void main(String[] args){
        String result;

        Human human1 = FactoryClass.getObjectInstance(ObjectType.STUDENT);
        result = human1 == null ? "This is not a subclass of Human" : human1.printObjectType();
        System.out.println(result);

        Human human2 = FactoryClass.getObjectInstance(ObjectType.TEACHER);
        result = human2 == null ? "This is not a subclass of Human" : human2.printObjectType();
        System.out.println(result);

        Human human3 = FactoryClass.getObjectInstance(ObjectType.NULL);
        result = human3 == null ? "This is not a subclass of Human" : human3.printObjectType();
        System.out.println(result);
    }
}
