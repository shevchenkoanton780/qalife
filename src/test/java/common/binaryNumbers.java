package common;
//17. Write a Java program to add two binary numbers. Go to the editor
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output

import java.util.Scanner;

public class binaryNumbers {

    public static void main(String[] args) {

        int amountOfNumbers;
        String binary;
        String confirm;
        String[] ordinals = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
                "tenth" };
        int stringToInt;
        int x = 0;


        Scanner in = new Scanner(System.in);
try {
        System.out.println(
                "Welcome to BinaryAdder.\nHere you can simply add any number of binary numbers together. Do you wish to continue? (y/n)");
        confirm = in.nextLine();


        while (!confirm.contentEquals("y")) {
            if (confirm.contentEquals("n")) {
                System.out.println("Okay, thanks for considering BinaryAdder!");
                System.exit(0);
            } else {
                System.out.println("Our program only recognizes \"y/n\" as an answer. Please try again.");
            }
            confirm = in.nextLine();
        }System.out.println(
        "Let's dive right in!\nHow many binary numbers would you like to be added up? (between 2 and 10)");
    amountOfNumbers = in.nextInt();
Thread.sleep(500);


while (amountOfNumbers < 2 || amountOfNumbers > 10) {
        System.out.println("\tINITIALIZING...\n\n\n");
        Thread.sleep(1000);
        System.out.println("You chose an invalid amount of numbers. Try again.");
        amountOfNumbers = in.nextInt();
    }


System.out.println("\n\n\tINITIALIZING...\n");
Thread.sleep(1000);


System.out.println("You chose to add up " + amountOfNumbers + " binary numbers.");
for (int i = 0; i < amountOfNumbers; i++) {
        System.out.println("Please select your " + ordinals[i] + " binary number: ");
        binary = in.next();
        while (!binary.matches("[01]+") || binary.contains("[a-zA-Z2-9]+")) {
            System.out.println("Binary numbers are constructed using only \"1's\" and \"0's\". Try again.");
            binary = in.next();
        }
        stringToInt = Integer.parseInt(binary, 2);
        x += stringToInt;
    }
System.out.println("Sum of the selected binary numbers is: " + Integer.toBinaryString(x)
            + " (which equals to: " + x + ")");
Thread.sleep(1500);
System.out.println("Thanks for trusting our program.");


} catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        } finally {


        in.close();
        }
        }


        }