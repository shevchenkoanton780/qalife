package common;

import java.util.Scanner;

//  Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//    Test Data:
//    Input a number: 8
//    Expected Output :
//            8 x 1 = 8
//            8 x 2 = 16
//            8 x 3 = 24
//            ...
//            8 x 10 = 80


public class MathInputs1 {

    public static String quit() {

        System.out.println("GoodBye");
        return null;
    }



    public static void main(String[] args) {
        Scanner multyTable = new Scanner(System.in);
        System.out.println("multiplication table upto 10");
        while (true) {
            System.out.println("Input first number");
            int i = multyTable.nextInt();
                int A = 8 * i;
                System.out.println("8 * " + i + " = " + A);
                quit();
                break;
        }
    }
}
