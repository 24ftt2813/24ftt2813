import java.util.Scanner;

public class Reverse5Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();

        if (word.length() ==5){
            String revword ="";

        for (int i = 4; i >= 0;
        i--) {

        revword = revword + word.charAt(i);

        }
        System.out.print("The reverse of the word"+ word + " is " + revword );
        }

        
    }
    
}
