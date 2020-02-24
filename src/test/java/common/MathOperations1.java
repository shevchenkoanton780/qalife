package common;
//Write a Java program to compute the specified expressions and print the output. Go to the editor
//        Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//        Expected Output
//        2.138888888888889
public class MathOperations1 {

    public double mathExp (){
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        return result;
    }
    public static void main (String[] args){
        MathOperations1 result = new MathOperations1();
        System.out.println(result.mathExp());
    }

}
