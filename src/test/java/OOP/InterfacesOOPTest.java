package OOP;
//    Interfaces
public class InterfacesOOPTest {
    public static void main(String[] args) {
        InterfacesOOP.Eagle myEagle = new InterfacesOOP.Eagle();
        myEagle.eat();
        myEagle.sound();
        myEagle.fly();
        System.out.println("Number of legs: " + InterfacesOOP.Bird.numberOfLegs);
        System.out.println("Outer covering: " + InterfacesOOP.Bird.outerCovering);
    }
}
