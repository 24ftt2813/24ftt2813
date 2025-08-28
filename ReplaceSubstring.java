import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = input.nextLine();

        System.out.println("Enter the substring to replace:");
        String substring = input.nextLine();

        System.out.println("Enter the replacement string:");
        String newstring = input.nextLine();

        String replacemessage = message.replace(substring, newstring);

        System.out.println("The updated message is:");

        System.out.println(replacemessage);

        
    }
}
