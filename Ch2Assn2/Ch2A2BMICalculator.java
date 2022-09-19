import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program calculates the users bmi.
 * @author westonshakespear
 * @version Fall 2022
 *
 */
public class Ch2A2BMICalculator {

    /**
     * This is the main function.
     * @param args No args.
     */
    public static void main(String[] args) {
        // Display the text: BMI Calculation Program
        // Ask: Please enter your weight rounded to the nearest pound
        // Get the user's input as an integer
        // Ask: Please enter how many feet tall you are.  For example, if you are 5 ft 3 inches tall, enter 5 
        // Get the user's input as an integer
        // Ask: Please enter your remaining height in inches.  For example, if you are 5 ft 3 inches tall, enter 3 
        // Get the user's input as an integer
        // Calculate the weight in kg as a double - Convert using 1 lb as 0.453592 kg
        // Calculate the height in m as a double - Convert using 1 inch as 0.0254 m
        // Calculate the BMI by dividing a person’s weight in kg by the square of their height in m
        // Display the text: Automatic calculations follow
        // Display the text: Your weight in kg rounded to 2 decimals is: <calculatedAnswer>
        // Display the text: Your height in m rounded to 2 decimals is: <calculatedAnswer>
        // Display the text: Your BMI rounded to 2 decimals is: <calculatedAnswer>
        Scanner scan = new Scanner(System.in);
    	
    	System.out.println("BMI Calculation Program");
    	System.out.println("Please enter your weight rounded to the nearest pound");
    	int weight = scan.nextInt();
    	
    	System.out.println("Please enter how many feet tall you are.  "
    			+
    			"For example, if you are 5 ft 3 inches tall, enter 5");
    	int heightFeet = scan.nextInt();
    	
    	System.out.println("Please enter your remaining height in inches.  "
    			+
    			"For example, if you are 5 ft 3 inches tall, enter 3");
    	int heightInches = scan.nextInt();
    	
    	double weightKg = weight * 0.453592;
    	double heightM = ((heightFeet * 12) + heightInches) * 0.0254;
    	double bmi = weightKg / (heightM * heightM);
    	
    	System.out.println("Automatic calculations follow");
    	
    	// I know I could round this out but this seems more fun xD;
    	DecimalFormat df = new DecimalFormat("#.##");
    	
    	System.out.print("Your weight in kg rounded to 2 decimals is: ");
    	System.out.println(df.format(weightKg));
    	
    	System.out.print("Your height in m rounded to 2 decimals is: ");
    	System.out.println(df.format(heightM));
    	
    	System.out.print("Your BMI rounded to 2 decimals is: ");
    	System.out.println(df.format(bmi));
    	
    	scan.close();
    }

}
