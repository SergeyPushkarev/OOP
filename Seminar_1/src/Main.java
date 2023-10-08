public class Main {
    public static void main(String[] args) {
        User user1 = new User("User1", "123456");
        User user2 = new User("User2", "123456");
        User user3 = new User("User3", "123456");

        Catalog products = new Catalog();
        products.add(new Product("Молоко", 75, 0), 5);
        products.add(new Product("Свинина", 150, 0), 3);
        products.add(new Product("Говядина", 150, 0), 7);
        products.add(new Product("Помидоры", 80, 0), 15);
        products.add(new Product("Огурцы", 60, 0), 20);

        Category milkProd = new Category("Молочные продукты");
        milkProd.add(products.getProduct("Молоко"));

        Category meatProd = new Category("Мясные продукты");
        meatProd.add(products.getProduct("Свинина"));
        meatProd.add(products.getProduct("Говядина"));

        Category vegetableProd = new Category("Овощные продукты");
        vegetableProd.add(products.getProduct("Говядина"));

        System.out.println("Текущий каталог товаров: ");
        products.printListProd();

        user1.addProdFromCatalog(products.getProduct("Молоко"), 1, products);
        user1.addProdFromCatalog(products.getProduct("Свинина"), 1, products);
        user2.addProdFromCatalog(products.getProduct("Говядина"), 2, products);
        user3.addProdFromCatalog(products.getProduct("Огурцы"), 5, products);
        user3.addProdFromCatalog(products.getProduct("Помидоры"), 5, products);

        System.out.println("Следующие пользователи взяли с каталога указанные товары.");
        user1.printBasket();
        user2.printBasket();
        user3.printBasket();

        System.out.println("Текущий каталог товаров: ");
        products.printListProd();
    }
}