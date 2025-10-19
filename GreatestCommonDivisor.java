import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

    
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

       
        int gcd = findGCD(num1, num2);

      
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);

     
        input.close();
    }
    public static int findGCD(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
