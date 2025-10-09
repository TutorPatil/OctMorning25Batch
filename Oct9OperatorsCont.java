package com.corejava.practice;

public class Oct9OperatorsCont {


    public static void equalityOperator()
    {
        int x = 10;
        int y = 20;

        System.out.println(x == y);
        System.out.println(x != y);

        String s = "Java";
        String s1 = "Selenium";
        String s2 = "Java";

        System.out.println(s==s1); // checks for reference or the address of string objects
        System.out.println(s.equals(s1)); // checks for the equality of contents
        System.out.println(s.equals(s2));// checks for the equality of contents
    }



    public static void relationalOperators()
    {
        int x = 10;
        int y = 20;
        int z = 10;

        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(y > x); // true
        System.out.println(x >= z); // true
        System.out.println(x <= z); // true
    }


    public static void logicalOperators()
    {
        int x = 10;
        int y = 20;
        int z = 10;

        boolean b = ( x > y ) && ( x > z);

        System.out.println(b);

        boolean b1 = ( y > x) && (x == y);
        System.out.println(b1);

        boolean b2 = ( y > x) && (x <= y);
        System.out.println(b2);

        boolean b3 = ( x > y ) || ( y > x);
        System.out.println(b3);

        boolean b4 = false;
        System.out.println(!b4);

        System.out.println(!(x == z));







    }

    public static void nanAndInfinityExample(){

        int x = 10;
        int y = 1;

        int z = x/y;
        System.out.println(z);

        //System.out.println(x/0); // deviding using 0 will throw Arithematic Exception
        System.out.println(x/0.0); // Infinity
        System.out.println( 0/0.0); // NaN
    }


    public static void instanceOfExample()
    {

        String s = "Java";
        System.out.println(s instanceof String);

        Oct9OperatorsCont obj = new Oct9OperatorsCont();
        System.out.println(obj instanceof Oct9OperatorsCont);


    }

    public static void conditionalOperator()
    {
        int x = 10;
        int y = 20;

        int m = (x < y)? 100:200;
        System.out.println(m);

        String s = (x < y)? "Java":"Selenium";
        System.out.println(s);


        boolean b = (x < y) ? true:false;
        System.out.println(b);


    }

    public static void main(String[] args) {
        //equalityOperator();
        //relationalOperators();
        //logicalOperators();
       // nanAndInfinityExample();
        //instanceOfExample();
        //conditionalOperator();
    }
}
