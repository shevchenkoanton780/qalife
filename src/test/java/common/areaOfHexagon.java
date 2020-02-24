package common;

import java.util.Scanner;

import static java.lang.Math.tan;

/*Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
*/
public class areaOfHexagon {

    public static void main(String[] agrs){
        System.out.println("This Java program designed to compute the area of a hexagon");
        Scanner lengthOfSidesHex = new Scanner(System.in);

        while(true){
            System.out.println("Input the length of a side of the hexagon: ");
            double length = lengthOfSidesHex.nextDouble();
            double areaOfHex = (6 * (length*length))/(4*tan(Math.PI/6));
            System.out.println("The area of the hexagon is: " + areaOfHex);
            quit();
            break;
        }

    }

    public static String quit(){
        System.out.println("Good Bye!");
        return null;
    }
}
