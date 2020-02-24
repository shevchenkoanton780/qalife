package common;

import java.util.Scanner;

public class Madlibs {
    /*
This program generates a mad libbed story.
Author: Anton Shev
Date: 7/4/2019
Updated: 09/28/2019
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String confirm;

        //Intro
        try {
            System.out.println("Welcome to game of MadLibs!!! Create your own funny story and play with your friends!! \n Do you wish to continue? (Y/N)");
            confirm = in.nextLine();
            while (!confirm.contentEquals("Y")) {
                if (confirm.contentEquals("N")) {
                    System.out.println("Okay, thanks for considering MadLibs!");
                    System.exit(0);
                } else {
                    System.out.println("Our program only recognizes \"Y/N\" as an answer. Please try again.");
                }
                confirm = in.nextLine();
            }
            System.out.println("Let's have fun!");
            Thread.sleep(500);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //body
        System.out.println("Choose a story: (1 or 2)");
        int storyPattern = in.nextInt();
        //code of the choice will execute after inputs
        Scanner initializing = new Scanner(System.in);
        String name1, name2, adjective1, adjective2, adjective3, verb1, noun1, noun2, noun3, noun4, noun5, noun6, place;
        int number;
        System.out.print("Input first name: ");
        name1 = initializing.nextLine();

        System.out.println("Input second name: ");
        name2 = initializing.nextLine();

        System.out.println("Input first adjective: ");
        adjective1 = initializing.nextLine();

        System.out.println("Input second adjective: ");
        adjective2 = initializing.nextLine();

        System.out.println("Input third adjective: ");
        adjective3 = initializing.nextLine();

        System.out.println("Input a verb: ");
        verb1 = initializing.nextLine();

        System.out.println("Input first noun: ");
        noun1 = initializing.nextLine();

        System.out.println("Input second noun: ");
        noun2 = initializing.nextLine();

        System.out.println("Input third noun: ");
        noun3 = initializing.nextLine();

        System.out.println("Input forth noun: ");
        noun4 = initializing.nextLine();

        System.out.println("Input fifth noun: ");
        noun5 = initializing.nextLine();

        System.out.println("Input sixth noun: ");
        noun6 = initializing.nextLine();

        System.out.println("Input a place: ");
        place = initializing.nextLine();

        System.out.println("Input a number: ");
        number = initializing.nextInt();

        if (storyPattern == 1) {
            //The template for the story1
            String story1 = "This morning " + name1 + " woke up feeling " + adjective1 + ".\n 'It is going to be a " + adjective2 + " day!'\n Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores.\n They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ".\n Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
            System.out.println(story1);
            //The template for the story2
        } else if (storyPattern == 2) {
            String story2 = name2 + " walked into the airport, past the " + noun4 + "of monitors. Already he felt as if he'd lost something, some " + adjective1 + " " + noun1 + " , some " + adjective2 + "dream fallen away. He had come to " + place + "to see his" + noun2 + " , whom he had not seen in twenty years. " + name2 + " was there to perform her magic for a higher-up at the state university. Even universities, apparently, were interested in what " + noun3 + "could do. Outside the terminal the sky was thick and " + adjective3 + " and hurried by wind. " + noun5 + " was coming. A " + noun3 + "from the university met him and " + verb1 + " him to her Jeep. He kept his gaze out the " + noun6 + ".";
            System.out.println(story2);
        } else
            System.out.println("Our program only recognizes 1 or 2 as an input. Please try again.");

    }
}
