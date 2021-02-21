package Übungen;

public class Main {

    public static void main(String[] args) {

        OnlineShop shop = new OnlineShop("Technik SHOP");

        Customer customer1 = new Customer("Josef","Gundert");
        Customer customer2 = new Customer("Frank","Loduchowski");
        Customer customer3 = new Customer("Lars","Gomm");

        Category category1 = new Category("Smartphones");
        Category category2 = new Category("Headphones");

        Article article1 = new Article("HyperX",12,19.99,category2);
        Article article2 = new Article("HyperXpro",2,25.99,category2);
        Article article3 = new Article("iPhone",41,400.99,category1);

        shop.addArticle(article1);
        shop.addArticle(article2);
        shop.addArticle(article3);

        shop.addCustomer(customer1);
        shop.addCustomer(customer2);
        shop.addCustomer(customer3);

        customer1.getBasket().addArticle(article1);
        System.out.println(customer1.);






    }
}
