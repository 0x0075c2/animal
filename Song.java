/*
 * CS312 Assignment 1.
 * On my honor, <NAME>, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Lingzhi Yu	
 *  email address: yulingzhi@utexas.edu
 *  UTEID: ly5248
 *  Section 5 digit ID:
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

public class Song {


	// print out the lyrics of "There was an old woman ... "
	public static void main(String[] args) {
		start(); 
		System.out.print(" a fly.");
		System.out.println();
		end();
		System.out.println();
		/* section 1 */
		start();
		System.out.print(" a spider,");
		System.out.println();
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		end();
		System.out.println();
		/* section 2 */
		start();
		System.out.print(" a bird,");
		System.out.println();
		System.out.println("How absurd to swallow a bird.");
		bird();
		spider();
		end();
		System.out.println();
		/* section 3 */
		start();
		System.out.print(" a cat,");
		System.out.println();
		System.out.println("Imagine that to swallow a cat.");
		cat();
		bird();
		spider();
		end();
		System.out.println();
		/* section 4 */
		start();
		System.out.print(" a dog,");
		System.out.println();
		System.out.println("What a hog to swallow a dog.");
		dog();
		cat();
		bird();
		spider();
		end();
		System.out.println();
		/* section 5 */
		start();
		System.out.print(" a goat,");
		System.out.println();
		System.out.println("She just opened her throat to swallow a goat.");
		goat();
		dog();
		cat();
		bird();
		spider();
		end();
		System.out.println();
		/* section 6 */
		start();
		System.out.print(" a cow,");
		System.out.println();
		System.out.println("I don't know how she swallowed a cow.");
		System.out.println("She swallowed the cow to catch the goat,");
		goat();
		dog();
		cat();
		bird();
		spider();
		end();
		System.out.println();
		/* section 7 */
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
	public static void start() {
		System.out.print("There was an old woman who swallowed");
	}
	
	public static void end() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
		
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	
	public static void goat() {
		System.out.println("She swallowed the goat to catch the dog,");
	}
}
	
		
		
		
		
		
		
	
	
