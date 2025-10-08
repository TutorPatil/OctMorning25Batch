package com.corejava.practice;

public class Oct8Operators {



    public static void arithematicOperations()
    {
        int a ; // Declaration
        a = 10; // initialization
        int b = 20; // Declaration & initialization in one line

        int sum = (a + b);
        System.out.println( " The substraction is "+ ( b -a ));
        System.out.println( " The result of multiplication  is "+ ( a * b ));
        System.out.println( " The division  is "+ ( b / a ));
        System.out.println( " The modulus  is "+ ( b % a ));
        System.out.println(10+50);


    }

    public static void main(String[] args) {

        //arithematicOperations();
         assignmentOperators();
        //equalityOperator();
    }

    public static void assignmentOperators()
    {
        int m = 10; // simple assignment

        //*****************************************

        // Chained assignment
        int a,b,c,d; // declaration of multiple variables
        a=b=c=d=20; // initialization of variables using same value

        System.out.println(b);


        //*****************************************

        // Compound assignment operator
        int x = 20;
        x += 30;  // x = ( x + 30 );
        System.out.println(x); // 50

        System.out.println( x -= 10); // 40
        System.out.println( x *= 5); // 200
        System.out.println( x /= 5); // 40
        System.out.println( x %= 5); //  0

        //*****************************************



    }



    public static void equalityOperator()
    {
        int x = 10;
        int  y = 20;

        boolean result = ( x == y);  // to check for equality
        System.out.println(result);

        boolean result2 = ( x != y ); // To check for non equality
        System.out.println(result2);


    }



}
