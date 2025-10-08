package com.corejava.practice;

public class Oct8Debugging {
    static int age = 20;
    String name = "Rakesh";

    public static void addNumbers()
    {
        int a = 10;
        int b = 20;

        int sum = (a + b);
        System.out.println(" The sum of two numbers is "+sum);

    }

    public static void main(String[] args) {
        System.out.println(" starting main method..");
        System.out.println(age);
        addNumbers();
        System.out.println(" ending main method..");


    }

}
