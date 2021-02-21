package Übungen;

public class Customer {
    private String firstname;
    private String lastname;
    private double invoicingValue;
    private Basket basket = new Basket();

    public Customer(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public Basket getBasket(){
        return this.basket;
    }

    public boolean checkout(){
        return false;
    }
}
