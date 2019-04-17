package OOP;
//    Abstraction

import org.testng.annotations.Test;

public class Abstraction_OOP {
    public static void main(String[] args) {

        abstract class Animal {
            // abstract methods
            abstract void move();

            abstract void eat();

            // concrete method
            void label() {
                System.out.println("Animal's data:");
            }
        }

        class Bird extends Animal {

            void move() {
                System.out.println("Moves by flying.");
            }

            void eat() {
                System.out.println("Eats birdfood.");
            }
        }

        class Fish extends Animal {
            void move() {
                System.out.println("Moves by swimming.");
            }

            void eat() {
                System.out.println("Eats seafood.");
            }
        }
        class TestBird {
            public void main(String[] args) {
                Animal myBird = new Bird();

                myBird.label();
                myBird.move();
                myBird.eat();
            }
        }
        class TestFish {
            public void main(String[] args) {
                Animal myFish = new Fish();

                myFish.label();
                myFish.move();
                myFish.eat();
            }
        }
    }
}
