package EncryptixJavaTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {


    public static void main(String[] args) {
        //    Input: Take marks obtained (out of 100) in each subject.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");


        int noOfSub = scanner.nextInt();
        System.out.println("no. of subjects entered are: " + noOfSub);

        System.out.println("input marks of the student: ");
        //store marks of the students in an array
        ArrayList<Integer> marksArray = new ArrayList<>();
        for (int i=0; i<noOfSub;i++) {
            int marksOfStudent = scanner.nextInt();
            marksArray.add(marksOfStudent);
            System.out.println("students marks are: " + marksOfStudent);
            System.out.println(marksArray);

        }

//    Calculate Total Marks: Sum up the marks obtained in all subjects.

        int TotalMarks=0;
        for (Integer integer : marksArray) {
            TotalMarks += integer;
        }
        System.out.println(TotalMarks);

        float percentage = (float) TotalMarks/marksArray.size();
        System.out.println(percentage);


//    Grade Calculation: Assign grades based on the average percentage achieved
        String grade = "";
        if(percentage>80){
            grade = "A";
            System.out.println("A");
        } else if (percentage<80 && percentage>70) {
            grade = "B";
            System.out.println("B");
        } else if (percentage<69 && percentage>60) {
            grade = "C";
            System.out.println("C");
        } else if (percentage<59 && percentage>50) {
            grade = "D";
            System.out.println("D");
        }
        else {
            grade = "F";
            System.out.println("F");
        }



    }

}