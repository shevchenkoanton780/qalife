package common;

import java.util.Scanner;

//
//Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//        Test Data:
//        Width = 5.5 Height = 8.5
//
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
public class MathInputs3 {

    public static void main (String [] agrs){
       // MathInputs3 results = new MathInputs3();
        Scanner areaAndPerimeterOfRectangle = new Scanner(System.in);
        while(true){
            System.out.println("Input width:");

        double width = areaAndPerimeterOfRectangle.nextDouble();
        System.out.println("Input height:");
        double height = areaAndPerimeterOfRectangle.nextDouble();
        double area = width * height;
        double perimeter = 2*(width + height);
        System.out.println(area);
        System.out.println(perimeter);
        quit();
        break;
        }
    }

    public static String quit(){
        System.out.print("Good Bye!");
        return null;
    }
}
