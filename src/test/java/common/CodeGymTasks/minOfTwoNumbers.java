package common.CodeGymTasks;

public class minOfTwoNumbers 
{

    public static int min(int a, int b) 
    {
        //write your code here
        int min = a;
        if (a > b)
        {
            min = b;
        }
        return min;
        
    }

        public static void main (String[]args) throws Exception 
        {
            System.out.println(min(12, 33));
            System.out.println(min(-20, 0));
            System.out.println(min(-10, -20));
        
        }
}
