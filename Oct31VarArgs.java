package com.corejava.practice;

public class Oct31VarArgs {
    static int sum;

    public static void main(String[] args) {


    }

//        System.out.println(addNumbers(10,20));
//        System.out.println(addNumbers(10));
//        System.out.println(addNumbers(10,20,30));
//        System.out.println(addNumbers(10,20,30,40));
    public static int addNumbers(int...x)
    {
        int sum = 0;
        for(int i=0;i<x.length;i++)
        {
            sum = sum + x[i];
            //sum += x[i];
        }
        return sum;
    }


//       System.out.println(joinEmpDetails("Ramu","BTech","Delhi"));
//        System.out.println(joinEmpDetails("Peter","MTech","London","UK"));
    public static String joinEmpDetails(String...s)
    {
        String s1 = "";

        for(int i=0;i<s.length;i++)
        {
            if(i==0)
            {
                s1 = s1+""+s[i];
            }
            else
            {
                s1 = s1+"--"+s[i];
            }
            s1 = s1+"--"+s[i];
        }
        return s1;
    }

    public static String[][] joinStrings()
    {
        String[][] s = {{"Java","Selenium"},{"Dev","QA","DevOPs"},{"Testing,Mgmt"}};

        return s;
    }

    public static void arraysOfObjects()
    {
        Oct31VarArgs o1 = new Oct31VarArgs();
        Oct31VarArgs o2 = new Oct31VarArgs();
        Oct31VarArgs o3 = new Oct31VarArgs();

        int[] x = new int[3];
        int[] y = {10,20,30};

        Oct31VarArgs[] objArr = new Oct31VarArgs[3];

        Sample s = new Sample();
        Sample s1 = new Sample();
        Sample s2= new Sample();


        Sample[] sArray = new Sample[3];

        Sample[] sArr = {s,s1,s2};
    }

}
