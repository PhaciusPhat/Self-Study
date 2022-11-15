package Behavioral.Strategy;

import java.util.List;

public class LinearSearch implements SearchAlgorithm{
    @Override
    public <T> T search(List<T> list) {
        System.out.println("linear search");
        return null;
    }
}
