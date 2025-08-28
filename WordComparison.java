import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstword = input.nextLine();

        System.out.print("Enter the second word: ");
        String seconword = input.nextLine();

        String lowcasefirstword = firstword.toLowerCase();
        String lowcaseseconword = seconword.toLowerCase();

        boolean issame = lowcasefirstword.equals(lowcaseseconword);
        System.out.print("Are both words the same?"+ issame);

        
        
    }
}
