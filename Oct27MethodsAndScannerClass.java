package com.corejava.practice;

import java.util.Scanner;

public class Oct27MethodsAndScannerClass {


    public static void main(String[] args) {
//        System.out.println(addNumbers(10,20));
//        System.out.println(addNumbers(10,20,30));
//
//        System.out.println(joinNameAndSalary("Ramu", 5000));
//        System.out.println(joinNameAndSalary(5000,"Ramu"));
//        System.out.println(checkEvenOrOdd(251));
//        System.out.println(checkNumEvenOrOdd(250));
       // readStringFromConsole();

        //System.out.println(getNameAndCountChars());

        //readIntDataFromConsole();

        addTwoNumbersFromConsole();

    }


    public static void readStringFromConsole()
    {
        System.out.println(" Please enter your name..");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = sc.next();
        System.out.println(" Your name is "+s);

    }

    public static int getNameAndCountChars()
    {
        System.out.println(" Please enter your name..");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x =  s.length();
        return x;
    }

    public static void readIntDataFromConsole()
    {
        System.out.println(" please enter your age..");
            Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();
        System.out.println(" You age is  " + x);
    }

public static void addTwoNumbersFromConsole()
{
    int sum = 0;

    System.out.println(" Please enter your first number");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    System.out.println(" Please enter your Second  number");
    Scanner sc1 = new Scanner(System.in);
    int y = sc1.nextInt();

    sum = ( x +  y);

    System.out.println(" the sum of two numbers is "+sum);
}


    public static boolean checkEvenOrOdd(int number)
    {
        boolean result = false;

        if( number % 2 == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }

    public static String checkNumEvenOrOdd(int number)
    {
        String  result = "";

        if( number % 2 == 0)
        {
            result = " The number is even...";
        }
        else
        {
            result = " The number is odd...";
        }

        return result;
    }

    public static int addNumbers()
    {
        return 100;
    }
    public static int addNumbers(int a, int b)
    {
        int sum = 0;

        sum = ( a + b);

        return sum;
    }


    public static int addNumbers(int a, int b, int c)
    {
        return ( a + b + c);
    }

    public static int addNumbers(int a, int b, int c,int d)
    {
        return ( a + b + c + d);
    }

    public static String joinNameAndSalary(String name, int salary)
    {
        String s = name +" --- "+ salary;
        return s;

    }

    public static String joinNameAndSalary(int salary, String name)
    {
        String s = name +" --- "+ salary;
        return s;

    }

}
