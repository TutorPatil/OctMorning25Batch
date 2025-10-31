package com.corejava.strings;

import java.util.Locale;

public class Oct31Strings {

    public static void main(String[] args) {






    }


    public static void stringMethodsImmutability()
    {
        String s = "selenium";

        System.out.println(s.length());

        s.toUpperCase();

        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);
    }


    public static void stringEx1()
    {

        String s = "java";

        String s1 = new String("java");

        String s2 = "java";

        // checking for the equality of references
        System.out.println(s==s1);

        // checking for the equality of the objects ( contents  )
        System.out.println(s.equals(s1));

        System.out.println((s==s2)); // checking for reference
        System.out.println(s.equals(s2)); // checking for Objects equality
    }




}
