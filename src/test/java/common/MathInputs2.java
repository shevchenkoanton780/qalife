package common;

import java.util.Scanner;

//Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
public class MathInputs2 {

    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Java program that takes two numbers as input and display the product of two numbers");
        while(true){
           System.out.println("Input first number");
           int firstNum = keyboard.nextInt();
            System.out.println("Input second number");
            int secondtNum = keyboard.nextInt();
            int result = firstNum * secondtNum;
            System.out.println(firstNum + " * " + secondtNum + " = " + result);
            quit();
            break;
        }
    }
    public static String quit() {

        System.out.println("GoodBye");
        return null;
    }
}
