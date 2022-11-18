package Behavioral.Iterator;

public interface IteratorInterface<T> {
    Boolean hasNext();
    T next();
    T previous();
    T show();
}
