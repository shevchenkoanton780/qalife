package common;

public class Droid {
    //object state
    String name;
    int batteryLevel;
    int updatedBatteryLevel;
    //constructor
    public Droid (String droidName){
        name = droidName;
        batteryLevel = 100;
        updatedBatteryLevel = batteryLevel-10;
    }
    public String toString(){
        return "Hello, I'm droid " + name + ".";
    }
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task + ".");
    }
    public void energyReport(){
        // int updatedBatteryLevel = batteryLevel-10;
        System.out.println(name + " has battery level after completion the task: " + updatedBatteryLevel + ".");
    }
    public void energyTransfer(){
        int batteryLevelCodey = updatedBatteryLevel;
        System.out.println(batteryLevelCodey);
        int batteryLevelMent = batteryLevel;
        System.out.println(batteryLevelMent);
        if (batteryLevelMent>batteryLevelCodey){
            batteryLevelCodey = batteryLevelMent;
            System.out.println(batteryLevelCodey);
        } else {
            System.out.println(batteryLevelCodey);
        }
    }

    public static void main (String [] args){
        // creating new instance
        Droid myDroid = new Droid ("Codey");
        Droid robocop = new Droid ("Ment");
        System.out.println(myDroid);
        System.out.println(robocop);
        myDroid.performTask("dancing");
        robocop.performTask("standing");
        myDroid.energyReport();
        myDroid.energyTransfer();
    }
}

