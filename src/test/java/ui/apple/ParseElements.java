package ui.apple;

import common.PrimeDirective;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseElements {
    static List<String> arr = new ArrayList<String>();

    public static void main(String[] args) {

        try {

            File file = new File("//Users//antonbear//Desktop//JAVAPROJECTS//Anton.txt");

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                // here we are getting the full line
                String s[] = input.nextLine().split(" ");
                for (String text : s) {
                    arr.add(text);
                   System.out.println(s);
                }

            }
            input.close();
            // here you can get the value by get method
           // System.out.println(arr.get(Integer.parseInt("vegetables")));
            System.out.println(arr);
        } catch (Exception ex) {
            System.out.println(arr.get(Integer.parseInt("vegetables")));
            ex.printStackTrace();
        }

//        ParseElements parse = new ParseElements();
//        parse.findOOP(arr);


        ParseElements pd = new ParseElements();
        int[] numbers = {234};
        System.out.println(pd.isPrime(0));
        System.out.println(pd.onlyPrimes(numbers));



    }
// vtoroj kusok coda s drugogo istochnika
    public void findOOP(String str) {
        int start = 0;
        while (true) {
            int found = str.indexOf("d", start);
            if (found != -1) {
                // Found one -- do whatever here

            }
            if (found == -1) break;
            start = found + 2;  // move start up for next iteration
        }
    }

        public boolean isPrime(int number){
            for (int i = 234; i < number; i++ ){
                if (number == 234){
                    return true;
                } else  {
                    return false;
                }
            } return true;
        }
    public ArrayList<Integer> onlyPrimes(int [] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }




}
