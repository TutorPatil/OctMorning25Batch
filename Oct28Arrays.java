package com.corejava.practice;

public class Oct28Arrays {


    public static void main(String[] args) {
        forEachLoopEx2();
    }

    public static void intArrayEx1()
    {
        // Array Declaration
        int[] x;
        int []y;
        int z[];

        //Array Construction
        x = new int[5];

        // Declaration and Construction in one line..
        int[] x1 = new int[5];


        // Array Initialization
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[0] = 100;

        System.out.println(x[0]);
        System.out.println(x[1]);

        System.out.println(x);

        System.out.println(x.length);


    }

    public static void arrayLooping()
    {
        int[] x = new int[5];

        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 100;

        for(int i=0; i<x.length;i++)
        {
            System.out.println(x[i]);


        }



    }

    public static void stringArrayEx1()
    {
        String[] s = new String[4];

        s[0] = "Java" ;
        s[1] = "Selenium";
        s[2] = "Automation";
        s[3] = "Testing";

        for(int i=0; i<s.length;i++)
        {
            System.out.println(s[i]);
        }

    }


    public static void charArrayEx1()
    {
        char[] c =  new char[4];

        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';
        c[3] = 'd';

        System.out.println(c.length);

        for(int i=0; i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }

    public static void intArrayInOneline()
    {
        int[] x = {10,20,30,40,20};
        System.out.println(x.length);

        for(int i=0; i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }

    public static void stringArrayInOneLine()
    {
        String[] s = {"Java","Selenium","Automation","Testing"};
        System.out.println(s.length);
        for(int i=0; i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }

    public static void forEachLoopEx()
    {
        int[] x = {10,20,30,40,50};

        for(int i=0; i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println("================");
        // enhanced for loop or for each loop
        for(int m: x)
        {
            System.out.println(m);
        }

    }

    public static void forEachLoopEx1()
    {

        String[] s = {"Java","Selenium","Automation","Testing"};

        for(int i=0; i<s.length;i++)
        {
            System.out.println(s[i]);
        }

        for(String m: s)
        {
            System.out.println(m);
        }


        char[] c = {'a','b','c','d'};
        for(int i=0; i<c.length;i++)
        {
            System.out.println(c[i]);
        }

        for(char m:c)
        {
            System.out.println(m);
        }


    }

    public static void forEachLoopEx2()
    {
      int[] x = {10,20,30,40,50};
//
//        for(int i=2; i<x.length;i++)
//        {
//            System.out.println(x[i]);
//        }
//
//        for(int m:x)
//        {
//            System.out.println(m);
//        }

        // looping through an Array in reverse direction

        for(int i=x.length-1; i>=0;i--)
        {
            System.out.println(x[i]);
        }
    }

}
