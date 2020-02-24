package common;

import java.util.Scanner;

/*  Write a Java program to convert a hexadecimal to a octal number. Go to the editor
    Input Data:
    Input a hexadecimal number: 40
    Expected Output

    Equivalent of octal number is: 100
    */
public class DecimalBinaryHexOctalConverter {
    public static  void main(String args[])
    {
        // Ask user to enter an Hexadecimal number in Console
        System.out.println("Please enter Hexadecimal number : ");
        Scanner scanner = new Scanner(System.in);

        String hexadecimal = scanner.next();

        //Converting Hexa decimal number to Decimal in Java
        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Converted Decimal number is : " + decimal);

        //Converting hexa decimal number to binary in Java
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );

        // Converting Hex String to Octal in Java
        String octal = Integer.toOctalString(decimal);
        System.out.printf("Hexadecimal to Octal conversion of %s is %s %n", hexadecimal, octal );
    }


    }

