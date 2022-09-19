import java.util.Scanner;
/**
 * This program calculates the area and permitter of a rectangle.
 * @author westonshakespear
 * @version Fall 2022
 */

public class Ch2A1PermiterAndArea {

    /**
     * This is the main function.
     * @param args No arguments.
     */
    public static void main(String[] args) {
    	// Display the text: Rectangle Calculation Program
    	// Ask: Please enter the length and width of your rectangle in whole numbers
    	// Get the user's input as integers
    	// Calculate the Area - which is the length times the width
    	// Calculate the Perimeter - which is twice the length plus twice the width
    	// Display the text: Automatic calculations follow
    	// Display the text: Area: <calculatedAnswer>
    	// Display the text: Perimeter: <calculatedAnswer>
    	Scanner kb = new Scanner(System.in);
    
    	System.out.println("Rectangle Calculation Program");
    	
    	System.out.println("Please enter the length and width of your rectangle in whole numbers");
    	
    	int length = kb.nextInt();
    	
    	int width = kb.nextInt();
    	
    	System.out.println("Automatic calculations follow");
    	
    	
    	System.out.print("Area: ");
    	System.out.println(length * width);
    	
    	System.out.print("Perimeter: ");
    	System.out.println((2 * length) + (2 * width));
    	
    	kb.close();
    	
    }

}
