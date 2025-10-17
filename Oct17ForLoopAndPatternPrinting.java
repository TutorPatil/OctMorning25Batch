package com.corejava.loops;

public class Oct17ForLoopAndPatternPrinting {

    public static void main(String[] args) {
        printPattern8();
    }

    public static void checkPrimeUsingFor()
    {
        int num = 7;
        boolean isPrime = true;

        for(int x = 2; x < num; x++)
        {
            if( num % x == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(" The number is prime number");
        else
            System.out.println("The number is not a prime number");
    }

    public static void checkPrimeUsingFor1()
    {
        int num = 7;
        boolean isPrime = false;

        for(int x = 2; x < num; x++)
        {
            if( num % x == 0)
            {
                isPrime = false;
                break;
            }
            else {
                isPrime = true;
            }
        }
        if(isPrime)
            System.out.println(" The number is prime number");
        else
            System.out.println("The number is not a prime number");
    }

    public static void printPrimeNumberFrom2To100()
    {
       for( int num =2;num<=100; num++) {

           boolean isPrime = true;
           for (int x = 2; x < num; x++) {
               if (num % x == 0) {
                   isPrime = false;
                   break;
               }
           }
           if (isPrime) {
               System.out.println(" The number-- " + num + " --is prime number");
           }

       }
    }

    /*
        * * * * *
     */

    public static void printPattern1()
    {
        for(int i=1; i<=5;i++)
        {
            System.out.print("* ");
        }
    }

    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */

    public static void printPattern2()
    {

        for( int i = 1; i<=5; i++)
        {
            for(int j=1; j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */

    public static void printPattern3()
    {

        for( int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5

     */

    public static void printPattern4()
    {

        for( int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

     /*

     1
     1 1
     1 1 1
     1 1 1 1
     1 1 1 1 1

     */

    public static void printPattern5()
    {

        for( int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void printPattern6()
    {

        for( int i = 1; i<=5; i++)
        {
            for(int j=5; j >=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     * * * * *
       * * * *
         * * *
           * *
             *

     */

    public static void printPattern7()
    {

        for( int i = 1; i<=5; i++)
        {
            for( int k=1; k<i; k++)
            {
                System.out.print("  ");
            }
            for(int j=5; j >=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     * * * * *
      * * * *
       * * *
        * *
         *



     */

    public static void printPattern8()
    {

        for( int i = 1; i<=5; i++)
        {
            for( int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            for(int j=5; j >=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
