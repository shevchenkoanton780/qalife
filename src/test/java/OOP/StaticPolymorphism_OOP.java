package OOP;

import org.testng.annotations.Test;

public class StaticPolymorphism_OOP {
    class Bird {
        public void fly() {
            System.out.println("The bird is flying.");
        }
        public void fly(int height) {
            System.out.println("The bird is flying " + height + " feet high.");
        }
        public void fly(String name, int height) {
            System.out.println("The " + name + " is flying " + height + " feet high.");
        }
    }
    @Test
        public void TestBird() {
            Bird myBird = new Bird();

            myBird.fly();
            myBird.fly(10000);
            myBird.fly("eagle", 10000);
    }
}
