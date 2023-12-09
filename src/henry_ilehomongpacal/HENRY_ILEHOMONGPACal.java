/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package henry_ilehomongpacal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DESTINY
 */
public class HENRY_ILEHOMONGPACal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner x = new Scanner(System.in);

       //Input the number of courses
        System.out.print("Enter the number of courses offered: ");
        int course_number = x.nextInt();

       //Arrays to store course names, credit units, and scores
        double[] myGradePoint;
        double size = course_number;
        String[] courseNames = new String[course_number];
        int[] courseUnit = new int[course_number];
        double[] scores = new double[course_number];

 //Input information for each course
        for (int y = 0; y < course_number; y++) {
            System.out.println("\nEnter Details for Course Taken " + (y + 1) + ":");
            System.out.print("Course Name&Code: ");
            courseNames[y] = x.next();
            System.out.print( "Course Unit: ");
            courseUnit[y] = x.nextInt();
            System.out.print("Score: ");
            scores[y] = x.nextDouble();
        }

         // table arrangement
        System.out.println("\nGrades and Course Units Table:");
        System.out.println(     "|--------------------------------------------|");
        System.out.printf("|%-11s| %-4s| %-4s| %-4s%n|","Course Name&Code","Course Unit","Grade","Grade-Unit");
        System.out.println(    "---------------------------------------------");

        for (int a = 0; a < course_number; a++) {
            String grade = getGrade(scores[a]);
            int gradePoint = getGradePoint(scores[a]);
            
            System.out.printf("|%-13s| %-6d| %-5s| %-9d%n|", courseNames[a],courseUnit[a],grade,gradePoint);
        }

        System.out.println("-------------------------------------------------");
        
          //Calculate grades and print the table
  System.out.println("\nGrades and Course Units Table:");
        System.out.println("|------------------------------------------------|");
        System.out.printf("%-11s| %-5s| %-5s| %-9s %n|", "Course Name&Code", "Course Unit", "Grade", "Grade-Unit");
        System.out.println("------------------------------------------------|");

        int totalQualityPoints = 0;
        int totalGradeUnits = 0;

        for (int i = 0; i < course_number; i++) {
            String grade = getGrade(scores[i]);
            int gradePoint = getGradePoint(scores[i]);

            totalQualityPoints += gradePoint * courseUnit[i];
            totalGradeUnits += courseUnit[i];

            System.out.printf(" %-15s| %-11d| %-5s| %-8d %n", courseNames[i], courseUnit[i], grade, gradePoint);
        }

        double gpa = (double) totalQualityPoints / totalGradeUnits;
  System.out.println("|------------------------------------------------|");
          
//Format GPA to two decimal places
        DecimalFormat df = new DecimalFormat("#.## in 2 Decimal places");
        String formattedGPA = df.format(gpa);

        System.out.println("\nTotal GPA: " + formattedGPA);

        x.close();
    }

     //Method to calculate the grade based on the score
    private static String getGrade(double score) {
        if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D";
        }
        else if (score >= 40) {
            return "E";
        }else {
            return "F";
        }
    }
       //calculation of the gradepoint based on the score
    private static int getGradePoint(double score) {
 if (score >= 70) {
            return 5;
        } else if (score >= 60) {
            return 4;
        } else if (score >= 50) {
            return 3;
        } else if (score >= 45) {
            return 2;
        }
        else if (score >= 40) {
            return 1;
        }else {
            return 0;
        }
    }
    }
    

