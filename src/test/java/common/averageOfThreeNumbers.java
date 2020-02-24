package common;

import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
//        Click me to see the solution
public class averageOfThreeNumbers {

    public static void main(String[] args) {
        averageOfThreeNumbers A = new averageOfThreeNumbers();
        System.out.println("Java program that takes three numbers as input to calculate and print the average of the numbers");
        Scanner inputs = new Scanner(System.in);
        while (true) {
            System.out.println("Input first number:");
            double firstNumber = inputs.nextDouble();
            System.out.println("Input second number:");
            double secondtNumber = inputs.nextDouble();
            System.out.println("Input third number:");
            double thirdtNumber = inputs.nextDouble();
            double result = (firstNumber + secondtNumber + thirdtNumber) / 3;
            System.out.println(result);
            quit();
            break;
        }
        System.out.println(1 + 1 + "1");

    }

    public static String quit() {

        System.out.println("GoodBye");
        return null;
    }
}