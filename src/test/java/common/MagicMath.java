package common;

import java.util.Scanner;

public class MagicMath extends SetColor {

    public static void magicM() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input any number: ");
        int myNumber = in.nextInt();
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println("The output is: " + stepSix);
        System.out.println(ANSI_BRIGHT_GREEN + ANSI_BG_BLUE + "M A G I C !" + ANSI_RESET);
        System.out.println("Now, go back to your code and change myNumber to any other integer. Run your program again...");
    }
    public static String quit() {
        System.out.println("Thank you for playing the MagicMath!");
        return null;
    }
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String confirm;
try{
        while (true) {
            System.out.println("Welcome to game of MagicMath!!! \n Do you wish to continue? (Y/N)");
            confirm = intro.nextLine();
            if (confirm.contentEquals("Y")) {
                magicM();
            }
            else if (confirm.contentEquals("N")) {
                quit();
                System.exit(0);
            }
            else {
                System.out.println("Our program only recognizes \"Y/N\" as an answer. Please try again.");
            }
            Thread.sleep(500);
        }

} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}


    }
}
