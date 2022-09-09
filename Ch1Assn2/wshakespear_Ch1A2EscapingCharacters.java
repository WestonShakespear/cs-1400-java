/**
 * This program prints out some characters that need escaping and a quote.
 * 
 * @author westonshakespear
 * @version Fall 2022
 *
 */

public class Ch1A2EscapingCharacters {

    /**
     * This is the main function of the program.
     * @param args Ther are no arguments.
     * 
     */
    public static void main(String[] args) {
    	System.out.println("/ Dr. B's \"Java Class\" Rocks \\");
    	System.out.println();
    	
    	String quote = "\"There will be no foolish wand-waving or silly incantations in this class.\r\n"
    			+
    			"As such, I don't expect many of you to appreciate the subtle science and "
    			+
    			"exact art that is potion-making.\r\n"
    			+
    			"However, for those select few who possess the predisposition,\r\n"
    			+
    			"I can teach you how to bewitch the mind and ensnare the senses.\r\n"
    			+
    			"I can tell you how to bottle fame, brew glory, and even put a stopper in death.\r\n"
    			+
    			"Then again, maybe some of you have come to Hogwarts in possession of abilities\r\n"
    			+
    			"so formidable that you feel confident enough to not pay attention!\"\r\n"
    			+
    			" - Professor Severus Snape";
    	System.out.println(quote);
    }

}
