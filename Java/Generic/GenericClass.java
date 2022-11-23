package Generic;

import java.util.List;
import java.util.Map;

public class GenericClass<T> {
    T genericObject;

    public GenericClass(T genericObject) {
        this.genericObject = genericObject;
    }

    public T getGenericObject() {
        return genericObject;
    }

    public void setGenericObject(T genericObject) {
        this.genericObject = genericObject;
    }

    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> element : map.entrySet()) {
            System.out.println("key: " + element.getKey());
            System.out.println("value: " + element.getValue());
        }
    }

}
