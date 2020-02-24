package common;

import java.util.ArrayList;

public class oddEvenNumbers {
    public static void main (String[] args){
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 1; i < numbers.length; i++){
            if ((numbers[i] % 2) ==1){
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        System.out.println("OddNumbers: " + oddNumbers);
        System.out.println("EvenNumbers: " + evenNumbers);
    }
}
