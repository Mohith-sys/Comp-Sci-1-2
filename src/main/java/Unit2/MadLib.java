package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 3/5/2021
 * Create a Mad Libs program that asks the user to provide at least five words, then create and display a short 
 * story or nursery rhyme that uses them.
 */
import java.util.Scanner;
public class MadLib {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an Holiday: ");
		String holiday = in.nextLine();
		System.out.println("Enter an Noun: ");
		String noun = in.nextLine();
		System.out.println("Enter an Adjective: ");
		String adj = in.nextLine();
		System.out.println("Enter an Verb: ");
		String verb = in.nextLine();
		System.out.println("Enter an Adjective: ");
		String adj1 = in.nextLine();
		System.out.println("Enter an Noun: ");
		String noun1 = in.nextLine();
		System.out.println("Enter an Food: ");
		String food = in.nextLine();
		
		System.out.println("I can't believe its already " + holiday + "!\nThis year I am going to dress up as a "
				+ noun + " with " + adj + " eyes.\nBefore I " + verb + ", I make sure to grab my " + adj1 + " "
				+ noun1 + " to hold all of my " + food + ".");
	}
	
}
