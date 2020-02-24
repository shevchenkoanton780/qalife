package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a Java program to reverse a string. Go to the editor
Input Data:
Input a string: xof nworb kciuq ehT
Expected Output

Reverse string: The quick brown fox
*/
public class reversedString {

 public static void main(String[] agrs) {
  System.out.println("Java program to reverse a string");
  String reversedLetters = "xof nworb kciuq ehT";
  char a1[] = reversedLetters.toCharArray();
  System.out.println(a1);
  for (int i = a1.length - 1; i >= 0; i--) {
   System.out.print(a1[i]);
  }

  System.out.print("\n");
   String reversedName = "o a M  y v a e h t o S";
   char[] name = reversedName.toCharArray();
   System.out.println(name);
   for (int j = name.length - 1; j >= 0; j--) {
    System.out.print(name[j]);


   }
  }
 }