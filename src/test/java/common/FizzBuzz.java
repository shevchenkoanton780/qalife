package common;

public class FizzBuzz {

    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) { // Is it a multiple of 3 & 5?
                System.out.println("fizzbuzz");
            } else if ((i % 3) == 0) { // Is it a multiple of 3?
                System.out.println("fizz");
            } else if ((i % 5) == 0) { // Is it a multiple of 5?
                System.out.println("buzz");
            } else {
                System.out.println(i); // Not a multiple of 3 or 5
            }
        }
    }
}
