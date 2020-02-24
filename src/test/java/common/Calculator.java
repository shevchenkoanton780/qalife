package common;

public class Calculator {

    // constructor
    public Calculator(){
    }
    //methods
    public double add(double a, double b){
        double addition = a + b;
        return addition;
    }
    public double subtract (double a, double b){
        double subtraction = a-b;
        return subtraction;
    }
    public double multiply (double a, double b){
        double multiplication = a*b;
        return multiplication;
    }
    public double divide (double a, double b){
        double division= a/b;
        return division;
    }
    public double modulo (double a, double b){
        double mod = a%b;
        return mod;
    }
    //main method
    public static void main(String[] args){
        Calculator myCalculator =  new Calculator();
        //addition
        double addition = myCalculator.add(5, 7);
        System.out.println(addition);
        //subtraction
        System.out.println(myCalculator.subtract(45, 11));
        //multiplication
        System.out.println(myCalculator.multiply(45, 11));
        // division
        System.out.println(myCalculator.divide(45, 11));
        // modulo
        System.out.println(myCalculator.modulo(45, 11));
    }
}
