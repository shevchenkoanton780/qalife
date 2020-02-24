package ui.apple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileTxtReader {

    public static void main(String[] args)throws Exception {
        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        File file = new File("//Users//antonbear//Desktop//JAVAPROJECTS//Anton.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);

        }
        FileTxtReader parse = new FileTxtReader();

//        ArrayList<String> text = new ArrayList<>();
//
//
//
//
//        parse.findOOP(text);
//    }
//    //parsing
//    // Example using indexOf() to find all the instances of "OOP" in a string
//    public static void findOOP(String str) {
//        int start = 0;
//        while (true) {
//            int found = str.indexOf("fruits", start);
//            if (found != -1) {
//                // Found one -- do whatever here
//                System.out.println(" YYYYYYYYYYY" + found);
//            }
//            if (found == -1) break;
//            start = found + 2;  // move start up for next iteration
//        }
    }
}


