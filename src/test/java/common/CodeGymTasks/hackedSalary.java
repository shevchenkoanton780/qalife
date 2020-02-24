package common.CodeGymTasks;

public class hackedSalary {


        public static void main(String[] args) {
            hackedSalary result = new hackedSalary();
            result.hackSalary(8000);

        }

        public static void hackSalary(int a) {
            //write your code here

            int hackedSalary;
            hackedSalary = a + 1000;
            System.out.println("Your salary is: " + hackedSalary + " dollars per month.");
        }
}
