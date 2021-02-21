package Übungen;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private String name;
    private List<Article> articles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();;

    public OnlineShop(String name){
        this.name=name;
    }

    public void addArticle(Article article){
        this.articles.add(article);
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void listArticles(){
        for(Article article : articles){
            System.out.println("Name: "+article.getName() + article.getPrice() + article.getStock());
        }
    }
}
