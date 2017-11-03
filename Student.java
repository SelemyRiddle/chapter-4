// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double score1;
    private double score2;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name=studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of 
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter test1 score for "+this.name+": ");
        score1=scan.nextDouble();
        System.out.println("Enter test2 score for "+this.name+": ");
        score2=scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage(){
        //add body of getAverage
        return ((score1+score2)/2);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName(){
        //add body of getName
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public String toString(){
        //add body of printName
        return "Name: "+this.name+", Test 1: "+this.score1+", Test 2: "+this.score2;
    }
}