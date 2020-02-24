package common.CodeGymTasks;

public class parentheses {

    public static void main(String[] args) {
        System.out.println((2 * 3) + (4 * 5) + (6 * 7));

        System.out.println((2 * (3 + 4) * 5 + 6 * 7));

        System.out.println((2 * 3 + 4 * (5 + 6) * 7));

        System.out.println((2 * (3 + 4 * 5 + 6) * 7));

        System.out.println((2 * (3 + 4 * 5) + 6 * 7));

        System.out.println((2 * 3 + (4 * 5 + 6) * 7));



        System.out.println(2 * (3 + 4 * (5 + 6 *7)));
        System.out.println((2 * 3 + 4) * (5 + 6 * 7));
        System.out.println((2 * 3 + 4) * (5 + 6 * 7));
    }
}
