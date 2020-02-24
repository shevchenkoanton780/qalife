package common;

public class SumOfTwoNumbers {

    public Integer sum(int i,int j){
        int S = i+j;
        return S;
    }
    public static void main (String[] args){

         SumOfTwoNumbers sumOfNumbers = new SumOfTwoNumbers();
         System.out.println(sumOfNumbers.sum(74,36));
     }

}
