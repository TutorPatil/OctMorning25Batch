package com.corejava.loops;

public class Oct16LoopsContForLoop {

    public static void main(String[] args) {
        printMultiplicationTable();

    }


    public static void checkPrime() {
        int num = 49;
        int x = 2;
        boolean isPrime = false;

        while (x < num) {
            if (num % x == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
            x++;
        }
        if (isPrime) {
            System.out.println(" The number is prime");
        } else {
            System.out.println(" The number is not prime");
        }
    }


    public static void checkPrime1() {
        int num = 83;
        int x = 2;
        boolean isPrime = true;

        while (x < num) {
            if (num % x == 0) {
                isPrime = false;
                break;
            }
            x++;
        }

        System.out.println(" The number is prime " + isPrime);
    }

    public static void checkEvenOdd() {
        int num = 1;
        while (num <= 100)
        {
            if (num % 2 != 0) {
                System.out.println(" The number " + num + " is odd");
            }
            num++;
        }
    }


    public static void doWhileExample()
    {
        /*
            int x = 10;
            while( x < 10)
            {
                System.out.println(x);
                x++;
            }
        System.out.println(" after the while loop");
*/

        int x = 10;
        do {
            System.out.println(x);
            x++;
        }while( x < 10);
        System.out.println(" After the do while loop");
    }


    public static void forLoopEx1()
    {
        for( int x = 1; x <= 10; x++ )
        {
            System.out.println(x);
        }
        System.out.println("===================");

        for(int y = 10; y>=1; y--)
        {
            System.out.println(y);
        }
    }

    public static void checkOddEvenUsingForLoop()
    {
        for(int x = 1; x <= 100; x++ )
        {
            if( x % 2 == 0)
            {
                System.out.println(" The number "+ x + " is Even");
            }
        }


    }

    public  static void printMultiplicationTable()
    {
        for (int x = 1; x <= 5; x++)
        {
            for (int y = 1; y <= 10; y++)
            {
                //System.out.println(x * y);
                System.out.println(x+" * "+ y +" = "+x * y);
            }
            System.out.println("================");
        }


    }
}
