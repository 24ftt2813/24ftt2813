import java.util.Scanner; // Required for user input

public class GradeMCQ {

    public static void main(String[] args) {
        // 1. Create a two-dimensional array using char datatype for student answers
        // The array stores answers for 4 students across 6 questions.
        // Rows represent students, columns represent questions.
        char[][] studentAnswers = {
            // Q1, Q2, Q3, Q4, Q5, Q6
            {'A', 'B', 'C', 'D', 'A', 'B'}, // Student 1's answers
            {'C', 'D', 'A', 'D', 'A', 'B'}, // Student 2's answers
            {'D', 'A', 'D', 'A', 'B', 'B'}, // Student 3's answers
            {'C', 'D', 'A', 'D', 'A', 'C'}  // Student 4's answers
        };

        // Get the number of students and questions from the array dimensions
        int numStudents = studentAnswers.length;
        int numQuestions = studentAnswers[0].length; // Assumes all students answer the same number of questions

        Scanner scanner = new Scanner(System.in); // Initialize Scanner for input

        // 2. Create a character single dimensional array for the answer key
        // and use a loop and charAt() method to capture input from the lecturer.
        System.out.print("Enter the key to the MCQ: ");
        String keyInput = scanner.nextLine(); // Read the entire line of input for the key

        // Basic validation for the key length
        if (keyInput.length() != numQuestions) {
            System.out.println("Error: The key must contain " + numQuestions + " characters.");
            System.out.println("Please restart the program and enter a valid key.");
            scanner.close(); // Close the scanner before exiting
            return; // Exit the program
        }

        char[] answerKey = new char[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            // Convert each character of the input string to uppercase and store in the answerKey array
            answerKey[i] = Character.toUpperCase(keyInput.charAt(i));
        }

        // 3. Using nested loop and a counter, go through each answer
        // while each correct answer increases the counter.
        for (int i = 0; i < numStudents; i++) { // Outer loop iterates through each student
            int correctCount = 0; // Initialize correct answer counter for the current student

            for (int j = 0; j < numQuestions; j++) { // Inner loop iterates through each question
                // Compare the student's answer for the current question with the correct answer from the key
                if (studentAnswers[i][j] == answerKey[j]) {
                    correctCount++; // Increment counter if the answer is correct
                }
            }

            // 4. Using if and else or ternary operator to find out if the student passed or fail.
            // Based on the example output, a score of 4 or more correct answers results in a "passed" status.
            String passFailStatus = (correctCount >= 4) ? "passed" : "failed";

            // 5. Output each line.
            // Display the student's number (i+1), their correct count, and their pass/fail status.
            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.%n",
                              (i + 1), correctCount, passFailStatus);
        }

        scanner.close(); // Close the scanner to release system resources
    }
}
