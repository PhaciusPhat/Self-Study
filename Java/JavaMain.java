import Generic.GenericClass;
import Generic.MyClass;

import java.util.List;
import java.util.Map;

public class JavaMain {
    public static void main(String[] args){
        GenericClass<Integer> myClass1 = new GenericClass<>(1);
        System.out.println(myClass1.getGenericObject());
        GenericClass<String> myClass2 = new GenericClass<>("Phát");
        System.out.println(myClass2.getGenericObject());
        System.out.println("///////");
        GenericClass.printList(List.of(1,"123"));
        GenericClass.printMap(Map.of(1, 2, 3, "ohbno"));
        System.out.println("///////");
        MyClass.printObject(Integer.parseInt("12"));
        System.out.println(MyClass.getObject(Integer.parseInt("12")));
        System.out.println(myClass1);
    }
}
