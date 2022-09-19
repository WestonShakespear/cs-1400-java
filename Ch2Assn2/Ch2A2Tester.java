import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
public class Ch2A2Tester {


    /**
     * This is a general purpose method to check programs so I don't have to copy and paste as much.
     * @param out The temporary output file
     * @param exp The file with the expected input
     * @param answer the System.out from the program
     */
    private static void checkProgram(String out, String exp, String answer) {

        try {
            Formatter out1 = new Formatter(out);
            out1.format(answer);
            out1.close();

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

            Process pr = rt.exec(compareCommand + " " + exp + " " + out + " ");
            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            int exitVal = pr.waitFor();
            String s = "";
            String tmp = input.readLine();
            while (tmp != null) {
                s += tmp + System.lineSeparator();
                tmp = input.readLine();
            }

            rt.exec(delCommand + " " + out).waitFor();

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
     * This method checks the output from the program.
     */
    public static void ch2A2BMICalculator() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
        InputStream in = System.in;

        InputStream stream = new ByteArrayInputStream("220 5 11".getBytes());
        System.setIn(stream);

        Ch2A2BMICalculator.main(null); // Main method from other file
        String answer = baos.toString();
        checkProgram("Your_Output.txt", "Ch2A2BMICalculator220_5_11.txt", answer);

        baos.reset();
        stream = new ByteArrayInputStream("144 5 5".getBytes());
        System.setIn(stream);
        Ch2A2BMICalculator.main(null); // Main method from other file
        answer = baos.toString();
        checkProgram("Your_Output.txt", "Ch2A2BMICalculator144_5_5.txt", answer);
        
        
        baos.reset();
        stream = new ByteArrayInputStream("120 4 11".getBytes());
        System.setIn(stream);
        Ch2A2BMICalculator.main(null); // Main method from other file
        answer = baos.toString();
        checkProgram("Your_Output.txt", "Ch2A2BMICalculator120_4_11.txt", answer);

        System.setOut(ps);
        System.setIn(in);
        baos.reset();

    }

    /**
     * This program is used to test your first assignment.
     * 
     * 
     * @param args These are not used in this program.
     */
    public static void main(String[] args) {
        System.out.println("Starting tests");
        System.out.println("\tI have done my best to make only running this file "
                + "helpful for you in completing your assignment :)");
        System.out.println();


        System.out.println("Checking Ch2A2BMICalculator");
        ch2A2BMICalculator();
        System.out.println("Finished checking Ch2A2BMICalculator");


        System.out.println("Ending tests");
    }

}
