package com.corejava.strings;

public class Nov3Strings {

    public static void main(String[] args) {
        //stringEx3();

       //int count =  findCountOfChar("classes",'s');
       // System.out.println(count);

        String s = "selenium";
        String s1 = "";

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            String s2 = String.valueOf(c);

            if ( s1.contains(s2) == false)
            {
                s1 = s1+s.charAt(i);
            }
        }

        System.out.println(s1);
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            System.out.println(s.charAt(i)+" = "+findCountOfChar(s,s.charAt(i)));
//        }
//
//        System.out.println(s.contains("e"));

    }

    public static void stringEx1()
    {
        String s = "Selenium";

        System.out.println(s.charAt(6));

        System.out.println(s.indexOf('e'));

        System.out.println(s.lastIndexOf('e'));

        System.out.println("=================");
        // Looping through the string
        for(int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }




    }


    public static void stringEx2()
    {
        String s = "Selenium";
        String s1 = "";

        // looping through the reverse

        for(int i=(s.length()-1); i>=0; i--)
        {
            s1 = s1+s.charAt(i);
        }

        System.out.println(s1);

    }


    public static void stringEx3()
    {
        String s = "Selenium";;

        s = s.replace("e","b");
        System.out.println(s);

        int len2 = s.length();

        String s1 = s.replace("b","");
        int len1 = s1.length();

       int len = len2-len1;
        System.out.println(len);




    }

    public static int findCountOfChar(String s , char c)
    {
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                count++;
            }
        }
        return count;

    }
}
