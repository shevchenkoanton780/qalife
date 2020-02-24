package common;

public class MultidimentionalArray {
    public static void main (String []args){
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };
        int x = sample[1][0];
        System.out.println(x);
// Outputs 4
//        The outputs is 4 because the first "[]" choose the array of the two categories (for example pretend {1,2,3} and {4,5,6} is 2 array with something inside. so the first "[]" choose the BRACKET not element inside the array and the second"[]" choose the element inside the array.
    }
}
