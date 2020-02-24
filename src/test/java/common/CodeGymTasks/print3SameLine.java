package common.CodeGymTasks;

public class print3SameLine {

    public static void print3(String s) {
        //write your code here
for (int i= 0; i<3; i++){
    System.out.print(s + " ");
}
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
