package Generic;

public class MyClass {
    public static <T> void printObject(T object){
        System.out.println(object);
    }

    public static <T> T getObject(T object){
        return object;
    }

    public static <T> String getTypeObject(T object){
        return object.getClass().getName();
    }

}
