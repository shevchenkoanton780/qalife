package common;

import java.util.Scanner;

//Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39
public class compareTwoNumbers {

    public static void main(String[] agrs) {
        Scanner firstInput = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int fn = firstInput.nextInt();
        Scanner secondtInput = new Scanner(System.in);
        System.out.println("Input second integer: ");
        int sn = secondtInput.nextInt();
        if (fn == sn) {
            System.out.printf("%d == %d\n", fn, sn);
        } if (fn != sn) {
            System.out.printf("%d != %d\n", fn, sn);
        } if (fn < sn) {
            System.out.printf("%d < %d\n", fn, sn);
        } if (fn > sn) {
            System.out.printf("%d > %d\n", fn, sn);
        } if (fn <= sn) {
            System.out.printf("%d <= %d\n", fn, sn);
        } if (fn >= sn)
            System.out.printf("%d <= %d\n", fn, sn);
        quit();
    }



    public static String quit(){
        System.out.println("Good Bye!");
        return null;
    }
}







