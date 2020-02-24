package common;
/*Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km

*/

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.StrictMath.cos;

public class DistanceTwoPointsOnEarth {
//instance variable
double r = 6371.01;
// constructor
public DistanceTwoPointsOnEarth(double radius){
    r = radius;

}
    public static void main(String [] agrs){
        DistanceTwoPointsOnEarth radiusOfEarth = new DistanceTwoPointsOnEarth(6371.01);
        System.out.println(radiusOfEarth.r);

        System.out.println("This program is designed to compute the distance between two points on the surface of earth");
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.println("Input the latitude of coordinate 1: ");
            double x1 = inputData.nextDouble();
            System.out.println("Input the longitude of coordinate 1: ");
            double y1 = inputData.nextDouble();
            System.out.println("Input the latitude of coordinate 2: ");
            double x2 = inputData.nextDouble();
            System.out.println("Input the longitude of coordinate 2: ");
            double y2 = inputData.nextDouble();
            //conversion DecimalsToRadians
            double a1 = Math.toRadians(x1);
            double b1 = Math.toRadians(y1);
            double a2 = Math.toRadians(x2);
            double b2 = Math.toRadians(y2);
            //formula
            double distance = radiusOfEarth.r * Math.acos(sin(a1) * sin(a2) + cos(a1) * cos(a2) * cos(b1 - b2));

            System.out.println("The distance between those points is: " + distance + " km");
            quit();
            break;
        }
    }
    public static String quit(){
    System.out.println("Good Bye!");
    return null;
    }
}

