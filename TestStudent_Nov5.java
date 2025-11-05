package com.classesobjects;

public class TestStudent_Nov5{

    public static void main(String[] args) {

        Student_Nov5 s1 = new Student_Nov5();

        s1.id = 1;
        s1.name = "Rakesh";
        s1.standard = 5;
        s1.transportOpted = false;

        System.out.println(s1.getStudentDetails());

        s1.submitHomeWork();
        System.out.println(Student_Nov5.schoolName);
        Student_Nov5.schoolName = "Rotary School";
        //System.out.println(s1.schoolName);
        Student_Nov5.attendSchoolPrayer();

        System.out.println("==========");

        Student_Nov5 s2 = new Student_Nov5();
        s2.id = 2;
        s2.name = "Smitha";
        s2.standard = 6;
        s2.transportOpted = true;

        System.out.println(s2.getStudentDetails());
        s2.submitHomeWork();
        System.out.println(Student_Nov5.schoolName);
        Student_Nov5.attendSchoolPrayer();
        s2.attendSchoolPrayer();


        System.out.println("========");

        s1 = s2;

        System.out.println(s1.getStudentDetails());
        System.out.println(s2.getStudentDetails());

        s1=null;
        System.out.println(s1.getStudentDetails());




    }

}
