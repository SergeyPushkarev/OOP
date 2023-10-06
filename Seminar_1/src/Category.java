import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Category {
    private String name;
    private HashSet<Product> setProduct = new HashSet<>();

    public Category(String name) {
        this.name = name;
    }
    public void add(Product product) {
        this.setProduct.add(product);
    }
}
