package common;

public class DebugTryCatch {
    public static void main(String[] args) {
        try{
            int width = 0;
            int length = 40;

            int ratio = length / width;
        } catch (ArithmeticException e)  {
            System.err.println("Error!");
        }
    }
}
