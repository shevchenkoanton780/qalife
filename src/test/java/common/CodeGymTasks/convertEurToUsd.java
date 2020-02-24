package common.CodeGymTasks;

import java.util.Scanner;

public class convertEurToUsd {

    public static void main (String [] args){
        convertEurToUsd ();
        quit();
    }

    public static void convertEurToUsd ()
    {
        double exchangeRateEURtoUSD = 1.97;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input number of euros you would like to exchange: ");
        int eur = in.nextInt();
        if (eur<=0)
        {
            System.out.println("Invalid entry. The amount has to be greater than 0.");
        } else
            {
            double result = eur * exchangeRateEURtoUSD;
            System.out.println("Converted amount is $" + result + " US dollars.");
            }
    }

    public static String quit() {
        System.out.println("Thank you for choosing our bank!");
        return null;
    }
}
