package common.CodeGymTasks;

public class CelsiusToFahrenheitConverter {



    public static void main(String[] args)
    {
        System.out.println(convertCelsiusToFahrenheit(41));

    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //write your code here
        double TF = ((9 / 5.0 * celsius) + 32);
        return TF;
    }
}
