package common;
/*Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
*/

import java.util.Scanner;

import static java.lang.Math.tan;

public class areaOfPolygon {


    public static void main (String[] args){
        System.out.println("This Java program is designed to compute the area of a polygon");
     Scanner inputData = new Scanner(System.in);

     while(true){
         System.out.println("Input the number of sides on the polygon: ");
         int n  = inputData.nextInt(); //numOfSidesOfPolygon
         System.out.println("Input the length of one of the sides: ");
         int s = inputData.nextInt(); //lengthOfOneSideOfPolygon
         double areaOfaPolygon = (n*s*s)/(4*tan(Math.PI/n));
         System.out.println("The area of polygon is: " +  areaOfaPolygon);
         quit();
         break;
     }

    }

    public static String quit(){
        System.out.println("Good Bye!");
        return null;
    }
}
