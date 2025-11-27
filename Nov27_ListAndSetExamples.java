package com.corejava.collections;


import com.classesobjects.Student;
import com.corejava.oops.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExamples {


    public static void main(String[] args) {




    }

    public static void removeDUplicateCharsFromString()
    {
        Set<Character> cSet = new HashSet<Character>();
        Set<Character> cSet1 = new HashSet<Character>();

        String s = "Selenium";
        char[] cArray = s.toCharArray();

        for(int i=0;i<cArray.length;i++)
        {
            cSet1.add(cArray[i]);
        }

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            cSet.add(c);
        }

        System.out.println(cSet1);
        System.out.println(cSet);

    }

    public static void setExample1()
    {

        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("Selenium");
        set.add("Automation");
        System.out.println(set.add("Java"));
        set.add("Testing");

        System.out.println(set);
    }

    public static void listSpecificMethods()
    {

        List<String> lStr = new ArrayList<String>();

        lStr.add("Java");
        lStr.add("Selenium");
        lStr.add("Automation");
        lStr.add("Testing");

        System.out.println(lStr.size());

        // Looping through the list using for each loop
        for(String s: lStr)
        {
            System.out.println(s);
        }


        System.out.println("==============");

        String s1 =  lStr.get(1);
        System.out.println(s1);

        System.out.println("==================");
        // looping through the list using for loop and index
        for(int i=0;i<lStr.size();i++)
        {
            System.out.println(lStr.get(i));
        }

        // Set Method of List only applicable to list
        System.out.println("++++++++++++++++++++++++");

        System.out.println(lStr);
        lStr.set(3,"AI");
        System.out.println(lStr);

        System.out.println("------------------------------");

        lStr.add(1,"CICD");
        System.out.println(lStr);

        System.out.println("=======================");

        lStr.addFirst("Manual Testing");
        lStr.addLast("Agentic Testing");

        System.out.println(lStr);

        System.out.println("**************************");
        System.out.println(lStr);

        lStr.remove("Selenium");
        lStr.remove(1);

        System.out.println(lStr);

        System.out.println("============");

        List<String> l2 = new ArrayList<String>();

        l2.add("Python");
        l2.add("C#");
        l2.add("Java");
        l2.add("C++");
        l2.add("TypeScript");

        lStr.addAll(l2);
        System.out.println(lStr);

        lStr.addAll(1,l2);

        System.out.println(lStr);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");

        List<String> l3 = new ArrayList<String>();

        l2.add("Python");
        l2.add("C#");
        l2.add("Java");
        l2.add("C++");
        l2.add("TypeScript");

        System.out.println(l2.equals(l3)); // fasle

        System.out.println("+++++++++++++++++++++++");

        System.out.println(lStr.indexOf("Python"));

        // GIves a sulist from the origanl list
        List<String> l4 = lStr.subList(1,5);

        System.out.println(l4);

        List<String> lRev = lStr.reversed();
        System.out.println(lRev);

        Object[] oArray = lStr.toArray();

        for(Object o: oArray)
        {
            System.out.println(o);
        }

        Student st1 = new Student(150,"Ramu",5,true);
        Student st2 = new Student(200,"Smitha",8,false);
        Student st3 = new Student(250,"Abdul",7,true);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        for(Student s: studentList)
        {
            System.out.println(s);
        }

        for(Student s: studentList)
        {
            System.out.println(s.name);
        }







    }

    public static void listExampleHetro1()
    {
        List l1 = new ArrayList();
        Car c = new Car();

        l1.add("Java");
        l1.add("Selenium");
        l1.add(50);
        l1.add('a');
        l1.add(c);
        l1.add("Java");


        System.out.println(l1.size());
        System.out.println(l1.contains("Selenium"));
        l1.remove("Java");
        System.out.println(l1.size());
        System.out.println(l1);
    }


    

}
