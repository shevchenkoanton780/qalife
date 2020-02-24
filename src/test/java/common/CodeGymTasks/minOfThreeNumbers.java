package common.CodeGymTasks;

public class minOfThreeNumbers
{
    public static int min(int a, int b, int c)
    {
        //write your code here
        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if ((b <= a && b <= c) ) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println(min(10, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
