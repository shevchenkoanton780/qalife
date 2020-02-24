package common;

public class Store1 {
    // instance fields
    String productType;

    // constructor method
    public Store1(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        Store1 lemonadeStand = new Store1("Lemonade");
        for (int i=0; i<3; i++){
            lemonadeStand.advertise();
        }
    }
}
