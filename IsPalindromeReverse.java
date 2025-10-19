
import java.util.Random;
import java.util.Scanner;

public class IsPalindromeReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
       

    
        int numberOfRounds = 5;
        for (int i = 1; i <= numberOfRounds; i++) {
          
            int originalNumber = random.nextInt(900) + 100; 

            System.out.print("\nEnter the reverse of " + originalNumber + ": ");
            int reversenum= 0;
            boolean validInput = false;

            
            while (!validInput) {
                if (input.hasNextInt()) {
                   reversenum = input.nextInt();
                    if (reversenum >= 100 && reversenum <= 999) {
                        validInput = true; // Input is a valid 3 digit number
                    } else {
                        System.out.print("Please enter a 3-digit reverse number of " + originalNumber + ": ");
                    }
                } else {
                    System.out.print("Invalid input. Please enter an integer: ");
                    input.next(); // Consume the invalid input to prevent an infinite loop
                }
            }

            
            if (isPalindrome(originalNumber, reversenum)) {
                System.out.println("The digit  " + reversenum + " palindrome of " + originalNumber + " is true");
                num++;
            } else {
                System.out.println("The digit " + originalNumber + "palindrome of " + reversenum + " is false.");
            }

        } 

        
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int originalNumber, int userReverse) {
        
        int actualReverse = reverse(originalNumber);

       
        return userReverse == actualReverse;
    }
}
