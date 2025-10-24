package com.corejava.practice;

import javax.xml.transform.sax.SAXSource;

public class Oct24MethodsCont {

    public static void printPatern1()
    {
        int x=1;
        for(int i=1; i<=5; i++)
        {
            for( int j=1; j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }


    }

    public static void printPattern2()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

//      int sum = addNumbers(10,200);
//      System.out.println(sum);
//
//      System.out.println(addNumbers(200,300));

//       int len= getStringLength("Selenium");
//       System.out.println(len);

//    boolean b =  checkStrings("Java", "JAVA");
//    System.out.println(b);
//    System.out.println(checkStrings("Java","Java"));

//        int fact = findFactorial(6);
//        System.out.println(fact);

        for(int i = 2; i<=100; i++) {
            boolean b = checkPrime(i);
            if( b == true)
            {
                System.out.println(" the number "+ i + " is prime");
            }
        }
    }
    public static int addNumbers(int x, int y)
    {
        int sum = ( x + y );
        return sum;

    }

    public static int getStringLength(String str)
    {
        int len = 0;
        len = str.length();
        return len;
    }


    public static boolean checkStrings(String s1, String s2 )
    {
        boolean result = false;

        if(s1.equals(s2))
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }


    public static int findFactorial(int num)
    {

        int fact = 1;
        while( num > 1)
        {
            fact = ( fact * num);
            num--;
        }

        return fact;

    }


    public static boolean checkPrime(int num) {

        int x = 2;
        boolean isPrime = true;

        while (x < num) {
            if (num % x == 0) {
                isPrime = false;
                break;
            }
            x++;
        }

        return isPrime;
    }
}
