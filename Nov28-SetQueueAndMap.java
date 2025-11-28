package com.corejava.collections;

import java.util.*;

public class SetQueueAndMap {

    public static void main(String[] args) {


        Queue<Integer> pq = new PriorityQueue<>();

                pq.add(10);
                pq.add(15);
                pq.add(1);
                pq.add(16);
                pq.add(2);
                pq.add(20);

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());







    }

    public static void treeSetExamSorted()
    {
        Set<Integer> iSet = new TreeSet<>();

        iSet.add(10);
        iSet.add(1);
        iSet.add(100);
        iSet.add(150);
        iSet.add(2);
        iSet.add(8);

        System.out.println(iSet);

        Set<String> sSet = new TreeSet<>();
        sSet.add("Java");
        sSet.add("Python");
        sSet.add("C");
        sSet.add("TypeScript");
        sSet.add("Selenuim");


        System.out.println(sSet);
    }

    public static void iteratingOverSet()
    {
        Set<Integer> iSet = new HashSet<>();

        iSet.add(1);
        iSet.add(15);
        iSet.add(100);
        iSet.add(150);
        iSet.add(18);
        iSet.add(100);
        iSet.add(150);

        // Looping through a set using for each loop
        //        for(Integer i:iSet)
        //        {
        //            System.out.println(i);
        //        }

        // looping through the set using iterator

        Iterator<Integer> i = iSet.iterator();

        System.out.println(iSet);

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }

    public static void setExample2UniqueCharFromString()
    {

        Set<Character> cSet = new HashSet<>();

        String s = "Selenium";

        for(int i = 0; i < s.length(); i++)
        {
            char c =  s.charAt(i);
            //Character c1 = new Character(c);
            //cSet.add(c1);
            cSet.add(c);
        }

        System.out.println(cSet);

        Set<Character> cSet1 = new HashSet<>();

        String s1 = "Selenium";

        char[] c2 = s1.toCharArray();
//        for(char c : c2)
//        {
//            cSet1.add(c);
//        }
        for(int i = 0; i < c2.length; i++)
        {
            cSet1.add(c2[i]);
        }
        System.out.println(cSet1);

    }


    public static void setExample1()
    {
        Set<Integer> iSet = new HashSet<>();

        iSet.add(1);
        iSet.add(15);
        iSet.add(100);
        iSet.add(150);
        iSet.add(18);
        iSet.add(100);
        iSet.add(150);

        System.out.println(iSet);

        Set<String> sSet = new HashSet<>();

        sSet.add("Java");
        sSet.add("C");
        sSet.add("C++");
        sSet.add("Python");
        sSet.add("JavaScript");
        sSet.add("Java");
        sSet.add("C");

        System.out.println(sSet);
    }


}
