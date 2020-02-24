package common;

import java.util.Scanner;

public class MathInputs {
    //Input first number: 125
    //Input second number: 24
    //Expected Output :
    //125 + 24 = 149
    //125 - 24 = 101
    //125 x 24 = 3000
    //125 / 24 = 5
    //125 mod 24 = 5


    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Math operations");
        while (true) {

            System.out.println("Input first number:");
            int number1 = keyboard.nextInt();
            System.out.println("Input second number:");
            int number2 = keyboard.nextInt();
            int result1 = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result1);
            int result2 = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result2);
            int result3 = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result3);
            int result4 = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result4);
            int result5 = number1 % number2;
            System.out.println(number1 + " mod " + number2 + " = " + result5);
            quit();
            break;
        }
    }
        public static String quit() {

            System.out.println("GoodBye");
            return null;

        }
    }
