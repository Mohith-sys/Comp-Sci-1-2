package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/11/2021
 * Java program that finds if the user given integer belongs to which category:
 * Positive and Even number
 * Positive and Odd number
 * Negative and Even Number
 * Negative and Odd Number
 * Remember, use logical “and” to receive full credit.
 */
import java.util.Scanner;
public class PositiveEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		int remainder = number % 2;
		
		if (number > 0 && remainder == 0)
			System.out.println("The number is positive and even.");
		else if (number > 0 && remainder == 1)
			System.out.println("The number is positive and odd.");
		else if (number < 0 && remainder == 0)
			System.out.println("The number is negative and even.");
		else if (number < 0 && remainder == -1)
			System.out.println("The number is negative and odd.");
		else if (number == 0)
			System.out.println("The number is zero and it is even.");
		
	}

}
