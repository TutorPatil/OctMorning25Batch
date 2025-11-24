package com.corejava.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ExceptionFinallyAndFlowsNov24 {



    public static void main(String[] args) throws Exception {

        // handling using try catch block..
        try {
            exceptionWithoutTryCatchFinallay();
        } catch (Exception e) {
           e.printStackTrace();
        }

        // handling using throws keyword ( not handling in case exception comes...
        exceptionWithoutTryCatchFinallay();

        finallyEx();

        try {
            uncheckedEx1();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        uncheckedEx1();

        exceptionWithoutTryCatchFinallay1();

    }


    public static void uncheckedEx1()
    {

        try {
            int x = 10;
            int z = x / 0;
            System.out.println(z);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block....");
        }

    }



        public static void exceptionWithoutTryCatchFinallay() throws IOException
        {

            File f = new File("D:\\test123.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            fw.write("Welcome to java");
            fw.write("Welcome to Exceptions");
            fw.flush();
            fw.close();
        }

    public static void exceptionWithoutTryCatchFinallay1()
    {

        try {
            File f = new File("D:\\test123.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            fw.write("Welcome to java");
            fw.write("Welcome to Exceptions");
            fw.flush();
            fw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }





        public static void finallyEx()
        {
            File f = null;
            FileWriter fw = null;
            try {
                f = new File("D:\\test1233\sample.txt");
                f.createNewFile();
                fw = new FileWriter(f);
                fw.write("Welcome to Java");
                fw.write("Java is very fun to learn");
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    //fw.flush();
                    //fw.close();
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
            finally {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }






