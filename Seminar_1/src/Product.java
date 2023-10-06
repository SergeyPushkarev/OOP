public class Product {
    private String name;
    private Integer cost;
    private Integer rating;

    public Product(String name, Integer cost, Integer rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getRating() {
        return rating;
    }
}
