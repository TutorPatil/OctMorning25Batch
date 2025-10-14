package com.corejava.controlflow;

public class Oct14ControlFlowSwitch {

    public static void main(String[] args) {
        switchEx3();
    }

    public static void biggestOf3Numbers()
    {
        int x = 30;
        int y = 45;
        int z = 20;

        if (x > y)
        {
            if( x > z )
            {
                System.out.println(" x is the biggest..");
            }
            else
            {
                System.out.println(" z is the biggest..");
            }
        }
        else
        {
            if( y > z )
            {
                System.out.println(" y is the biggest..");
            }
            else
            {
                System.out.println(" z is the biggest..");
            }
        }


    }

    public static void biggestOf3Numbers1()
    {
        int x = 30;
        int y = 45;
        int z = 20;

        // Comparing x with y & z
       if (( x>y ) && (x > z))
       {
           System.out.println(" x is the biggest..");
       }
        // Comparing y with x & z
        if (( y > x ) && (y > z))
        {
            System.out.println(" y is the biggest..");
        }
        // Comparing z with x & y
        if (( z > x ) && (z > y))
        {
            System.out.println(" z is the biggest..");
        }



    }


    public static void ifElseIfEx()
    {
        int month = 3;

        if(month == 1)
            System.out.println(" you are in Jan Month");
        else if(month == 2)
            System.out.println(" you are in Feb Month");
        else if (month ==3)
            System.out.println(" you are in March Month");

        else if (month ==4)
             System.out.println(" you are in April Month");
        else
            System.out.println(" Please enter correct value for month....");
    }


    public static void switchEx1()
    {
        int month = 3;
        switch (month)
        {
            case 1:
            {
                System.out.println("you are in Jan Month");
                break;
            }
            case 2:
            {
                System.out.println("you are in Feb Month");
                break;
            }
            case 3:
            {
                System.out.println("you are in March Month");
                break;
            }
            case 4:
            {
                System.out.println("you are in April Month");
                break;
            }
            default:
            {
                System.out.println("Pls enter valid value for month");
                break;
            }
        }
    }

    public static void switchEx2()
    {
        String browser = "firefox";

        switch (browser)
        {
            case "chrome":
            {
                System.out.println(" Running the test cases using chrome browser..");
                break;
            }
            case "firefox":
            {
                System.out.println(" Running the test cases using firefox browser..");
                break;
            }
            case "edge":
            {
                System.out.println(" Running the test cases using edge browser..");
                break;
            }
            case "safari":
            {
                System.out.println(" Running the test cases using safari browser..");
                break;
            }
            default:
            {
                System.out.println(" Browser not supported..!");
            }








        }






    }

    public static void switchEx3()
    {
        int month = 2;
        int year = 2004;

        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                System.out.println("Your month has 31 days....");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                System.out.println("Your month has 30 days....");
                break;
            }
            case 2:
            {
                if ( year % 4 == 0)
                {
                    System.out.println("Your month has 29 days....");
                }
                else
                {
                    System.out.println("Your month has 28 days....");
                }
                break;
            }
            default:
            {
                System.out.println("Pls enter valid value for month");
                break;
            }
        }
    }
}
