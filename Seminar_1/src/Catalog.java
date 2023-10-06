import java.util.*;

public class Catalog {
    protected HashMap<Product, Integer> products = new HashMap<>();

    protected void add(Product key, Integer value) {
        products.put(key, products.getOrDefault(key, 0) + value);
    }

    protected Product getProduct(String key) {
        for (Map.Entry entry : products.entrySet()) {
            Product currentProd = (Product) entry.getKey();
            if (currentProd.getName().equals(key)) {
                return currentProd;
            }
        }
        return null;
    }
    protected Integer getAmountProduct(Product product) {
        return products.get(product);
    }

    protected void printListProd () {
        for (Map.Entry entry : products.entrySet()) {
            System.out.println(((Product)entry.getKey()).getName() + " (" + entry.getValue() + ")");
        }
        System.out.println();
    }

    protected void takeProd (Product product, Integer amount) {
        products.put(product, products.get(product) - amount);
    }
}
