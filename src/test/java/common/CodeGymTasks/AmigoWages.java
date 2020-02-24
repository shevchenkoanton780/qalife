package common.CodeGymTasks;

public class AmigoWages {
    public static void main (String[] args){
        String a = "$5000/month";
        String b = "$5500/month";
        String c = "$7000/month";
        String d = "$8000/month";
        String e = "$10000/month";

        String A = "first year";
        String B = "second year";
        String C = "third year";
        String D = "fourth year";
        String E = "fifth year";

        System.out.println("My name is Amigo.");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("I agree to wages of " + a + " " + A + ".");
            } else if (i == 2) {
                System.out.println("I agree to wages of " + b + " " + B + ".");
            } else if (i == 3) {
                System.out.println("I agree to wages of " + c + " " + C + ".");
            } else if (i == 4) {
                System.out.println("I agree to wages of " + d + " " +  D + ".");
            } else if (i == 5) {
                System.out.println("I agree to wages of " + e + " " + E + ".");
            }
        }

        System.out.println("");
        System.out.println("Kiss my shiny metal rear actuator!");
    }
}
