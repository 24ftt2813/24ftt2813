package Practical8;

import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        
        System.out.print("Enter " + n + " scores: ");
        int best = 1;
        for (int i = 1; i < n; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        for (int i = 0; i < n; i++) {
            char grade;
            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}