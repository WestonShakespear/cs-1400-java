import java.util.Scanner;

/**
 * This program assigns teams.
 * @author westonshakespear
 * @version Fall 2022
 *
 */
public class Ch2A3TeamAssignment {

    /**
     * This is the main function. 
     * @param args No arguments.
     */
    public static void main(String[] args) {
    	// Display the text: Assign Teams Program
    	// Ask: How many players are there in total?
    	// Get the user's input as an integer
    	// Ask: How many teams do you want?
    	// Get the user's input as an integer
    	// Calculate the number of teams
    	// Calculate the number of players without a team
    	// Display the text: Automatic calculations follow
    	// Display the text: There will be <yourNumber> teams and <yourSecondNumber> player(s) without a team

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Assign Teams Program");
    	System.out.println("How many players are there in total?");
    	int totalPlayers = scan.nextInt();
    	
    	System.out.println("How many teams do you want?");
    	int totalTeams = scan.nextInt();
    	
    	int teamNumber = totalPlayers / totalTeams;
    	int teamRemainder = totalPlayers % totalTeams;
    	
    	System.out.println("Automatic calculations follow");
    	System.out.print("There will be ");
    	System.out.print(teamNumber);
    	System.out.print(" teams and ");
    	System.out.print(teamRemainder);
    	System.out.println(" player(s) without a team");
    	
    	scan.close();
    }

}
