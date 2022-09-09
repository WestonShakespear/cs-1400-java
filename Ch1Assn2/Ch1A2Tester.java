import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Formatter;

/**
 * This program is used to test your assignment.
 * 
 * @author Dr Barker
 * @version 1.0
 *
 */
public class Ch1A2Tester {

    /**
     * This method checks the output from the EscapingCharacters program.
     */
    public static void checkEscapingCharacters() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));

            PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
            Ch1A2EscapingCharacters.main(null); // Main method from other file
            String answer = baos.toString();
            System.setOut(ps);
            baos.reset();
            String filename1 = "Your_EscapingCharacters_Output.txt";
            String filenameExp = "EscapingCharacters.txt";
            Formatter out = new Formatter(filename1);
            out.format(answer);
            out.close();

            String delCommand = null;
            String compareCommand = null;
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                delCommand = "cmd /c del";
                compareCommand = "fc /n";
            } else {
                delCommand = "rm";
                compareCommand = "diff --strip-trailing-cr";
            }
            Runtime rt = Runtime.getRuntime();
            
            Process pr = rt.exec(compareCommand + " " + filenameExp + " " + filename1 + " ");
            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            int exitVal = pr.waitFor();
            String s = "";
            String tmp = input.readLine();
            while (tmp != null) {
                s += tmp + System.lineSeparator();
                tmp = input.readLine();
            }
            
            rt.exec(delCommand + " " + filename1).waitFor();

            if (exitVal != 0) {
                throw new Exception("The output of your program doesn't match exactly: " + System.lineSeparator() + s);
            } 
        } catch (FileNotFoundException e) {
            System.err.println("For some reason we have an error");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This program is used to test your assignment.
     * 
     * 
     * @param args These are not used in this program.
     */
    public static void main(String[] args) {
        System.out.println("Starting tests for Chapter 1 Assignment 2");
        System.out.println("\tI have done my best to make only running this file "
                + "helpful for you in completing your assignment :)");
        System.out.println();


        System.out.println("Checking EscapingCharacters");
        checkEscapingCharacters();
        System.out.println("Finished checking EscapingCharacters");
        System.out.println("Ending tests");
    }

}
