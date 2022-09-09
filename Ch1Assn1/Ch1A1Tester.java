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
public class Ch1A1Tester {

    /**
     * This method checks the output of the FavoriteQuote program.
     * 
     */
    public static void checkFavoriteQuoteOutput() {
        // This changes the output from the console into something my code can check
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
        Ch1A1FavoriteQuote.main(null); // Main method from other file
        String answer = baos.toString();
        baos.reset();
        System.setOut(ps);
        String[] theLines = answer.split(System.lineSeparator());

        if (theLines.length != 2 || !answer.startsWith("This is the favorite quote of ")) {
            System.err.print("Error with Favorite Quote " + System.lineSeparator());
            System.err.println("\tExpecting at least 2 lines of text, "
                    + "and for the starting string to match exactly what is specified in the assignment");
        }
    }


    /**
     * This method checks the output from the program.
     */
    public static void checkGoSUUMethod() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));

            PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
            Ch1A1GoSUU.main(null);
            String answer = baos.toString();
            System.setOut(ps);
            baos.reset();
            String filename1 = "Your_GoSUU_Output.txt";
            String filenameExp = "GoSUU.txt";
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
     * This program is used to test your first assignment.
     * 
     * 
     * @param args These are not used in this program.
     */
    public static void main(String[] args) {
        System.out.println("Starting tests for Chapter 1 Assignment 1");
        System.out.println("\tI have done my best to make only running this file "
                + "helpful for you in completing your assignment :)");
        System.out.println();


        System.out.println("Checking FavoriteQuote");
        checkFavoriteQuoteOutput();
        System.out.println("Finished checking FavoriteQuote");

        System.out.println("Checking GoSUU");
        checkGoSUUMethod();
        System.out.println("Finished checking GoSUU");
        System.out.println("Ending tests");
    }

}
