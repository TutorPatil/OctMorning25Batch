package com.corejava.practice;

public class Oct7VariableTypes {

    static String personName  = "Rakesh";
    int age = 25;
    final static double salary  = 8000.50;
    static boolean isMarried = false;
    char countryCode = 'I';

    public static void printNameAndSalary() {
       final double bonus = 500.25; //the only keyword allowed for local variables is final.
       // bonus = 600.25;
       // salary = 10000.50;  //The final variables can't be modified
        System.out.println(" The name of the person is " + personName + " and his salary is " + salary +
                " and he is eligible for bonus of "+bonus);
    }
    public void printAgeAndCountryCode()
    {
        String state = "Karnataka";
        System.out.println("The age of the person is "+age +" and his country code is "+countryCode +
                " he is from " + state +" state ");


    }
    public static void main(String[] args) {
        System.out.println(personName);
        printNameAndSalary();
        Oct7VariableTypes v = new Oct7VariableTypes(); // creating instance of the class to access nonstatic members
        v.printAgeAndCountryCode();
        System.out.println(v.age);
    }







}
