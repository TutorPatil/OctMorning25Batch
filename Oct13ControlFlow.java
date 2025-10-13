package com.corejava.controlflow;

public class Oct13ControlFlow {

    public static void main(String[] args) {
        ifElseIfExample();

    }

    public static void ifExample1() {
        int x = 5;
        int y = 2;

        if (x > y) {
            System.out.println("Inside the true block");
            System.out.println(" x is greater than 2");
        }
        System.out.println(" after if statement");


    }

    public static void ifExample2() {
        int x = 8;
        int y = 5;
        int z = 12;

        if (x > y) {
            if (x > z) {
                System.out.println(" X is the biggest number");
            }
            System.out.println("Out of inner it block");
        }
        System.out.println("out of Main if block");

    }

    public static void ifExample3()
    {
        String s1 = "Java";
        String s2 = "Java";

        boolean b = s1.equals(s2);

        //if(b == true)
        if(b)
        {
            System.out.println(" The strings are equal");
        }
        else
        {
            System.out.println(" The strings are not equal");
        }


    }

    public static void ifExample4()
    {
        System.out.println(" starting the mentod");
        if( 5 > 2)
        {
            if( 5 > 4)
            {
                System.out.println( " 5 is the bigger");
            }
        }
        if("java".equals("java"))
        {
            System.out.println( " The strings are equal");
        }
        if( 8 == 8)
        {
            System.out.println(" Both the numbers are same...");

        }
    }


    public static void ifElseEx1()
    {
        int age  = 20;
        String country = "India";

        if ( age > 18)
        {
            if(country.equals("India"))
            {
                System.out.println(" You are eligible for voting");
            }
            else
            {
                System.out.println(" You cant vote for indian elections");
            }
        }
        else
        {
            System.out.println(" You are too young to vote .. enjoy your teenage");
        }

    }

    public static void ifElseEx2()
    {
        int age  = 20;
        String country = "India";

        if ((age > 18) && (country.equals("India")))
        {
            System.out.println(" You are eligible for voting");
        }
        else
        {
            System.out.println(" You are not eligible to vote ..");
        }

    }



    public static void ifElseIfExample() {
        int month = 2;

        if (month == 1)
        {
            System.out.println(" you are in Jan month..");
        }
        else if (month == 2)
        {
            System.out.println(" you are in Feb month..");
        }
        else if(month == 3)
        {
            System.out.println(" you are in March month..");
        }
        else {
            System.out.println( " please enter a valid month..");
        }

    }



}
