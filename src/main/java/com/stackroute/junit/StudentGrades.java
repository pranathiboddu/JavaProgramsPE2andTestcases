/*Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.*/


package com.stackroute.junit;

public class StudentGrades {
    public static String gradeInput(int NumberOfStudent, int[] NGrades)//initialized number of students and array to store grades
    {
        if(NumberOfStudent<0  || NumberOfStudent >100) //checking if number of students are between 0 to 100
            return "given students input is wrong";

        if(NGrades.length!=NumberOfStudent) //checking if array of grades length and number of students are equal or not
        {
            return "Wrong Input";
        }

        for (int i =0;i<NumberOfStudent;i++)
        {
            if(NGrades[i]<0 || NGrades[i]>100) //checking if grades are between 0 to 100
            {
                return "given grades are wrong";
            }
        }

        String Result="";

        double tot=0;

        for (int i =0;i<NumberOfStudent;i++)
        {
            tot = tot + NGrades[i]; //calculating total sum of grades
        }

        String avg = avg(tot,NumberOfStudent); //method to calculate average

        int min = min(NGrades,NumberOfStudent); // method to calculate min
        int max = max(NGrades,NumberOfStudent); // method to calculate max

        Result = "The average is "+avg+" The minimum is "+min+" The maximum is "+max;

        return Result;
    }

    public static String avg(double total,int N){

        String s="";
        return s+(total/N); //calculating average
    }

    public static int min(int[] NGrades, int N)
    {
        int min= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]<min)
            {
                min = NGrades[i]; //calculating minimum
            }
        }

        return min;
    }

    public static int max(int[] NGrades, int N)
    {
        int max= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]>max)
            {
                max = NGrades[i]; //calculating maximun
            }
        }

        return max;
    }


}
