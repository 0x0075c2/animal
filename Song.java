/*
 * CS312 Assignment 1.
 * On my honor, <Lingzhi Yu>, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Lingzhi Yu	
 *  email address: yulingzhi@utexas.edu
 *  UTEID: ly5248
 *  Section 5 digit ID: 50724
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

public class Song {


	// print out the lyrics of "There was an old woman ... "
	public static void main(String[] args) {
		/* section 1 */
		System.out.println("There was an old woman who swallowed a fly.");
		end();
		/* section 2 */
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		end();
		/* section 3 */
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
		end();
		/* section 4 */
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cat();
		end();
		/* section 5 */
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
		end();
		/* section 6 */
		System.out.println("There was an old woman who swallowed a goat,");
		System.out.println("She just opened her throat to swallow a goat.");
		goat();
		end();
		/* section 7 */
		System.out.println("There was an old woman who swallowed a cow,");
		System.out.println("I don't know how she swallowed a cow.");
		System.out.println("She swallowed the cow to catch the goat,");
		goat();
		end();
		/* section 8 */
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
	public static void end() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}
	
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}
		
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
		cat();
	}
	
	public static void goat() {
		System.out.println("She swallowed the goat to catch the dog,");
		dog();
	}
}
	
		
		
		
		
		
		
	
	
