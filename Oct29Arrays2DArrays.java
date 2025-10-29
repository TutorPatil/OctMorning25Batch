package com.java.arrays;

import java.util.Arrays;

public class Oct29Arrays2DArrays {

    public static void main(String[] args) {
        //searchElementInStringArray();

//        String[] s = {"java","Automation","Testing"};
//        String str = "Automationasdaca";
//        System.out.println(searchELementInStringArray(s, str));

//        int[] x = {10,20,25,30,40};
//        System.out.println(addArrayElements(x));

//        int[] x = {10,30,15,5,3,1,8,100,80};
//        int[] y = sortIntArray1(x,"asc");
//        for(int m:y){
//            System.out.print(m+" ");
//        }

        // Annonymous arrays
//        int[] y = sortIntArray1(new int[]{10,30,15,3,1,8},"asc");
//        for(int m:y){
//            System.out.print(m+" ");
//        }

        int[] x = {10,30,15,5,3,1,8,100,80};
        //Arrays.sort(x); // Sorting

//        for(int m:x){
//            System.out.print(m+" ");
//        }

//        String s = Arrays.toString(x); // converting an array to String
//        System.out.println(s);

        Arrays.sort(x);
        System.out.println(Arrays.binarySearch(x,150));

        // 0 or any + ve integer then the element is present
        // if the result is -ve then the element is not present.


    }

    public static void searchElementInStringArray()
    {
        String[] s = {"java","Selenim","Automation","Testing"};
        String str = "AutomationqwyF";
        boolean result = false;

        for( int i=0; i<s.length; i++ )
        {
            if(s[i].equals(str))
            {
                result = true;
                break;
            }
            else {
                result = false;
            }
        }
        if(result==true) {
            System.out.println(str + " is present in the array");
        }
        else {
            System.out.println(str + " is not present in the array");
        }


    }


    public static boolean searchELementInStringArray(String[] s, String str)
    {
        boolean result = true;

        for(String i: s)
        {
            if(i.equals(str))
            {
                result = true;
                break;
            }
            else
                result = false;
        }

        return result;
    }

    public static int addArrayElements(int[] arr)
    {
      int sum = 0;
      for(int i=0; i<arr.length; i++)
      {
          sum = (sum + arr[i]);
      }
        return sum;
    }

    public static void sortIntArray(int[] x,String order)
    {
        int temp = 0;
        //int[] x = {10,30,15,5,3,1,8,100,80};
        for(int i=0; i<x.length; i++)
        {
            for( int j=i+1; j<x.length; j++)
            {
                  if(order.equals("asc"))
                {
                    if (x[i] > x[j]) {
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
                else if(order.equals("desc"))
            {
                if (x[i] < x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
            }
        }

        for(int m: x)
        {
            System.out.print(m+" ");
        }
        System.out.println();

        System.out.println(" The minimum value is "+x[0]);
        System.out.println(" The maximum value is "+x[x.length-1]);
    }

    public static int[] sortIntArray1(int[] x,String order)
    {
        int temp = 0;
        //int[] x = {10,30,15,5,3,1,8,100,80};
        for(int i=0; i<x.length; i++)
        {
            for( int j=i+1; j<x.length; j++)
            {
                if(order.equals("asc"))
                {
                    if (x[i] > x[j]) {
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
                else if(order.equals("desc"))
                {
                    if (x[i] < x[j]) {
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
            }
        }

       return x;
    }
}
