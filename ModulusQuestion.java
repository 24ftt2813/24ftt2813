import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedWriter;


    public class ModulusQuestion {
        public static void main(String[] args) throws IOException {
            String filename = "C:/Practical 5/Modulus Question.txt";

            FileWriter fw = new FileWriter(filename, true);
            Random random = new Random ();
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            String question = num1 + "%" + num2 + " = ?\n";

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(question);
            bw.close();

            fw.write(random+"\r\n");
            fw.close();


            
            
        }
    }