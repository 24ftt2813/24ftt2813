import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Random;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        String upname = name.toUpperCase();

        Random rand = new Random();
        int qnum = rand.nextInt(100) + 1;

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = ldt.format(dtf);
        
        String filename2 = "C:/Practical 5/QReceipt.txt";
        FileWriter  fw2 = new FileWriter(filename2);
        BufferedWriter bw = new BufferedWriter(fw2);

        bw.write(formattedDateTime + "\n");
        bw.write("Hi, " + upname + "\n");
        bw.write("Your Queue No is: " + qnum + "\n");
        bw.close();

        System.out.println("Receipt generated. Thank YOu");


    }
}
