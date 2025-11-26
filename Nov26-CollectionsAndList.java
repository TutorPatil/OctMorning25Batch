package com.corejava.collections;

import com.corejava.oops.Car;
import com.corejava.oops.inheritance.Bike;

import java.util.*;


public class CollectionsAndList {

    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car();
        Bike b = new Bike();

        List al = new ArrayList();
            al.add("Selenium");
            al.add(50);
            al.add(c);
            al.add(b);


        System.out.println(al.size());

        System.out.println(al.remove(b));

        //System.out.println(al.contains(c));

        System.out.println(al.isEmpty());



        List al2 = new ArrayList();

            al.add(500);
            al.add(c1);


        al.addAll(al2);

        System.out.println(al.size());

        System.out.println(al.containsAll(al2));

        al.removeAll(al2);

        al.addAll(al2);

        al.retainAll(al2);

        System.out.println(al);

        List<String> strList = new ArrayList<String>();

        strList.add("Java");
        strList.add("Python");
        strList.add("C#");
        strList.add("C++");
        strList.add("Selenium");
        strList.add("C#");

        System.out.println(strList.size());

        System.out.println(strList);

       // strList.add(500);





    }
}
