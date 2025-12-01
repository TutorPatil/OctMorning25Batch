package com.corejava.collections;

import java.util.*;

public class MapAndHashMap {


    public static void main(String[] args) {

    }

    public static void complexDataStructuresEx()
    {
        Map<Integer,Map<String,Integer>> hm = new HashMap<>();
        Map<String,Integer> subMarks = new HashMap<>();


        subMarks.put("Hindi",85);
        subMarks.put("English",95);
        subMarks.put("Maths",99);
        subMarks.put("Science",88);

        Map<String,Integer> subMarks1 = new HashMap<>();
        subMarks1.put("Hindi",75);
        subMarks1.put("English",85);
        subMarks1.put("Maths",98);
        subMarks1.put("Science",85);

        hm.put(101,subMarks);
        hm.put(102,subMarks1);

        //hm.put(103,new HashMap<String ,Integer>.put("Hindi",95,"English",88));

        System.out.println(hm);

        Map<String,ArrayList<Integer>> student = new HashMap<>();
        List<Map<String,Integer>> list = new ArrayList<>();

    }


    public static void hashMapCharOccurances()
    {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(101,"Ramu");
        hm.put(106,"Rahman");
        hm.put(115,"Smitha");
        hm.put(150,"Shantanu");
        hm.put(180,"Jagadish");

        System.out.println(hm);
        hm.remove(106);

        System.out.println(hm);

        System.out.println(hm.size());

        System.out.println(hm.get(115));

        System.out.println(hm.get(175));

        System.out.println(hm.getOrDefault(175,"xyz"));
        System.out.println(hm.getOrDefault(180,"xyz"));


        String s = "Selenium";
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(char c1 : c)
        {
            map.put(c1,(map.getOrDefault(c1,0)+1));
        }

        System.out.println(map);
    }

    public static void findCharAndItsOccurance()
    {
        Map<Character, Integer> map = new HashMap<>();
        String s = "Selenium";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                Integer j = map.get(c);
                map.put(c,j+1);
            }
            else {
                map.put(c, 1);
            }

        }
    }


    public static void hashMapEx1()
    {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(101,"Ramu");
        hm.put(106,"Rahman");
        hm.put(115,"Smitha");
        hm.put(150,"Shantanu");
        hm.put(180,"Jagadish");

        System.out.println(hm);
        System.out.println(hm.get(115));

        Set<Integer> kSet = hm.keySet();
        System.out.println(kSet);


        System.out.println(hm.containsKey(150));

        System.out.println(hm.containsValue("Smitha"));

        Collection<String> col =  hm.values();
        System.out.println(col);
    }



}

