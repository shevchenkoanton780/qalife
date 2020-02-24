package common;
import java.util.Scanner;

public class symbolsCounter {

    public static void main(String[] args) {

        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
        int symbolLimit = 280;
        // What's the character count?
        // System.out.println(tweet.length());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbolLimit:");
        //The entered value is stored in the var n
        symbolLimit = scanner.nextInt();
        if (tweet.length() < symbolLimit){
            System.out.println("Tweet has: " + tweet.length() + " symbols. " + "Granted!");
        } else {
            System.out.println("Tweet has: " + tweet.length() + " symbols. " + "Denied!");
        }
    }
}
