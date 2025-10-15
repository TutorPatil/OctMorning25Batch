package com.corejava.loops;

public class Oct15Loops {

    public static void main(String[] args) {
        checkPrimeNUmber();
    }

    public static void whileLoopEx1()
    {
        int x = 1;
        while (x <= 10)
        {
            System.out.println(" The value of x is "+x);
            x++;
        }
    }

    public static void whileLoopEx2()
    {
        int x = 10;
        while (x >=1 )
        {
            System.out.println(" The value of x is "+x);
            x--;
        }
    }


    public static void whileLoopEx3()
    {
        int x = 1;
        while (x <= 10)
        {
            System.out.println(" The value of x is "+x);
            if(x == 5)
            {
                break;
            }
            x++;
        }
        System.out.println(" After the while loop");
    }

    public static void whileLoopEx4()
    {
        int x = 1;

        while (x <= 10)
        {
            int y =1;
            while ( y <=10 )
            {
                System.out.println(" The value of x is "+ x );
                System.out.println(" The value of y is "+ y );
                if ( y == 5)
                {
                    break;
                }
                y++;
            }
            if ( x == 5)
            {
                break;
            }
            x++;
        }


    }

    public static void whileLoopMultiplicationTable()
    {
        int x = 1;
        while (x <= 10)
        {
            int y =  1;
            while ( y <= 10)
            {
                System.out.println( x + " * " +y+" = "+(x*y));
                y++;
            }
            System.out.println("==================");
            x++;
        }
    }

    public static void findFactorial()
    {
        int num = 6;
        int fact = 1;

        while( num > 1)
        {
            fact = ( fact * num);
            num--;
        }

        System.out.println(" The factorial is "+fact);
    }


    public static void checkPrimeNUmber()
    {
        int num = 11;
        int x=2;
        boolean result  = false;

       while( x < num)
       {
           if( num % x == 0)
           {
               result = false;
               break;
           }
           {
               result = true;
           }
           x++;
       }
       if( result == true)
       {
           System.out.println(" The number is Prime");
       }
       else
       {
           System.out.println(" The number is not Prime");
       }




    }
}
