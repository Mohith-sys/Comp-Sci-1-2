package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/17/2021
 * Write an application that displays the words to the song starting with any day the user enters.
 */
import java.util.Scanner;
public class TwelveDays {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number from 1-12: ");
		int day = in.nextInt();
		
		String num = switch (day) {
		case 1 -> "first";
		case 2 -> "second";
		case 3 -> "third";
		case 4 -> "fourth";
		case 5 -> "fifth";
		case 6 -> "sixth";
		case 7 -> "seventh";
		case 8 -> "eighth";
		case 9 -> "ninth";
		case 10 -> "tenth";
		case 11 -> "eleventh";
		case 12 -> "twelfth";
		default -> "???";
		};
		System.out.println("On the " + num + " day of Christmas my true love gave to me");

		switch(day) {
		case 12:
			System.out.println("Twelve drummers drumming, ");
		case 11:
			System.out.println("Eleven pipers piping, ");
		case 10:
			System.out.println("Ten lords a leaping, ");
		case 9:
			System.out.println("Nine ladies dancing, ");
		case 8:
			System.out.println("Eight maids a milking, ");
		case 7:
			System.out.println("Seven swans a swimming, ");
		case 6:
			System.out.println("Six geese a laying, ");
		case 5:
			System.out.println("Five gold rings, ");
		case 4:
			System.out.println("Four calling birds, ");
		case 3:
			System.out.println("Three French hens, ");
		case 2:
			System.out.println("Two turtle doves and ");
		case 1:
			System.out.println("A partridge in a pear tree");
		}
		
	}
}
