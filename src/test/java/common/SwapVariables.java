package common;

public class SwapVariables {



    public static void main (String[] args){
//using third variable
        int variable1 = 1;
        int variable2 = 2;
        int temp;
        System.out.println("Before swapping : variable1, variable2 = "+ variable1 + ", " + variable2);
        temp = variable1; //1
        variable1 = variable2; //2
        variable2 = temp; //1
        System.out.println("After swapping : variable1, variable2 = "+ variable1 + ", " + variable2);
        //without using third variable
        int a = 3;
        int b = 5;
        System.out.println("Before swapping : a, b = "+ a + ", " + b);
        a = a+b; // 3+5=8
        b = a-b; // 8-5=3
        a = a-b; //8-3=5
        System.out.println("After swapping : a, b = "+ a + ", " + b);
    }
}
