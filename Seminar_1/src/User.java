import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public void addProdFromCatalog(Product product, Integer amount, Catalog products) {
        Integer amountCatalog = products.getAmountProduct(product);
        if (amountCatalog < amount) {
            System.out.println("Количество товара недостаточно в каталоге!");
        }
        this.basket.add(product, amount);
        products.takeProd(product, amount);
    }

    public void printBasket () {
        System.out.println("У пользователя " + this.login + " следующая корзина товаров: ");
        basket.printListProd();
    }
}
