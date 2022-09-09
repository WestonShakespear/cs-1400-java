/**
 * This program prints out my initials in ascii art.
 * @author westonshakespear
 * @version Fall 2022
 *
 */

public class Ch1A2PrintInitials {

    /**
     * This is my main function.
     * @param args No args.
     * 
     */
    public static void main(String[] args) {
        /*
         * This program should print out your initials (If you don't have a middle name, make one up!)
         * It currently prints A, B, and C vertically, but I would like your initials all on the same line 
         * 
         */

        String[] initials = 
        {
			"W   W RRRR   SSSS",
			"W   W R   R S",
			"W   W RRRR   SSS",
			"W   W R   R     S",
			"W W W R   R     S",
			"WW WW R   R S   S",
			"W   W R   R  SSS"
        };
        
        for (int i = 0; i < initials.length; i++) {
        	System.out.println(initials[i]);
        }


    }

}
