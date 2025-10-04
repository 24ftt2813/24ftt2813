package Practical8;

import java.util.*;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

       
        int[] uniqueNumbers = new int[10];
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            if (numbers[i] < 1 || numbers[i] > 9) continue; // skip invalid input
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        
        Arrays.sort(uniqueNumbers, 0, uniqueCount);

        
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();
    }
}