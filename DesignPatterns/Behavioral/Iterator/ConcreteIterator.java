package Behavioral.Iterator;

import java.util.List;

public class ConcreteIterator implements IteratorInterface<Object>{
    private final List<Object> objects;
    private int currentPos = 0;

    public ConcreteIterator(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public Boolean hasNext() {
        return currentPos < objects.size();
    }

    @Override
    public Object next() {
        currentPos++;
        return hasNext() ? objects.get(currentPos) : null;
    }

    @Override
    public Object previous() {
        currentPos--;
        return currentPos < 0 ?  null : objects.get(currentPos);
    }

    @Override
    public Object show() {
        return objects.get(currentPos);
    }
}
