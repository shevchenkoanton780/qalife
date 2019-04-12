package unit;

import common.Utility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class unitTest {
    @Test
    public void FormatToCurrency() {
        Utility.toCurrency(123);
        Utility.toCurrency(123.45);
        Utility.toCurrency(12345.67);
    }

    @Test(invocationCount=10)
    public void sum(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("sum is==="+ c);
    }
    @Test
    public void arrays(String[] args) {


        //ArrayList is a class in Java

        ArrayList ar = new ArrayList();

        ar.add(100);//0
        ar.add(200);//1
        ar.add(300);//2

        System.out.println(ar.size()); //size of arraylist

        ar.add(400);//3
        ar.add(500);//4

        System.out.println(ar.size());

        ar.remove(3);

        System.out.println(ar.size());

        ar.add("Tom");
        ar.add(12.33);
        ar.add('M');
        ar.add(25);

        System.out.println(ar.get(0));
        System.out.println(ar.get(6));

        //System.out.println(ar.get(10)); //IndexOutOfBoundsException

        //to print all the values: use for loop:

        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }
    }
    @Test
    public static void data(String[] args) {

        //primitive data types: int, double, char, boolean
        //data types:
        //1. int:
        int i = 10;
        i = 20;
        i = 30;
        int j = 40;
        int k = -10;
        int p = 0;
        System.out.println(i);
        System.out.println(k);
        System.out.println(i+j);

        //2. double:
        double d1 = 12.33;
        double d2 = -12.33;
        double d3 = 100;
        System.out.println(d1);
        System.out.println(d1+d2);

        //3. char:
        char c1 = 'a';
        char c2 = '1';
        char c3 = '$';
        char gender = 'M';

        //4. boolean:
        boolean b1 = true;
        boolean b2 = false;

        //5. String: is a class in java, not a data type
        String s1 = "Hello World";
        String s2 = "Hey this is my java code";
        String s3 = "100";
        String s4 = "12.33";

        System.out.println(s2);

        System.out.println(1000);
        System.out.println(12.45);
        System.out.println("Hello World");
    }
    @Test
    public void func(String[] args) {


        unitTest obj = new unitTest();

        obj.test();

        int p = obj.PQR();
        System.out.println(p);

        String t = obj.XYZ();
        System.out.println(t);


        int k = obj.div(30, 10);
        System.out.println(k);

        int u = obj.div(40, 10);
        System.out.println(u);

        String d = obj.getName("Hello World");
        System.out.println(d);
    }


    //1. no ip and no op
    //void -- does not return any value
    public void test(){ //0 param
        System.out.println("test method");
    }

    public void test(int a){ //1 param
        System.out.println("test method");
    }

    public void test(int a, int b){ //2 params
        System.out.println("test method");
    }

    public void test(String a, String b){ //2 params
        System.out.println("test method");
    }

    //method overloading: when in the same class, we have different functions with the same name but with different parameters.

    @Test
    //2. no ip but some op
    public int PQR(){
        System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int c = a+b;

        return c;
    }
    @Test
    public String XYZ(){
        System.out.println("XYZ method");
        String s = "Selenium";

        return s;
    }


    @Test
    //3. some ip and some op
    public int div(int a, int b){
        System.out.println("DIV method");
        int c = a/b;

        return c;
    }
    @Test
    public String getName(String name){
        System.out.println("get name");
        return name;
    }
}
