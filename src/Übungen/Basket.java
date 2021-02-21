package Übungen;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Article> articles=new ArrayList<>();

    public void addArticle(Article article){
        if(article.decrementStock()){
        this.articles.add(article);
        article.decrementStock();
        }
    }
    public void removeArticle(Article article){
        this.articles.remove(article);
        article.incrementStock();
    }
    public void empty(){
        this.articles.clear();
    }
    public double getTotalValue(){
        double totalValue=0.0;
        for(Article article : articles){
            totalValue+=article.getPrice();
        }
        return totalValue;
    }

}


