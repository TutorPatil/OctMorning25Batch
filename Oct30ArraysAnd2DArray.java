package com.java.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Oct30ArraysAnd2DArray {


    static int[] x = {10,50,60,5,8,16,55};
    static String[] s = {"java","Testing","Automation"};
    static char[] c = {'a','x','m','b','c','d'};

    public static void main(String[] args) {

        varAgrsEx1(10,20,30,40,50,60,80,90);

//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//
//        for(String m:args)
//        {
//            System.out.println(m);
//        }

        if(args[0].equals("chrome"))
        {
            System.out.println(" Running the test cases using chrome...");
        }
        else if(args[0].equals("edge"))
        {
            System.out.println(" Running the test cases using edge...");
        }
        else
        {
            System.out.println(" Browseer not supported..");
        }



           }

           public static void varAgrsEx1(int...x)
           {
               //(String...s)
             int sum =0;

             for(int i=0;i<x.length;i++)
             {
                 sum += x[i];
             }
               System.out.println(sum);
           }


    public static void twoDArrayInOneLine()
    {
        int[] x = {10,50,60,5,8,16,55};
        String[] s = {"java","Testing","Automation"};
        char[] c = {'a','x','m','b','c','d'};

        int[][] y = {{10,20,30},{50,60,70}};
        String[][] s1 =  {{"java","Testing","Automation"},{"DataBase","DevOps"},{"Python","TypeScript","AI"}};

    }

    public static void twoDArrayEx2()
    {

        int[][] x = new int[3][];

        x[0] = new int[4];
        x[1] = new int[5];
        x[2] = new int[2];

        x[0][0] =  1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[0][3] = 10;
        x[1][0] =  4;
        x[1][1] =  5;
        x[1][2] = 6;
        x[1][3] = 7;
        x[1][4] = 18;
        x[2][0] =  8;
        x[2][1] =  9;

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static void twoDArrayEx1()
    {
        int[][] x = new int[3][3];
        System.out.println(x.length);

        x[0][0] = 10;
        x[0][1] = 20;
        x[0][2] = 30;
        x[1][0] = 40;
        x[1][1] = 50;
        x[1][2] = 60;
        x[2][0] = 70;
        x[2][1] = 80;
        x[2][2] = 90;

        for(int i = 0; i < x.length; i++)
        {
            for(int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }












    public static void arrayClassMethods()
    {

//
//        System.out.println(Arrays.toString(c));
//
//        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));
//
//        System.out.println(Arrays.binarySearch(c,'b'));


//        System.out.println(Arrays.toString(s));
//
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
//
//        System.out.println(Arrays.binarySearch(s,"Testing"));




//        System.out.println("Before sort");
//        System.out.println(x);
//        System.out.println(Arrays.toString(x));
//
//        System.out.println("After sort");
//        Arrays.sort(x);
//        System.out.println(Arrays.toString(x));
//
//        int m = Arrays.binarySearch(x,100);
//        System.out.println(m);


    }



}
