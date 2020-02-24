package common;

import java.util.Scanner;

import static common.AreaCalculator.area_circle;
import static common.AreaCalculator.quit;

public class MathOperations {

    //Test Data:
    //a. -5 + 8 * 6
    //b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3
    public int mathOperationsA(int i, int j, int g) {
        int A = -i + j * g;
        return A;
    }

    public int mathOperationsB(int i, int j, int g) {
        int B = (i + j) % g;
        return B;
    }

    public int mathOperationsC(int i, int j, int g, int h) {
        int C = i + j * g / h;
        return C;
    }

    public int mathOperationsD(int i, int j, int g, int h, int e, int r) {
        int D = i + j / g * h - e % r;
        return D;
    }

    public static void main(String[] args) {
        MathOperations A = new MathOperations();
        System.out.println(A.mathOperationsA(5, 8, 6));
        MathOperations B = new MathOperations();
        System.out.println(B.mathOperationsB(55, 9, 9));
        MathOperations C = new MathOperations();
        System.out.println(C.mathOperationsC(20, -3, 5, 8));
        MathOperations D = new MathOperations();
        System.out.println(D.mathOperationsD(5, 15, 3, 2, 8, 3));

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Shape Area Calculator");

        while (true) {

            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) A");
            System.out.println("2) B");
            System.out.println("3) C");
            System.out.println("4) D");
            System.out.println("5) Quit");
            System.out.println();
            System.out.print("Which version: ");

            int version = keyboard.nextInt();
            System.out.println();

            if (version == 1) {
                A.mathOperationsA(5, 8, 6);
                System.out.println(A.mathOperationsA(5, 8, 6));
            } else if (version == 2) {
                B.mathOperationsB(55, 9, 9);
            } else if (version == 3) {
                C.mathOperationsC(20, -3, 5, 8);
            } else if (version == 4) {
                D.mathOperationsD(5, 15, 3, 2, 8, 3);
                break;
            } else if (version == 5) {
                quit();
                break;
            }
        }
    }
}