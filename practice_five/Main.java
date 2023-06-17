package practice_five;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Number of students: ");
        int numStudents = in.nextInt();

        // Defining arrays to store student information
        String[] names = new String[numStudents];
        int[] studentIDs = new int[numStudents];
        double[] grades = new double[numStudents];

        // Get the name, student number and grade for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student Name " + (i + 1) + ": ");
            names[i] = in.next();

            System.out.print("Student Number " + (i + 1) + ": ");
            studentIDs[i] = in.nextInt();

            System.out.print("Number of Student Numbers " + (i + 1) + ": ");
            int numGrades = in.nextInt();

            double sumGrades = 0;
            for (int j = 0; j < numGrades; j++) {
                System.out.print("Number " + (j + 1) + ": ");
                double grade = in.nextDouble();
                sumGrades += grade;
            }

            // Calculate the student's GPA
            double average = sumGrades / numGrades;
            grades[i] = average;
        }

        // Find the student with the highest GPA
        int maxIndex = 0;
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }

        // Find the student with the lowest GPA
        int minIndex = 0;
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] < grades[minIndex]) {
                minIndex = i;
            }
        }

        // Print the profile of the student with the highest GPA
        System.out.println("Student with the highest GPA:");
        System.out.println("Name: " + names[maxIndex]);
        System.out.println("Student number: " + studentIDs[maxIndex]);
        System.out.println("GPA: " + grades[maxIndex]);

        // Print the profile of the student with the lowest GPA
        System.out.println("Student with the lowest GPA:");
        System.out.println("Name: " + names[minIndex]);
        System.out.println("Student number: " + studentIDs[minIndex]);
        System.out.println("GPA: " + grades[minIndex]);
    }
}
