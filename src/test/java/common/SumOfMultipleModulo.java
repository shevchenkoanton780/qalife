package common;

public class SumOfMultipleModulo {
   public Integer sumOfMultiple(Integer n){
       Integer sumOfMultiple = 0;
       for (int i = 1; i <= n; i++) {
           if (i % 3 == 0 || i % 5 == 0) {
               sumOfMultiple += i;
           }
       }
       return sumOfMultiple;
   }
    public static void main (String[] args){

        SumOfMultipleModulo sumOfMultiples = new SumOfMultipleModulo();
        System.out.println(sumOfMultiples.sumOfMultiple(15));
    }

}
