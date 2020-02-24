package common;
//Write a Java program to print the area and perimeter of a circle. Go to the editor
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586
public class circlePerimeter {

    public static void main (String [] args){
       double r= 7.5;
       double perimeter =  Math.PI*2*r;
        System.out.println(perimeter);
       double area = Math.PI*r*r;
       System.out.println(area);
    }
}
