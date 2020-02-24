package common.CodeGymTasks;

public class minOfFourNumbers {

    public static int min(int a, int b, int c, int d) {
        //write your code here
     int min;
    if (min(a, b) <= c && min(a, b) <= d){
        min = min(a, b);
        } else if (min(a, b) >= c && d >= c){
        min = c;
        } else {
        min = d;
        }
        return min;
    }

    public static int min(int a, int b)
    {
        //write your code here
       int min;
       if (a > b){
           min = b;
       } else {
           min = a;
       }
       return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
