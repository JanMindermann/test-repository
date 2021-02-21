package Übungen;

public class Article {
private String name;
private int stock;
private double price;
private Category category;

public Article(String name, int stock, double price, Category category){
    this.name=name;
    this.stock=stock;
    this.price=price;
    this.category=category;
}

public void incrementStock(){
this.stock++;
}

public boolean decrementStock(){
    if(this.stock==0){
        return false;
    }
    this.stock--;
    return true;
}

public double getPrice(){
    return this.price;
}
public String getName(){
    return this.name;
}
    public int getStock(){
        return this.stock;
    }


}


