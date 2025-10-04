package Practical8;

import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers are there? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter number of left shifts: ");
        int shift = input.nextInt();
        shift = shift % n;

        int[] shifted = new int[n];
        for (int i = 0; i < n; i++) {
            shifted[i] = numbers[(i + shift) % n];
        }

        System.out.print("The shifted arrangement is: ");
        for (int num : shifted) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}