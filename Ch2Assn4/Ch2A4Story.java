import java.util.Scanner;

/**
 * This program creates a madlib story with input strings.
 * @author westonshakespear
 * @version Fall 2022
 */
public class Ch2A4Story {

	/**
	 * Program main.
	 * @param args No arguments.
	 */
	public static void main(String[] args) {
		// Display the text: The Odyssey Online Mad Lib
		// Display the text: Please enter a college name:
		// Display the text: Please enter an adjective:
		// Display the text: Please enter the name of a body part:
		// Display the text: Please enter the name of an object:
		// Display the text: Please enter the name of an illegal drug:
		// Display the text: Please enter an action:
		// Display the text: Please enter an adjective:
		// Display the text: Please enter the name of a body part:
		// Display the text: Please enter the name of a place on a college campus:
		// Display the text: Please enter the name of an animal:
		// Display the text: Please enter the name of a curse word:
		// Display the text: Please enter a number:
		// Display the text: Please enter the name of a kitchen appliance:
		// Display the text: Please enter the name of one of the Kardashians:

		// Get the user's input for each of the above items as a string when you ask for them
		// - even the number just to make it easier
		// oh, and let's assume the input could be an entire line for every answer, intead of just a single word

		// Display the text: Your story follows:
		// Display the text that follows with all the information above inserted into the correct locations
		// Oh, and there should be no line breaks on the output -
		// but you will totally need to break this up for the style checker :)
		// It was the one night everybody dreads, the night before hell week starts - AKA finals week - at (col
		// lege name). The library was full of (adjective) students all glued to their books and (body part) d
		// eep in energy drink cans and empty coffee cups. One desperate student even had the guts to sneak i
		// n a(n) (object). As expected, I couldn't find a decent place to sit so I had to sit next to the du
		// de who smelled like (illicit drug name). I began to (action) (adjective). Finally, at around 5 a.
		// m. Monday morning I started wandering back to my dorm room, but my (body part) was so exhausted t
		// hat I decided to crash at (place on campus). I was awoken 5 hours later by a not so friendly (ani
		// mal) who was gnawing on my notes. "(favorite curse word)! I'm late for my first final!" I yelle
		// d. I ran to class as fast as I could, but when I got there and saw no one in class, I realize
		// d that my first final was actually a week ago and it was not Monday at all. In fact, it was Fri
		// day and not only did I miss all of my finals, but I've been going to the wrong school for (nu
		// mber) years and am actually a(n) (kitchen appliance). "Oh well," I sighed. "At least I'll al
		// ways be smarter than (name of one of the Kardashians)."

		Scanner scan = new Scanner(System.in);

		System.out.println("The Odyssey Online Mad Lib");

		String prefix = "Please enter ";
		String[] inputPrompts = {
				"a college name",
				"an adjective",
				"the name of a body part",
				"the name of an object",
				"the name of an illegal drug",
				"an action",
				"an adjective",
				"the name of a body part",
				"the name of a place on a college campus",
				"the name of an animal",
				"the name of a curse word",
				"a number",
				"the name of a kitchen appliance",
				"the name of one of the Kardashians"
		};
		
		String[] story = {
				"It was the one night everybody dreads, "
				+
				"the night before hell week starts - AKA finals week - at ",
				". The library was full of ",
				" students all glued to their books and ",
				" deep in energy drink cans and empty coffee cups. One "
				+
				"desperate student even had the guts to sneak in a(n) ",
				". As expected, I couldn't find a decent place to sit "
				+
				"so I had to sit next to the dude who smelled like ",
				". I began to ",
				" ",
				". Finally, at around 5 a.m. Monday morning I sta"
				+
				"rted wandering back to my dorm room, but my ",
				" was so exhausted that I decided to crash at ",
				". I was awoken 5 hours later by a not so friendly ",
				" who was gnawing on my notes. \"",
				"! I'm late for my first final!\" I yelled. I ran to "
				+
				"class as fast as I could, but when I got there and saw no "
				+
				"one in class, I realized that my first final was actually "
				+
				"a week ago and it was not Monday at all. In fact, it was Fr"
				+
				"iday and not only did I miss all of my finals, but I've been "
				+
				"going to the wrong school for ",
				" years and am actually a(n) ",
				". \"Oh well,\" I sighed. \"At least I'll always be smarter than ",
				".\""

		};
		String[] userInput = {"", "", "", "", "", "", "", "", "", "", "",  "", "", ""};

		for (int i = 0; i < inputPrompts.length; i++) {
			System.out.println(prefix + inputPrompts[i] + ":");
			userInput[i] = scan.nextLine();
		}

		for (int i = 0; i < inputPrompts.length; i++) {
			System.out.print(story[i]);
			System.out.print(userInput[i]);
		}
		System.out.println(story[story.length - 1]);
	}

}
