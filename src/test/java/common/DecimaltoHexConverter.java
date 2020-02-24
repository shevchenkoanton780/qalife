package common;
//Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
//Input Data:
//Input a decimal number: 15
//Expected Output
//
//Hexadecimal number is : F
import java.util.Scanner;

public class DecimaltoHexConverter {

    public static  void main(String args[])
    {
        //Intro
        String confirm;
        int amountOfNumbers;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println(
                    "Welcome to DecimaltoHexConverter.\nHere you can simply convert any number of decimal numbers to hexadecimal numbers together. Do you wish to continue? (Y/N)");
            confirm = in.nextLine();


            while (!confirm.contentEquals("Y"))  {
                if (confirm.contentEquals("N")) {
                    System.out.println("Okay, thanks for considering DecimaltoHexConverter!");
                    System.exit(0);
                } else {
                    System.out.println("Our program only recognizes \"Y/N\" as an answer. Please try again.");
                }
                confirm = in.nextLine();
            }System.out.println("Let's crack the code!");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //body of the code
        int dec_num, rem;
        String hexdec_num="";

        /* hexadecimal number digits */

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};



        System.out.print("Input a decimal number between 1 and 15: ");
        dec_num = in.nextInt();

        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
            System.out.print("Hexadecimal number is : "+hexdec_num+"\n");
            quit();
            break;
        }

    }

    public static String quit(){
        System.out.println("Good Bye");
        return null;
    }
}
