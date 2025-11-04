package com.corejava.strings;

public class Nov4Strings {

    public static void main(String[] args) {
        stringBuilderEx1();
    }

    public static void stringEx1()
    {
        int x  = 1234;

        String s = String.valueOf(x);
        System.out.println(s.length());
        String sRev = "";
        for(int i=(s.length()-1);i>=0;i--)
        {
            sRev = sRev+s.charAt(i);
        }
        System.out.println(sRev);
        int xRev = Integer.parseInt(sRev);

        char c = 'a';

        // char in to String
        String sChar = String.valueOf(c);
    }

    public static void stringEx2()
    {

    String s = "Java is very easy and interesting..";
        String[] sArray = s.split(" ");
        System.out.println(sArray.length);

        for(String s1 : sArray)
        {
            System.out.println(s1);
        }

    }

    public static void stringEx3()
    {
        String s = "  Java is very interesting and easy and fun..   ";

        String sSub = s.substring(3);
        System.out.println(sSub);

        String sSub1 = s.substring(3,8);
        System.out.println(sSub1);

        //  trims the leading and trainling spaces..
        String sTrim = s.trim();
        System.out.println(sTrim);

        // COnverting a string in to charArray
        char[] cArray = s.toCharArray();

        for(char m:cArray)
        {
            System.out.println(m);
        }

        String s1 = "";
        System.out.println(s1.isEmpty());
    }

    public static void stringBuilderEx1()
    {
            StringBuilder sb = new StringBuilder("selenium");
             sb.append("Automaion");

        System.out.println(sb);

        sb.insert(5,"java and ");
        System.out.println(sb);

        sb.delete(5,5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.isEmpty());




    }

}
