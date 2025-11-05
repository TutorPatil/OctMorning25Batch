package com.classesobjects;

public class Student_Nov5 {

    int id;
    String name;
    int standard;
    boolean transportOpted;
    static String schoolName = "MG school";


        public String getStudentDetails()
        {
            int x = 10;
            String details = "Student Name is "+name +" Roll num is "+ id+" studying in  "+standard;
            return details;
        }

        public void submitHomeWork()
        {
            System.out.println(" The student having roll num "+ id+" Name "+name +" Has not submitted homework");
        }

        public static void attendSchoolPrayer()
        {
            System.out.println(" All the students of school "+schoolName + " Must attend school prayer..");

        }

}
