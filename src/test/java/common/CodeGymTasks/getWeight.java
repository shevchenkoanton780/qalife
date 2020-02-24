package common.CodeGymTasks;

public class getWeight
{

    public static void main(String[] args)
    {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight)
    {
        // write your code here
        //double convertionCoeficient = 9.8;
        double lunarCoeficient = 0.17;
      //  double earthWeightInNewtons = earthWeight * convertionCoeficient;
        double lunarWeight =  earthWeight * lunarCoeficient;
//        double getWeight = lunarWeight;
        return lunarWeight;
    }

}
