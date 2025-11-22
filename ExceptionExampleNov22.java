package com.corejava.exceptions;

import com.classesobjects.Student;
import com.corejava.oops.inheritance.*;

import java.io.File;
import java.io.IOException;

public class ExceptionExampleNov22 {


    public static void main(String[] args) throws IOException {

        int x = 10;
        int z = x/1;

        System.out.println(z);

        try {
            int[] arr = {10, 20, 30, 40};
            System.out.println(arr[1]);
            String s = "Selenium";
            System.out.println(s.charAt(10));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }






        //s = null;

        //System.out.println(s.length());

        String s1  = "1234";
        int m = Integer.parseInt(s1);

        System.out.println(m);

        String s2 = "1234@#$";
       // int n = Integer.parseInt(s2);

        //System.out.println(n);

       File f = new File("D:\\Sample123.txt");
       try {
           f.createNewFile();
       }catch(IOException io)
       {
           io.printStackTrace();
       }
        File f1 = new File("X:\\Sample12345.txt");
        f1.createNewFile();

        System.out.println("==================");






        //method1();

    }


    public static void method1()
    {
        int x = 10;
        System.out.println(x+ " Inside method 1....");
        method2();
    }

    public static void method2()
    {
        int y = 20;
        System.out.println(y+ " Inside method ....");
        method1();
    }
}
