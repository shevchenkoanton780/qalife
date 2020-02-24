package common;
//Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

import java.util.HashSet;

public class firstDuplicateMethod {

    // This function prints the first repeating element in arr[]
    static void printFirstRepeating(int arr[])
    {
        // Initialize index of first repeating element
        int min = -1;

        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array from right to left
        for (int i=arr.length-1; i>=0; i--) {
            // If element is already in hash set, update min
            if (set.contains(arr[i])) {
                min = i;

            } else {   // Else add element to hash set
                set.add(arr[i]);
            }
        }

        // Print the result
        if (min != -1) {
            System.out.println("The first repeating element is " + arr[min]);
        } else {
            System.out.println("There are no repeating elements");
        }
    }


    public static void main(String [] args) throws java.lang.Exception{
        int arr[] = {2, 1, 3, 5, 3, 2};
        printFirstRepeating(arr);
    }

}


