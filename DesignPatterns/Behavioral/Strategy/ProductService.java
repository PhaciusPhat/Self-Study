package Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static void searchProductsWithPrice(SearchAlgorithm search){
        List<?> guessList = new ArrayList<>();
        search.search(guessList);
    }
}
