package common;

public class Store3 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store3(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }
    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store3 lemonadeStand = new Store3("Lemonade", 3.75);
        Store3 cookieShop = new Store3("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
        // toString method

    }
}
