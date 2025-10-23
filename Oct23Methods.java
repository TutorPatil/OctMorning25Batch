package com.corejava.practice;

public class Oct23Methods {

    public static void main(String[] args) {

       //addNumbers();
        //addNumbers1(100,300);
        //addOrSubNumbers(false, 10,20);
        //addOrSubNumbers1("multi",10,20);

        //int sum = addNumbers3(10,20);
        //System.out.println(sum);


        System.out.println(checkStrings("Java","Java"));
        System.out.println(checkStrings("Java","Bhava"));

    }

    public static void addNumbers()
    {
        int a = 30;
        int b = 40;

        int sum = ( a + b );
        System.out.println(sum);


    }

// Any arguments of a method will be local variables of that method.
    public static void addNumbers1(int a, int b)
    {
        int sum = ( a + b );
        System.out.println(sum);

    }

    public static void addOrSubNumbers(boolean toAdd, int a, int b)
    {
        int result ;
        if(toAdd )
        {
            result  = ( a + b);
        }
        else
        {
            result = ( a -b );
        }

        System.out.println(result);
    }

    public  static void addOrSubNumbers1(String operation, int a, int b)
    {
        int result = 0;
        if(operation.equals("add"))
        {
            result = ( a + b );
        }
        else if(operation.equals("sub"))
        {
            result = ( a - b );
        }
        else
        {
            System.out.println( " Operation currently not supported");
        }
        System.out.println(result);

    }


    public static int addNumbers3(int a, int b)
    {
        int sum = ( a + b);
        return sum;
    }

    public  static String checkStrings(String s, String s1)
    {
        String result ;
        if(s.equals(s1))
        {
            result = " The strings are equal";
        }
        else
        {
            result = "The Strings are not equal";
        }

        return result;

    }
}
