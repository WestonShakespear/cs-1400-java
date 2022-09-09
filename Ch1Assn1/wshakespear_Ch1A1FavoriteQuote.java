/**
 * This program just displayed a line with my name and introduction.
 * Then it prints out my favorite quote.
 * 
 * @author westonshakespear
 * @version Fall 2022
 */
public class Ch1A1FavoriteQuote {

	/**
	 * This is the main method.  The style checker likes to be sure you have some text
	 * describing your program here.  This text is just for humans, and isn't code.
	 * 
	 * 
	 * @param args These are not used in this program.  The style checker likes you to specify that.
	 * We will learn about how to make these parameters actually useful this semester.
	 */
	public static void main(String[] args) {
		// This program should be super easy - just a few print lines here
		// I left out a space before this comment so you could be sure your style check was working

		String quote = "\"Here's to the crazy ones. The misfits. "
				+
				"The rebels. The troublemakers. "
				+
				"The round pegs in the square holes. "
				+
				"The ones who see things differently. They're not fond of rules. "
				+
				"And they have no respect for the status quo. You can quote them, "
				+
				"disagree with them, glorify "
				+
				"or vilify them. About the only thing you can't do is "
				+
				"ignore them. Because they change things. "
				+
				"They push the human race forward. And while "
				+
				"some may see them as the crazy ones, we see genius. "
				+
				"Because the people who are crazy enough to think "
				+
				"they can change the world, are the ones who do.\"";

		System.out.println("This is the favorite quote of Weston Shakespear");
		System.out.println(quote);
	}

}
