package Practical8;

import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create and shuffle array 0-9
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        // Shuffle once
        Random rand = new Random();
        for (int i = numbers.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        // Pick first 4 as the answer
        int[] answer = Arrays.copyOf(numbers, 4);

        int chances = 10;
        boolean won = false;
        while (chances > 0) {
            System.out.print("Guess 4 numbers (no duplicate): ");
            String[] guessStr = input.nextLine().trim().split("\\s+");

            // Parse and check for duplicates
            Set<Integer> guessSet = new HashSet<>();
            int[] guess = new int[4];
            boolean valid = true;
            if (guessStr.length == 4) {
                for (int i = 0; i < 4; i++) {
                    try {
                        guess[i] = Integer.parseInt(guessStr[i]);
                        if (guess[i] < 0 || guess[i] > 9 || !guessSet.add(guess[i])) {
                            valid = false;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        valid = false;
                        break;
                    }
                }
            } else {
                valid = false;
            }

            // If invalid, just skip this chance
            if (!valid) {
                chances--;
                System.out.println("You have score 0 out of 4 numbers. You have " + chances + " chances left.");
                continue;
            }

            // Calculate score
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == answer[i]) {
                    score++;
                }
            }

            chances--;
            System.out.println("You have score " + score + " out of 4 numbers. You have " + chances + " chances left.");

            if (score == 4) {
                System.out.println("You won! You got the actual numbers!");
                won = true;
                break;
            }
        }
        if (!won) {
            System.out.print("The actual numbers are: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println("You lose.");
        }
    }
}