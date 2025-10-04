package Practical8;
import java.util.Scanner;

public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = new String[alphabet.length()];

        for (int i = 0; i < alphabet.length(); i++) {
            letters[i] = String.valueOf(alphabet.charAt(i));
        }

        for (String letter : letters) {
            System.out.print(letter + " ");
        }


    }
    
}
